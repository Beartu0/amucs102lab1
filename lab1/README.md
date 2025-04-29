CPE102 Lab 1 — Java Implementation (Plain README)
==================================================

Author: Beartu
Course: CPE 102 – Computer Programming II (Spring 2024–2025)
Assignment: Lab 1

--------------------------------------------------

Project Goals
-------------

This Java project demonstrates seven classic programming exercises:

1. Inverted filled triangle using nested loops
2. Diamond shape of two filled triangles
3. Hollow upright triangle
4. Hollow upside-down triangle
5. Hourglass shape using hollow triangles
6. Hollow diamond (merged patterns)
7. A menu-driven calculator with basic operations (add, subtract, multiply, divide, clear, display)

All patterns are rendered using `for` loops only. The calculator logic is implemented in pure Java without external libraries.

--------------------------------------------------

Project Structure
-----------------

AppProject/
├── src/               # Contains App.java
│   └── App.java
├── bin/               # Contains App.class (compiled output)
│   └── App.class
├── lib/               # Optional libraries (not used here)
├── .vscode/           # VSCode settings
└── README.txt         # This file

--------------------------------------------------

Build & Run
-----------

Requirements:
- JDK 17 or later
- Command-line interface

To compile:
    javac -d bin src/App.java

To run:
    java -cp bin App

Output will execute all pattern functions (q1–q6) and then launch the calculator (q7).

--------------------------------------------------

Sample Outputs
--------------

Pattern (q1):
***********
 *********
  *******
   *****
    ***
     *

Calculator (q7):
Welcome to the Basic Calculator Simulator!
Menu:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Clear
6. Display Result
7. Exit

> Enter your choice: 1
> Enter value to add: 10
> Result after add: 10.0

--------------------------------------------------

Implementation Notes
--------------------

- Uses Scanner for input
- Invalid input prompts retry
- Patterns: nested loops for shape drawing
- Calculator: uses while(true) loop for interaction
- Division-by-zero is handled with basic control logic

--------------------------------------------------

End of README