## Java Basics Examples

A collection of simple Java programs demonstrating fundamental concepts: variables, data types, literals, operators, control flow, loops, type conversion, and a basic arithmetic example. All classes are in the `chapter1` package and are runnable via their `main` methods.

- Source location: project root (files declare `package chapter1;`).
- Output classes are compiled into `out/` in the examples below.

## Prerequisites
- JDK 8 or newer (`javac` and `java` on your PATH)

## Build
```bash
# From the project root
rm -rf out && mkdir -p out
javac -d out *.java
```

## Run examples
Each example is a standalone class with a `public static void main(String[] args)` method. Run them using the fully-qualified class name (FQCN):

```bash
# Hello world-style addition
java -cp out chapter1.Hello

# Arithmetic operators
java -cp out chapter1.ArithmeticOperations

# Data types
java -cp out chapter1.DataTypesExample

# Literals
java -cp out chapter1.LiteralsExample

# Relational operators
java -cp out chapter1.RelationalOperators

# Logical operators
java -cp out chapter1.LogicalOperators

# If / else
java -cp out chapter1.IfElseExample

# Switch statement
java -cp out chapter1.SwitchExample

# Ternary operator
java -cp out chapter1.TernaryOperatorExample

# Loops
java -cp out chapter1.ForLoopExample
java -cp out chapter1.WhileLoopExample
java -cp out chapter1.DoWhileLoopExample

# Type conversion
java -cp out chapter1.TypeConversion

# Variables scope and kinds
java -cp out chapter1.VariableExample
```

## API Reference
See the detailed public API documentation with examples in `docs/API.md`.