# 🧮 Advanced Calculator – Java

## 📌 Project Overview

The **Advanced Calculator** is a menu-driven, command-line application developed using Java. It performs basic arithmetic operations, advanced mathematical calculations, statistical computations, and maintains a history of previously performed calculations.

The project demonstrates core Java programming concepts, including Object-Oriented Programming (OOP), arrays, collections, stacks, HashMaps, exception handling, and time complexity analysis.

It is designed to provide multiple mathematical utilities within a single application using a simple and user-friendly interface.

## 🚀 Features

### 1. Basic Expression Evaluator
- Supports addition (+), subtraction (-), multiplication (*), division (/), and exponentiation (^).
- Evaluates complete mathematical expressions.
- Uses **Infix to Postfix Conversion** for expression evaluation.
- Implements Stack data structures for operator precedence and evaluation.
- Supports operator associativity, including right-associative exponentiation.

### 2. Statistics Calculator
Provides the following statistical operations:
- **Mean:** Calculates the average of given numbers.
- **Median:** Finds the middle value after sorting the numbers.
- **Mode:** Identifies the most frequently occurring number using HashMap.
- **Percentage:** Calculates percentage based on obtained and total marks.

### 3. Advanced Math Utility
Supports advanced mathematical operations:
- Sine (sin)
- Cosine (cos)
- Tangent (tan)
- Logarithm (log base 10)
- Square Root (√)
- Factorial (!)
- Exponentiation (a^b)

Trigonometric functions accept angles in degrees.

### 4. Calculation History
- Stores previously evaluated expressions and their results.
- Records the date and time of each calculation.
- Displays calculation history using a custom `HistoryEntry` class.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **IDE:** IntelliJ IDEA / Eclipse / VS Code
- **Data Structures:** Arrays, Stack (Deque), HashMap, List
- **Java Libraries:**
  - `java.util`
  - `java.time.LocalDateTime`
  - `java.lang.Math`

## 📂 Project Structure

```text
Advanced-Calculator/
│
├── Calculator.java
├── ExpressionEvaluator.java
├── StatisticsUtil.java
├── AdvancedMathUtil.java
├── HistoryEntry.java
│
└── README.md
```

## ⚙️ How to Run the Project

**Step 1: Clone the repository**

```bash
git clone <your-repository-link>
```

**Step 2: Navigate to the project directory**

```bash
cd Advanced-Calculator
```

**Step 3: Compile all Java files**

```bash
javac *.java
```

**Step 4: Run the application**

```bash
java Calculator
```

## 📊 Time Complexity Analysis

| Operation | Time Complexity |
|---|---|
| Expression Tokenization | O(n) |
| Infix to Postfix Conversion | O(n) |
| Postfix Evaluation | O(n) |
| Mean Calculation | O(n) |
| Median Calculation | O(n log n) |
| Mode Calculation | O(n) average |
| Percentage Calculation | O(1) |
| Factorial Calculation | O(n) |

Here, `n` represents the number of elements or tokens in the input.

## 🎯 Concepts Learned

- Object-Oriented Programming in Java.
- Stack-based expression evaluation.
- Infix to Postfix conversion.
- Operator precedence and associativity.
- Arrays and ArrayList.
- HashMap and frequency counting.
- Mathematical and statistical operations.
- Date and time handling using LocalDateTime.
- Modular programming using multiple Java classes.
- Time and space complexity analysis.

## 🔮 Future Enhancements

- Add a graphical user interface (GUI) using Java Swing.
- Implement parentheses support in mathematical expressions.
- Add input validation and better error handling.
- Support negative numbers and unary operators.
- Save calculation history to a file.
- Add scientific calculator functions.

## 👩‍💻 Author

Netra Hakhu

Java | Data Structures & Algorithms | Software Development

---

⭐ If you find this project useful, consider giving the repository a star!
