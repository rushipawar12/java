### Package: `chapter1`

This package contains standalone educational examples. Each public class exposes a single entry point:

- **Signature**: `public static void main(String[] args)`
- **Usage**: Run via the FQCN using the compiled output directory on the classpath.

Build once:
```bash
rm -rf out && mkdir -p out
javac -d out *.java
```

Run pattern:
```bash
java -cp out chapter1.<ClassName>
```

---

### `Hello`
- **Purpose**: Demonstrates simple integer addition and console output.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.Hello
```
- **Output**:
```
30
```

---

### `ArithmeticOperations`
- **Purpose**: Demonstrates addition, subtraction, multiplication, division, and modulo with integers.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.ArithmeticOperations
```
- **Output**:
```
Addition of two number15
Subtraction of two number5
Multiplication of two number 50
Division of two number2
Modulo of two number 0
```

---

### `DataTypesExample`
- **Purpose**: Prints examples of Java primitive types and `String`.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.DataTypesExample
```
- **Output**:
```
int: 10
long: 100000
float: 5.75
double: 19.99
char: A
boolean: true
String: Hello, Java!
```

---

### `LiteralsExample`
- **Purpose**: Shows numeric, character, boolean, and string literals.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.LiteralsExample
```
- **Output**:
```
Integer literals: 100, 255, 83, 10
Floating-point literals: 3.14, 3.14159
Character literals: A, A
Boolean literals: true, false
String literal: Hello, World!
```

---

### `RelationalOperators`
- **Purpose**: Demonstrates relational operators: `==`, `!=`, `>`, `<`, `>=`, `<=`.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.RelationalOperators
```
- **Output**:
```
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false
```

---

### `LogicalOperators`
- **Purpose**: Demonstrates logical operators: AND `&&`, OR `||`, NOT `!`.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.LogicalOperators
```
- **Output**:
```
x && y: false
x || y: true
!x: false
!y: true
```

---

### `IfElseExample`
- **Purpose**: Demonstrates conditional branching with `if`, `else if`, and `else`.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.IfElseExample
```
- **Output**:
```
Number is greater than 10 but less than or equal to 30
```

---

### `SwitchExample`
- **Purpose**: Demonstrates a `switch` statement mapping integers to day names.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.SwitchExample
```
- **Output**:
```
The day is: Wednesday
```

---

### `TernaryOperatorExample`
- **Purpose**: Demonstrates the ternary operator `?:`.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.TernaryOperatorExample
```
- **Output**:
```
a is greater than b
```

---

### `ForLoopExample`
- **Purpose**: Demonstrates a `for` loop counting from 1 to 5.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.ForLoopExample
```
- **Output**:
```
1
2
3
4
5
```

---

### `WhileLoopExample`
- **Purpose**: Demonstrates a `while` loop counting from 1 to 5.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.WhileLoopExample
```
- **Output**:
```
1
2
3
4
5
```

---

### `DoWhileLoopExample`
- **Purpose**: Demonstrates a `do-while` loop counting from 1 to 5.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.DoWhileLoopExample
```
- **Output**:
```
1
2
3
4
5
```

---

### `TypeConversion`
- **Purpose**: Demonstrates implicit widening, explicit narrowing, and String/number conversions.
- **Entry point**: `public static void main(String[] args)`
- **Example**:
```bash
java -cp out chapter1.TypeConversion
```
- **Output**:
```
Implicit Conversion:
int: 10
double: 10.0

Explicit Conversion:
double: 9.99
int (after casting): 9

String to Numeric Conversion:
String: 123
Numeric value (int): 123

Numeric to String Conversion:
Numeric value: 456
String value: 456
```

---

### `VariableExample`
- **Purpose**: Shows static (class), instance, local, and parameter variables, plus a constructor and an instance method.
- **Public API**:
  - `public VariableExample(int value)` — constructor assigning `instanceVariable`.
  - `public void demonstrateVariables(int paramVariable)` — prints values of variable kinds and a parameter.
  - `public static void main(String[] args)` — constructs an instance and calls `demonstrateVariables`.
- **Example**:
```bash
java -cp out chapter1.VariableExample
```
- **Output**:
```
Class variable (Static): 10
Instance variable: 50
Local variable: 20
Parameter variable: 30
```