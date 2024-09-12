# Robus
  - it's Capability to handle exceptions
  - `Java's robustness:` Prioritized in its design to ensure reliable execution across various systems.
  - `Strict type checking:` Helps catch errors early in development.
  - `Memory management:` Automated by Java to prevent common mistakes.
  - `Exception handling:` Provides a structured way to manage run-time errors.
  - `Predictable behavior:` Java's design ensures reliable execution under diverse conditions.

# Fattol Error 
  - in Java are severe runtime exceptions that typically result in the termination of the JVM

# Exception Handling

# System Defined Exception
# User Define Exception


  - JAVA Provides `3 blocks` and `2 keywords` (for exception)
    ## 1) try{}
      - Code You Think will have issue

    ## 2) catch{}
      - notification in case there is issue
    ## 3) finaly{}
      - it is an optional block
      - it does not depends on exception
      - it use to cleanup system
      - it always execute 
    ## 4) throw
      - it used to throw an exception system defined or user defined
       ```java
         throw new ExceptionClassName(); 
       ``` 
    ## 5) throws
      - used to throw a system/user defined Exception at time of call method
    ```java
    public void methodName () throws ExceptionCalss1,exceptionClass_n{
      condition{
        throw new ExceptionClassName();  
      }
    }
    ```


# final Keyword
 - ## Define for Variable
    - it can be constant
    ```java
    final a = 10;
    ```
  - ## Define with method
    - it can not `override` the method
      ```java
      final void show(){}
      ``` 
  - ## define with class
    - Can not Create Child class
    ```java
    final class ClassName{}
    ```

# finalize() 
  - used to distroy Object
  - it is a built in method

