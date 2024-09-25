## JDBC
- Database Connection
- sql queries
- menu driven programs

### Connection
```Java
 Connection con;
```
- `Connection` This is an interface in Java’s JDBC (Java Database Connectivity) API, which represents a connection to a specific database

### MySql URL
```java
	String mysqlUrl = "jdbc:mysql://localhost/santoshDB?useSSL=false";
```
- holds the URL for connecting to a MySQL database.
- **JDBC URL Format**:
  - **`jdbc:mysql://`** :  indicates that this is a JDBC connection to a MySQL database.
  - **`localhost`** :  refers to the database server running on the local machine (the same machine where the code is executed).
  - **`/santoshDB`** :  specifies the name of the database you want to connect to 
  - **`?useSSL=false`** : is a connection parameter that indicates whether SSL should be used for the connection. Setting it to false disables SSL, which is often done for simplicity during development.

### Database Connection
- MySql connection using DriverManager
```Java
//con = DriverManager.getConnection(mysqlUrl, username, password);
con = DriverManager.getConnection(mysqlUrl, "root", "mysql80");
```

### Statement
- it is used to execute SQL queries against the database
```java
Statement smt = con.createStatement();
```
### SQL Query
```Java
String query = "Query..."
```

### Exicution of Query
```java
n = smt.executeUpdate(query);
```
**`executeUpdate`** : returns the number of rows affected

### Check Result
```java
if (n > 0) {
//message 
}
```
- If the value of n is greater than zero, it indicates that a record was successfully inserted into the database
