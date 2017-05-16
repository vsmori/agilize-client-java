@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  sitback-pc-master startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

@rem Add default JVM options here. You can also use JAVA_OPTS and SITBACK_PC_MASTER_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windowz variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\sitback-pc-master.jar;%APP_HOME%\lib\mssql-jdbc-6.1.0.jre8.jar;%APP_HOME%\lib\firebase-server-sdk-3.0.3.jar;%APP_HOME%\lib\azure-keyvault-0.9.3.jar;%APP_HOME%\lib\google-api-client-gson-1.21.0.jar;%APP_HOME%\lib\json-20160212.jar;%APP_HOME%\lib\google-http-client-gson-1.21.0.jar;%APP_HOME%\lib\guava-jdk5-17.0.jar;%APP_HOME%\lib\gson-2.6.2.jar;%APP_HOME%\lib\azure-core-0.9.3.jar;%APP_HOME%\lib\httpclient-4.3.6.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\adal4j-1.0.0.jar;%APP_HOME%\lib\google-api-client-1.21.0.jar;%APP_HOME%\lib\google-http-client-1.21.0.jar;%APP_HOME%\lib\commons-codec-1.10.jar;%APP_HOME%\lib\commons-lang-2.6.jar;%APP_HOME%\lib\jersey-client-1.13.jar;%APP_HOME%\lib\jersey-json-1.13.jar;%APP_HOME%\lib\httpcore-4.3.3.jar;%APP_HOME%\lib\commons-logging-1.1.3.jar;%APP_HOME%\lib\oauth2-oidc-sdk-4.5.jar;%APP_HOME%\lib\slf4j-api-1.7.5.jar;%APP_HOME%\lib\google-oauth-client-1.21.0.jar;%APP_HOME%\lib\google-http-client-jackson2-1.21.0.jar;%APP_HOME%\lib\jsr305-1.3.9.jar;%APP_HOME%\lib\activation-1.1.jar;%APP_HOME%\lib\jersey-core-1.13.jar;%APP_HOME%\lib\jettison-1.1.jar;%APP_HOME%\lib\jaxb-impl-2.2.3-1.jar;%APP_HOME%\lib\jackson-core-asl-1.9.2.jar;%APP_HOME%\lib\jackson-mapper-asl-1.9.2.jar;%APP_HOME%\lib\jackson-jaxrs-1.9.2.jar;%APP_HOME%\lib\jackson-xc-1.9.2.jar;%APP_HOME%\lib\jcip-annotations-1.0.jar;%APP_HOME%\lib\commons-lang3-3.3.1.jar;%APP_HOME%\lib\json-smart-1.1.1.jar;%APP_HOME%\lib\lang-tag-1.4.jar;%APP_HOME%\lib\nimbus-jose-jwt-3.1.2.jar;%APP_HOME%\lib\jackson-core-2.1.3.jar;%APP_HOME%\lib\stax-api-1.0.1.jar;%APP_HOME%\lib\jaxb-api-2.2.2.jar;%APP_HOME%\lib\bcprov-jdk15on-1.51.jar;%APP_HOME%\lib\stax-api-1.0-2.jar;%APP_HOME%\lib\mail-1.4.7.jar

@rem Execute sitback-pc-master
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %SITBACK_PC_MASTER_OPTS%  -classpath "%CLASSPATH%" com.daose.sitback.SitBack %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable SITBACK_PC_MASTER_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%SITBACK_PC_MASTER_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
