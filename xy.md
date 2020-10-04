### THIS CONSTRUCT
- this() construct is used to call same class constructor from the other constructor.

### Multilevel-Inheritance
- super class -> base class, sub class -> derived class.
- Inheritance where atleast one class acts as a super and sub class for two different classes.

### INTERFACE
- abstract method must be overidden in the class that implements the interface.

### MARKER INTERFACE
- An interface without any method
- java.io.Serializable
- java.lang.Cloneable

### STATIC-METHOD-INTERFACE
 - we can create static methods in an interface.

### DEFAULT-METHOD-IN-INTERFACE
 - No need to overrride in subclass.

### FUNCTIONAL-INTERFACE
 - an interface that has only one abstract method.

### Nested-classes 
 (class in another class)
 - static class : belongs to class
 - non static class : belongs to objects  |
 - local class : declared in any method   |  <-- Innerclasses 
 - anonymous class : a clas without name  | 

### LAMBDA-EXPRESSION
 - Mechanism that allows functional programming.

### PACKAGE
- grouping similar classes.

### VARARG 
- d

### WRAPPER CLASSES
- class that provides wrapper around any primitive value to make it an object.

- primitive types |  wrapper types
  boolean         |  Boolean
  char            |  Character
  int             |  Integer
  byte            |  Byte
  short           |  Short
  long            |  Long
  float           |  Float
  double          |  Double


primitive approach : int i  = 10;

                        i
                      | 10 | 

wrapper class approach : Integer i = new Integer(10);
                       
                           i ------          ab23
                        | ab23 |   |----->(   10   )

* boxing is a process of converting a primitive data type into a wrapper class object.
* int i = 10;
  Integer r = new Integer(i); -> boxing
* Integer r1 = Integer.valueOf(i); -> boxing
* Integer r2 = 10; -> auto-boxing

* unboxing is a process of converting wrapper to primitive type
* Integer r = new Integer(12);
  int i = r.intValue();

* int j = new Integer(56); -> auto unboxing

### Generics
- Creating common class which can be used for different types

### COLLECTION FRAMEWORK
- A framework(set of classes) to creaete dynamic collection to store similar or dissimilar data elements.
- primitive values cannot be stored, only objects can be stored.
                        Collection
                           |(extends)
  -----------------------------------------------------------
  |                                                         |
 List(implemennts)                                          Set(implements)
 |-> ArrayList                                              |->HashSet
 |-> LinkedList                                             |->TreeSet






 