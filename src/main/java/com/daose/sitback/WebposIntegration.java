package com.daose.sitback;

import static org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by vitor on 15/05/17.
 */
public class WebposIntegration {
    private static String retail_id      = "18712"; // <-- ID of the sample retailer
    private static String retail_email   = "12312@agilizeapp.com";
    private static String retail_user_id = null;
    private static String retail_pwd     = "OtiF8p^0Spk^";
    private static String tip_amount     = .1;      // <-- If retailer has tips
    private static String convenienceTax = 0.00;    // <-- If retailer charges convenience tax


}

/*
        Firebase.initializeApp(config.firebaseConfig);

        Firebase.auth().signInWithEmailAndPassword(retail_email, retail_pwd).then(function(result) {
        try {
        retail_user_id = Firebase.auth().currentUser.uid;
        console.log("signInWithCredential Success - User is "+retail_user_id);
        connection.connect();
        inbox  	  = new Firebase.database().ref(sprintfjs.sprintf(config.realtimedbConfig.urls.commInbox,retail_id));
        inbox.orderByChild("start_client_date_time").limitToFirst(1).on("child_added", function(snapshot) {
        if (snapshot.val() == null) return;
        console.log("Received request " + snapshot.val().key);
        key   = snapshot.val().key;
        data  = snapshot.val();
        getBill();
        });
        } catch (e) {
        console.log(err);
        process.exit(1);
        }
        }).catch(function(error) {
        console.log("signInWithCredential Error - "+error.code + ": " + error.message);
        process.exit(1);
        });

        function getBill() {
        try {
        connection.query('SELECT * from suspended_sales where hold_ref = '+data.tableOrCard, processBillResult);
        } catch (e){
        process.exit(1);
        }
        }

        function processBillResult(err, rows, fields) {
        try {
        if (err) return returnError('Err001',err);
        if (!rows) return returnError('Err002',"!rows");
        if (rows.length == 0) return returnBillNoData();

        data.response = {
        status  : 1,
        message : "success",
        data    : {
        place_id      : retail_id,
        place_user_id : retail_user_id,
        bill : {
        key               : data.key,
        tableOrCard       : data.tableOrCard,
        peopleCount       : 1,
        items             : [],
        total             : 0.00,
        paid              : 0.00,
        unpaid            : 0.00,
        perPerson         : 0.00,
        tips       		  : 0.00,
        convenienceTax    : convenienceTax
        }
        }
        };

        getItems();
        } catch (e){
        process.exit(1);
        }
        }

        function getPayments() {
        try {
        connection.query('SELECT * from pagamento where id_suspended_sales = '+data.tableOrCard, processPaymentsResult);
        } catch (e){
        process.exit(1);
        }
        }

        function processPaymentsResult(err, rows, fields) {
        try {
        if (err) return returnError('Err003',err);
        if (!rows) return returnError('Err004',"!rows");
        if (rows.length > 0) {
        paid = 0;
        for (var i=0; i<rows.length; i++) {
        paid += rows[i].valor_pago;
        }
        }
        data.response.data.bill.paid      = paid;
        data.response.data.bill.paidStr   = paid.formatMoney('R$', 2, ',', '.');
        getItems();
        } catch (e){
        process.exit(1);
        }
        }

        function getItems(suspend_id) {
        try {
        connection.query('SELECT * from suspended_items where suspend_id = (SELECT max(id) from suspended_sales where hold_ref = '+data.tableOrCard+')', processBillItemsResult);
        } catch (e){
        process.exit(1);
        }
        }

        function processBillItemsResult(err, rows, fields) {
        try {
        if (err) return returnError('Err005',err);
        if (!rows) return returnError('Err006',"!rows");
        if (rows.length == 0) return returnBillNoData();
        data.response.data.bill.items = [];
        for (var i=0; i<rows.length; i++) {
        data.response.data.bill.items.push({
        id      : rows[i].product_id,
        desc    : rows[i].product_name,
        quantity: rows[i].quantity,
        price   : rows[i].gross_total+0,
        priceStr: (rows[i].gross_total+0).formatMoney('R$', 2, ',', '.'),
        total   : rows[i].gross_total+0,
        totalStr: (rows[i].gross_total+0).formatMoney('R$', 2, ',', '.')
        });

        data.response.data.bill.total += rows[i].gross_total;
        data.response.data.bill.totalStr = data.response.data.bill.total.formatMoney('R$', 2, ',', '.');
        }

        data.response.data.bill.unpaid    = data.response.data.bill.total - data.response.data.bill.paid;
        data.response.data.bill.unpaidStr = data.response.data.bill.unpaid.formatMoney('R$', 2, ',', '.');
        data.response.data.bill.tips      = data.response.data.bill.unpaid*tip_amount;
        data.response.data.bill.tipsStr   = data.response.data.bill.tips.formatMoney('R$', 2, ',', '.');

        returnBillData();
        } catch (e){
        process.exit(1);
        }
        }

        function returnBillData() {
        try {
        data.response.status  = 1;
        data.response.message = "success";
        respond();
        } catch (e){
        process.exit(1);
        }
        }

        function returnBillNoData() {
        try {
        data.response = {};
        data.response.status  = 0;
        data.response.message = "No data";
        respond();
        } catch (e){
        process.exit(1);
        }
        }


*/

    public static void returnError(String error_code, String error_message) {
        try {
            data.response = {};
            data.response.status  = -1;
            data.response.message = error_code+' - '+error_message;
            respond();
        } catch (e){
            process.exit(1);
        }
     }


    public static void respond(Object data) {
        try {
            String ref               = sprintf(config.realtimedbConfig.urls.commOutbox,data.customer,retail_id);
            DatabaseReference outbox = new FirebaseDatabase.getInstance().getReference();
            outbox.setValue(data, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                    if (databaseError != null) return;
                    //inbox.remove(); <-- will not remove. responsible will be the other site
                }
            });
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}