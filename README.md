# Java Object-Oriented Shape Classes

An early Java object-oriented programming project developed as part of my university Software Development coursework.

The project represents a progression from procedural Java programming toward object-oriented software design by modelling geometric shapes as individual classes containing their own state and behaviour.

## Project Overview

The project implements two geometric objects:

- `Rectangle`
- `Circle`

Each class stores the properties required to represent its shape and provides methods for performing geometric calculations.

Separate test programs instantiate the classes and exercise their functionality.

## Technologies

- Java
- Object-Oriented Programming
- Java Standard Library

## Project Structure

```text
original/
├── Circle.java
├── CircleTest.java
├── Rectangle.java
└── RectangleTest.java
```

## Rectangle Class

The `Rectangle` class encapsulates two properties:

```java
private double rectangle_width;
private double rectangle_height;
```

It provides both a default constructor and a parameterised constructor.

The class implements methods for:

- Calculating area
- Calculating perimeter
- Retrieving width
- Retrieving height
- Updating width
- Updating height

Conceptually:

```text
Rectangle
│
├── width
├── height
│
├── getArea()
├── getPerimeter()
├── getWidth()
├── getHeight()
├── setWidth()
└── setHeight()
```

## Circle Class

The `Circle` class encapsulates a radius and provides both default and parameterised construction.

It includes functionality for:

- Calculating area
- Calculating circumference/perimeter
- Updating the radius

```text
Circle
│
├── radius
│
├── getArea()
├── getPerimeter()
└── setRadius()
```

The calculations make use of Java's `Math.PI` constant.

## Object Testing

Separate test classes were used to instantiate and exercise the shape classes.

For example, the rectangle test creates multiple `Rectangle` objects with different dimensions and retrieves their:

- Width
- Height
- Area
- Perimeter

The circle test similarly creates several `Circle` instances with different radii and evaluates their calculated areas.

## Concepts Demonstrated

This project introduced several fundamental object-oriented programming concepts:

- Classes and objects
- Encapsulation
- Private instance variables
- Default constructors
- Parameterised constructors
- Instance methods
- Getters and setters
- The `this` keyword
- Object instantiation
- Separation of implementation and test code

## Original Source Code

The original university implementation is preserved in the `original/` directory.

The source has intentionally been retained in its original form as an example of my early development with Java and object-oriented programming.

## Retrospective

This project represents an important step in my early software-development progression because it moves beyond single procedural programs and begins organising software around objects with defined state and behaviour.

Reviewing the implementation with my current experience highlights several areas I would improve today.

### Naming Conventions

Variables such as:

```java
rectangle_width
rectangle_height
```

would conventionally use Java camelCase:

```java
rectangleWidth
rectangleHeight
```

### Consistent Encapsulation

The classes demonstrate encapsulation through private fields, although the public interface could be made more consistent.

For example, the `Circle` class provides a radius setter but does not expose a corresponding `getRadius()` method.

### Input Validation

The setters and constructors currently accept any `double`, including negative dimensions.

A production implementation would validate dimensions before updating object state.

### Testing

The original `CircleTest` and `RectangleTest` classes manually instantiate objects and print results to the console.

Today I would use an automated unit-testing framework such as JUnit and explicitly verify expected results.

### Extensibility

A more advanced implementation could introduce a common abstraction:

```text
              Shape
                │
        ┌───────┴───────┐
        │               │
     Circle         Rectangle
```

A `Shape` interface could define common behaviour such as:

```java
double getArea();
double getPerimeter();
```

allowing different geometric objects to be handled through a common interface.

## Portfolio Context

This project is retained as an example of my early introduction to object-oriented software development.

It demonstrates the progression from basic Java control flow and data processing toward encapsulation, reusable classes, object instantiation and separation of responsibilities — concepts that subsequently became fundamental to my larger software, embedded and robotics projects.
