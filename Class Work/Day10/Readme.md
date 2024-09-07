# Relationship In Java
### Types of Relationship
  - USES-A Relationship
  - HAS-A Relationship
      - Aggregation
      - Composition
  - IS-A Relationship

    ## Example
` USES-A Relationship`
```java
class A
{
//.....
}
class B
{
  void display()
  {
    A obj = new A();
  }
}
```

` HAS-A Relationship`
```java
class A
{
//.....
}
class B
{
  A obj = new A();
  void display()
  {
    //.....
  }
S}
```
` IS-A Relationship`
```java
class A
{
//.....
}
class B extends A
{
  //.....
}
```

# Interface Inheritance

- `class` ------------ extends ----------- `class`
- `interface` -------- impliments -------- `class`
- `interface` -------- extends -------- `interface`
-  `interface1` , `interface2` ,  ----------- `class`
    - *class className impliments interface1, interface2

### if 
  `interface1` , `interface2` , `class` ----------- `class`
### then
  `class childClassName extends parentClassName impliments interface1, interface2`
  
