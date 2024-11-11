## Hibernate Project setup
--- reference to the HybernatDelete folder ---
1) Create New Project
2) Create package (e.g - com.trg)
3) inside the package 
    - add POJO classes (customer class)
    - add Driver Class
4) outside the package and inside the src folder create xml files (for hibernate)
    - **stepts of creating `.xml` files**
        - right click on src folder --> go to `new` --> others --> XML --> click to XML File --> then Next --> name of XML file like `hibernate.cfg.xml` --> next --> finish
5) add external `jar` files
    - **steps of adding external jar fils**
      - right click to project --> go for build path --> configure build path --> jar build path --> libraries --> classpath --> add external jar --> apply and close


## hibernate common annotations


9. **`@Entity`**

   - Marks a class as an entity, meaning that Hibernate will map it to a database table.

   ```java
   @Entity
   public class Product {
       // fields, constructors, getters, setters
   }
   ```

10. **`@Table`**

    - use to change the table details
    - Specifies the table in the database that the entity will be mapped to.
    - You can also define additional properties like the schema or the unique constraints.

    ```java
    @Entity
    @Table(name = "product_table", schema = "public")
    public class Product {
        // fields, constructors, getters, setters
    }
    ```

11. **`@Id`**

    - use to mark column as id(`primary key`)
    - Marks a field as the primary key of the entity.

    ```java
    @Entity
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // other fields, constructors, getters, setters
    }
    ```

12. **`@Column`**

    - Can be used to specify column ampping.
    - for example, to change the column name in the associated table in database.
    - Specifies details for the column that corresponds to the field, such as column name, length, nullable, etc.

    ```java
    @Entity
    public class Product {
        @Id
        private Long id;

        @Column(name = "product_name", length = 100, nullable = false)
        private String name;

        // other fields, constructors, getters, setters
    }
    ```

13. **`@GeneratedValue`**

    - Hibernate will automatically generate values for that using an internal sequence. Therefore we don't have to set it manually.
    - Used to specify the strategy for automatically generating the value of the `@Id` field.

    ```java
    @Entity
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)  // AUTO, IDENTITY, SEQUENCE, TABLE
        private Long id;

        // other fields, constructors, getters, setters
    }
    ```

14. **`@Transient`**

    - This tels hibernate not to save this field.
    - the column or filed do not store in a database.
    - Marks a field to be excluded from persistence. Hibernate will not map this field to a column in the database.

    ```java
    @Entity
    public class Product {
        @Id
        private Long id;

        @Transient
        private String tempData;  // This field will not be persisted

        // other fields, constructors, getters, setters
    }
    ```

15. **`@Temporal`**

    - Specifies the date/time format for `java.util.Date` or `java.util.Calendar` fields, indicating whether it should store just the `DATE`, `TIME`, or both (`TIMESTAMP`).

    ```java
    @Entity
    public class Event {
        @Id
        private Long id;

        @Temporal(TemporalType.DATE)  // Only the date part will be stored
        private Date eventDate;

        // other fields, constructors, getters, setters
    }
    ```

16. **`@Lob`**
    - @Lob tells hibernate that this is a large object, not a simple object.
    - for example store images
    - Used to specify that a field should be treated as a large object (e.g., a `BLOB` or `CLOB` in the database). Typically used for storing large amounts of binary or text data like images or large text fields.


    ```java
    @Entity
    public class Product {
        @Id
        private Long id;

        @Lob
        @Column(name = "product_image")
        private byte[] image;  // Large binary data

        // other fields, constructors, getters, setters
    }
    ```

