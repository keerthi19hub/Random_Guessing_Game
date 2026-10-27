# Object-Oriented Java Number Guessing Game

> **A modular, multi-class Java application demonstrating clean Object-Oriented Programming (OOP) principles, player history tracking, input validation, and game loop state management.**

[![Java](https://img.shields.io/badge/Language-Java-ED8B00?logo=openjdk&logoColor=white)](https://oracle.com/java)
[![OOP](https://img.shields.io/badge/Paradigm-Object--Oriented%20Design-blue)](https://github.com/keerthi19hub)
[![CLI](https://img.shields.io/badge/Interface-Console%20Application-green)](https://github.com/keerthi19hub)

---

## 1. Project Overview

The **Random Guessing Game** is an object-oriented Java console application that challenges players to deduce a randomly generated target number within dynamic constraints.

Rather than implementing the game as a single procedural script, the project is architected with a **modular multi-class separation of concerns**:
- Encapsulated player state and attempt histories.
- A dedicated judge object handling game rule evaluation and boundary checks.
- Robust input parsing that prevents application crashes on invalid or non-numeric tokens.
- Clear game termination and retry mechanics.

---

## 2. Object-Oriented Architecture & Class Design

| Class | Role & Responsibilities | Key Methods |
| :--- | :--- | :--- |
| `Main.java` | Application entry point and orchestrator | `main(String[] args)` |
| `NumberGuessingGame.java` | Core game loop, round initialization, and target generation | `startGame()`, `playRound()` |
| `Player.java` | Represents the human participant and encapsulates score tracking | `getName()`, `getAttempts()`, `incrementAttempts()` |
| `Judge.java` | Business logic evaluator determining higher/lower/match outcomes | `evaluateGuess(int target, int guess)` |
| `GuessReader.java` | Input extraction and robust exception handling for numeric inputs | `readGuess()`, `isValid()` |
| `History.java` | In-memory ledger recording historical guess logs and performance stats | `addGuess(int guess)`, `displayHistory()` |
| `Over.java` | Handles victory/loss conditions, round summaries, and replay triggers | `checkEndCondition()`, `promptReplay()` |

---

## 3. Visual Demonstrations

The repository includes visual captures of the game execution:
- `Random1.jpg` — Console launch, input prompting, and initial guess verification.
- `Random2.jpg` — Boundary feedback ("Higher / Lower") and round victory state.

---

## 4. Compilation & Execution

```bash
# 1. Clone repository
git clone https://github.com/keerthi19hub/Random_Guessing_Game.git
cd Random_Guessing_Game

# 2. Compile all Java source files
javac *.java

# 3. Run the application
java Main
```

---

## 5. Author & Academic Context

- **Author:** **Keerthi N** (*Alliance University, BCA*)
- **Subject:** Object-Oriented Programming in Java
- **Verified Contribution:** Designed the modular class architecture, input sanitization routines, history tracking, and execution logic.

---

## 6. License

Released under the [MIT License](https://opensource.org/licenses/MIT).
