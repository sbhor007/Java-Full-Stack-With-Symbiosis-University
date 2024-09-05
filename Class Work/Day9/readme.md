# Polymorphism :
* Many Forms of an Object 
* without loosing identity to perform multiple forms is called as Polymorphism  * 
  ## Types : 
    - `1) Static / compile time Polymorphism`
        - function/ method/constructor overloading
        - function/ method/constructor overriding
    - `2) Dynamic / runtime Polymorphism`
        - Interfaces and abstract class

# Interface and Abstraction
* ## Abstraction
    - it access with limitations
    - do not created any object
    - without inheritance do not implement its facility
    - Abstract Classes provides 80% abstraction
* ## Interface
    - It provides 100% abstraction
    - `interface` is a keyword to define it
    - Interface have method which are not `private` and `protected`
    - it's method do not have any implementation
    - it use to define `System rules`
    - it don't have any object creation
    - do not contain `instance or state` variable
    - it can contain `static members / final` variable
    - its does not contain any method body
    - All methods in a Interface need to be implemented by child class
    - `syntax`
    ```java

        interfaceName {} // define interface


        // implements interface
        class className implements interfaceName{}  
    ```

    - `implements` -> it Represent the `IS-A` relationship between a classes

 # vergas argument
- varargs allow a method to accept a variable number of arguments
- This is achieved by declaring a method parameter with an ellipsis (...) followed by the data type.
```java
public static int sumNumbers(int... numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}
```

