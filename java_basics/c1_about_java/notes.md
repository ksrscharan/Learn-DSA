# Why JAVA?
- Java is popular language.
- fast, reliable, secure.
- based on c++. 
- platform independent language.
- object oriented programming language.
- robust.
- Multithreaded.
- compiled.
- doesn't require preprocessor.

# Learning Curve

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190628094222/Java-Tutorial-by-GeeksforGeeks.png)


# Sample Syntax
- For some editors, class name shoulf match filename
- File name and type should be in this fashion
    - XXXX.java
-


    public class XXXX{
        public static void main(String args[]){
            System.out.println("Hello");
        }
    }

## Output
    Hello

## Let's understand code 
    public class XXXX{
> class: this is a keyword used to define a class.

        public static void main(String args[]){
> public: keyword that gives access to JVM to run this method from anywhere

> static: When java runtime starts, there is no object of the class present. That’s why the main method has to be static so that JVM can load the class into memory and call the main method.

> void: states that this method isn't returning anything.

> main: name of the method. main method is the only method that java searches for when you run.

# Variables

- variable is name of reserved area allocated in memory.
- value of variable can change
- when we define a variable, a small block of memory is alloted to store any value it can have.
<!--  -->

    datatype variableName = value;
<!--  -->
- There are many datatypes to store different types of values.

# Data Types
- There are 2 types of data types
    - primitive data types
    - non primitive data types

## Primitive Datatypes
- there are 8 primitive data types.
    - boolean
        > stores boolean value [ true ] [ false ]
        - storage: 1 bit
    - char
        > stores character unicode value [ 'c' ] [ '9' ] [ ' ' ]
        - storage: 16-bit Unicode Character
    - byte
        > number from -128 to 127
        - storage: 8-bit or 1 byte
    - short
        > numbers from -32768 to 32767
        - storage: 16-bit or 2 bytes
    - int
        > numbers from -2^31 to 2^31 - 1
        - storage: 32-bit or 4 bytes
    - long
        > numbers from -2^63 to 2^63 - 1
        - storage: 64-bit or 8 bytes
    - float
        > stores decimal values
        - storage: 32-bit or 4 byte
    - double
        > stores multiple decimal values
        - storage: 64-bit or 8 bytes

## Non Primitive Data Types
- typically some object like stuff.
- stores reference to an object in memory.
    - String
<!--  -->

# Operators
- used to perform operations.
- there are many types of operators.
    - unary operator
    - arithmetic operator
    - shift operator
    - relational operator
    - bitwise operator
    - logical operator
    - ternary operator
    - assignment operator

## Unary operator
- x++
- x--
- ++x, --x
- ! , ~
## Arithmetic Operator
- *, /, +, -, %
## Shift operator
- >>, <<, >>>
## relational operator
- >, <, <=, >=
- ==, !=
## bitwise operators
- & , | , ^
## logical operator
- && , ||
## ternary operator
- condition ? work1 : work 2
<!--  -->

> relational, logical operators when used return boolean values