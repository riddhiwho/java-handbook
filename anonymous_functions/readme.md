# 🧠 Java Anonymous Functions – From Scratch

## 🪞 What Is an Anonymous Function?
- An anonymous function is a function without a name.
- In Java, anonymous functions are implemented using lambda expressions.
- Java didn't support anonymous functions until Java 8. So if you're using Java 8 or later, you're good to go!

## 🔧 But First… Functions and Interfaces in Java

Before we dive into anonymous functions, we need to understand:

1. What is a function in Java?
2. What is a functional interface?
3. Why do anonymous functions need functional interfaces?

--- 

### ✅ 1. What Is a Function in Java?
Traditionally, Java uses methods inside classes. A method is a named block of code you can call to perform an action.

```java
public class Greeter {
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
```

You’d use it like this:

```java
Greeter greeter = new Greeter();
greeter.sayHello(); // Output: Hello, world!
```

### ✅ 2. What Is a Functional Interface?
A functional interface is an interface with only one abstract method.

```java
@FunctionalInterface
interface MyFunction {
    void apply(); // one method only!
}
```
Why are these special? Because Java allows you to use lambda expressions (anonymous functions) to implement them.

### ✅ 3. Why Are Functional Interfaces Needed?
Lambda expressions (anonymous functions) need to know what method they're implementing. Java uses functional interfaces as contracts to define the shape of the function.

```java
@FunctionalInterface
interface Printer {
    void printMessage();
}

```

--- 

## 🧪 First Anonymous Function (Lambda Expression)

✅ Syntax
```java
(parameters) -> { body }
```

Or, if only one statement, you can skip {}:

```java
(parameters) -> single_expression
```

---

## Difference between Anonymous Functions and Lambda Expressions

### Anonymous Functions (General Concept)

- An anonymous function is a generic term used in programming to describe a function without a name.
- In Java, before lambdas were introduced (Java 8), the common way to achieve anonymous behavior was using anonymous classes.

🔧 Example (pre-Java 8):

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running in anonymous class");
    }
};
```
This is an anonymous class, and the method inside is an anonymous implementation of Runnable.


### Lambda Expressions (Java 8+ feature)

- A lambda expression is Java’s way of writing anonymous functions in a more concise way.
- It works only with functional interfaces (interfaces with one abstract method).
- Lambdas are a specific syntax to represent anonymous functions.

🔧 Lambda Version (Java 8+):

```java
Runnable task = () -> System.out.println("Running in lambda");
```

✅ You can say:
🔸 All lambdas are anonymous functions
🔸 but not all anonymous functions are lambdas (e.g., anonymous inner classes).