# java-tools

## Examples

### Debug SSL/TLS connection
java -Djavax.net.debug=ssl SSLPoke www.biblioimages.com 443

### Print accepted client-side SSL/TLS ciphers
/usr/lib/jvm/java-7-oracle/bin/java Ciphers

### Print accepted server-side SSL/TLS ciphers
bash check_ssl.sh

### Print loaded classes (default)
java -verbose:class Simple

### Print loaded classes (with external jar)
java -verbose:class -cp "sqljdbc4.jar:." MSSQLConnect

### Debug SSL/TLS MSSQL connection
java -Djavax.net.debug=ssl -verbose -cp "sqljdbc4.jar:." MSSQLConnect

### Extract SQLServerDriver from ACS war files
jar -xf /var/lib/tomcat8/webapps/admin.war WEB-INF/lib/sqljdbc4.jar

### Examples

java -Djavax.net.debug=ssl SSLPoke www.biblioimages.com 443
java -Djavax.net.debug=ssl -Dsun.security.ssl.allowUnsafeRenegotiation=true SSLPoke www.biblioimages.com 443
java -Djavax.net.debug=ssl SSLPoke www.biblioimages.com 443 
java -Dhttps://cipherSuites=TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA -Djavax.net.debug=ssl:handshake SSLPoke www.biblioimages.com 443
java -Dhttps.cipherSuites=TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA -Djavax.net.debug=ssl:handshake SSLPoke www.biblioimages.com 443
java -Dhttps.cipherSuites=TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA -Djavax.net.debug=ssl:handshake:verbose SSLPoke www.biblioimages.com 443
java -Djdk.certpath.disabledAlgorithms=MD2 -Djavax.net.debug=ssl:handshake:verbose SSLPoke www.biblioimages.com 443
java -Djdk.certpath.disabledAlgorithms="MD2" -Djavax.net.debug=ssl:handshake:verbose SSLPoke www.biblioimages.com 443
java -Djava.security.properties="override.java.security" -Djavax.net.debug=ssl:handshake:verbose SSLPoke www.biblioimages.com 443
java -Djavax.net.debug=ssl:handshake SSLPoke www.biblioimages.com 443
java -Djavax.net.debug=ssl SSLPoke auth.api.rackspacecloud.com 443

## References

https://docs.microsoft.com/en-us/sql/connect/jdbc/building-the-connection-url?view=sql-server-2017
https://docs.microsoft.com/en-us/sql/connect/jdbc/connection-url-sample?view=sql-server-2017
https://docs.oracle.com/cd/E11882_01/appdev.112/e13995/oracle/jdbc/OracleDriver.html
https://stackoverflow.com/questions/17775092/running-a-simple-jbdc-program-from-command-prompt
https://docs.oracle.com/javase/tutorial/jdbc/basics/connecting.html
https://tomcat.apache.org/tomcat-7.0-doc/class-loader-howto.html
https://www.chilkatsoft.com/java-classpath-Linux.asp
https://stackoverflow.com/questions/15241960/com-microsoft-sqlserver-jdbc-sqlserverdriver-not-found-error
https://stackoverflow.com/questions/2451892/how-do-i-connect-to-a-sql-server-2008-database-using-jdbc
https://www.programcreek.com/2014/01/compile-and-run-java-in-command-line-with-external-jars/
https://www.microsoft.com/en-us/sql-server/developer-get-started/java/ubuntu/step/2.html
https://docs.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-2017
https://stackoverflow.com/questions/19047414/java-program-to-connect-to-sql-server-and-running-the-sample-query-from-eclipse
https://docs.microsoft.com/en-us/sql/connect/jdbc/connecting-with-ssl-encryption?view=sql-server-2017
