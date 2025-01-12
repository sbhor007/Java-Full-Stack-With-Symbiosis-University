# 1) Immutable String in Java:
- A `String` is an unavoidable type of variable while writing any application program. String references are used to store various attributes like username, password, etc.
- In Java, `String` objects are immutable. Immutable simply means unmodifiable or unchangeable.
- In Java, `String` objects are immutable. Immutable simply means unmodifiable or unchangeable.

# 2) Array and Arrays in Java:
- An array is a data structure that stores a fixed-size collection of elements of the same data type, while `Arrays` is a utility class in the `java.util` package that provides various static methods for manipulating arrays.
- `Arrays` class provides methods for sorting, searching, filling, comparing, and converting arrays. `Arrays` class cannot be used to create new arrays, but it can be used to perform various operations on existing arrays.

# 3) Overriding `equals()` and `hashCode()` in the context of the Collection Framework:

## i) `equals()`
- The `java equals()` is a method of `java.lang.Object` class, and it is used to compare two objects.
- To compare two objects that whether they are the same, it compares the values of both the object's attributes.
- By default, two objects will be the same only if stored in the same memory location.
- **Syntax**: `public boolean equals(Object obj)`

## ii) `hashCode()`
- A `hashcode` is an integer value associated with every object in Java, facilitating the hashing in hash tables.
- To get this `hashcode` value for an object, we can use the `hashCode()` method in Java. It is the means `hashCode()` method that returns the integer hashcode value of the given object.
- Since this method is defined in the `Object` class, it is inherited by user-defined classes also.
- The `hashCode()` method returns the same hash value when called on two objects, which are equal according to the `equals()` method. And if the objects are unequal, it usually returns different hash values.
- **Syntax**: `public int hashCode()`

# 4) Database Connectivity in Java:
- **Import Packages**: Import required SQL packages (`java.sql.*`) to use JDBC classes like `Connection`, `Statement`, `ResultSet` for database operations.
- **Load Driver**: Register database driver class. Modern JDBC versions auto-load drivers. Example: `Class.forName("com.mysql.cj.jdbc.Driver")`.
- **Establish Connection**: Create a database connection using `DriverManager.getConnection(url, username, password)`. URL specifies database location and credentials for access.
- **Create Statement**: Create `Statement/PreparedStatement` object from connection to execute SQL queries. `PreparedStatement` prevents SQL injection attacks.
- **Execute Queries**: Use `executeQuery()` for `SELECT`, `executeUpdate()` for `INSERT/UPDATE/DELETE`. Returns `ResultSet` for `SELECT`, row count for others.
- **Process Results**: Use `ResultSet` methods (`getString`, `getInt`) to retrieve data from query results. Loop through results using `rs.next()`.
- **Close Resources**: Close all database resources (`ResultSet`, `Statement`, `Connection`) in reverse order to prevent memory leaks.

# 5) Interfaces in Java: Types and Advanced Features
- An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. Classes and interfaces can implement multiple interfaces, enabling a form of multiple inheritance.

## Types:
- **Normal Interface**: Contains only abstract methods (implicitly public and abstract). A class that implements the interface must provide implementations for all its methods.
- **Marker Interface**: An interface with no methods or fields. It is used to mark or tag a class with a specific property. Example: `Serializable`, `Cloneable`, etc.
- **Functional Interface**: An interface with exactly one abstract method, typically used in lambda expressions. Can have multiple default or static methods. Example: `Runnable`, `Comparator`, etc.
- **Default Interface**: Introduced in Java 8, allows interfaces to have default method implementations. Default methods enable backward compatibility while adding new methods to an interface.

## Features:
- **Multiple Inheritance**.
- **Inheritance in Interfaces**.
- **Default Method Conflict Resolution**.
- **Private Methods in Interfaces (Java 9+)**.

# 6) MySQL Data Types: `Char`, `Varchar`, and `Nvarchar`:

## i) `Char`:
- `Char` is a fixed-length character data type.
- `Char` always stores the specified number of characters, padding with spaces if the actual string is shorter.
- `Char` is best suited for storing values that are always the same length, such as country codes, gender, or ZIP codes.

## ii) `Varchar`:
- `Varchar` is a variable-length character data type.
- The length of the column is specified when the table is created, and it can store strings up to that length.
- `Varchar` only stores the actual number of characters in the string, without any padding.

## iii) `Nvarchar`:
- `Nvarchar` is a variable-length Unicode character data type.
- It is similar to `Varchar`, but it stores Unicode characters, which can represent a wider range of characters, including non-Latin scripts.
- The length of the column is specified in number of characters, not bytes.

# 7) Different Types of Joins in MySQL and Different Types of Constraints:

## i) Types of Joins in MySQL:
- **Inner Join**: Returns a result set that contains the common elements between the two tables.
- **Left Join (Left Outer Join)**: Returns all the records from the left table, and the matched records from the right table.
- **Right Join (Right Outer Join)**: Returns all the records from the right table, and the matched records from the left table.
- **Full Join (Full Outer Join)**: Returns all the records when there is a match in either the left or right table.
- **Cross Join**: Returns the Cartesian product of the sets of rows from the two tables.

## ii) Types of Constraints:
- **Primary Key**: Uniquely identifies each row in a table. A table can have only one primary key, which can consist of single or multiple columns.
- **Foreign Key**: Establishes a link between two tables, referencing the primary key of another table.
- **Unique**: Ensures that all values in a column are unique.
- **Not Null**: Ensures that a column cannot have a NULL value.
- **Check**: Ensures that the values in a column satisfy a specific condition.
- **Default**: Provides a default value for a column when no value is specified.

# 8) ACID Properties of Databases:

## i) Atomicity:
- Atomicity ensures that a transaction is treated as a single, indivisible unit of work.
- Either all the operations in the transaction complete successfully, or the transaction is aborted, and the database is restored to its previous state.

## ii) Consistency:
- Consistency ensures that the database remains in a valid state before the start of the transaction and after the completion of the transaction.
- This means that any transaction will bring the database from one valid state to another valid state.

## iii) Isolation:
- Isolation ensures that the execution of a transaction is independent of and invisible to other transactions.
- Transactions are executed as if they are running alone in the system, even if multiple transactions are running concurrently.

## iv) Durability:
- Durability ensures that the changes made by a committed transaction are permanent and survive system failures (e.g., power outages, crashes, or media failures).
- Once a transaction has been committed, the changes it has made to the database persist, even if a system failure occurs.
