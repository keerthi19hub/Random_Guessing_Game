# 🎯 Java Number Guesser — Object-Oriented Game Architecture & Heuristic Search

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=14532D,16A34A,4ADE80&height=220&section=header&text=Java%20Number%20Guesser&fontSize=42&fontColor=ffffff&fontAlignY=38&desc=Object-Oriented%20Game%20Architecture%20%26%20Heuristic%20Search&descSize=18&descAlignY=60&descAlign=50" width="100%" alt="Random Guessing Game Banner" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Architecture-7--Class%20OOP%20Design-14532D?style=for-the-badge" alt="OOP Design" />
  <img src="https://img.shields.io/badge/Interface-Console%20CLI-16A34A?style=for-the-badge" alt="CLI" />
  <img src="https://img.shields.io/badge/Quality-Robust%20Input%20Sanitization-4ADE80?style=for-the-badge" alt="Input Validation" />
  <img src="https://img.shields.io/badge/License-MIT-green?style=for-the-badge" alt="License" />
</p>

---

## 📌 Table of Contents

- [📖 Executive Summary](#-executive-summary)
- [🎯 Architecture & Multi-Class Separation of Concerns](#-architecture--multi-class-separation-of-concerns)
- [✨ Key Technical Capabilities](#-key-technical-capabilities)
- [🏗️ Class Interaction Diagram](#️-class-interaction-diagram)
- [🛠️ Tech Stack Matrix](#️-tech-stack-matrix)
- [⚙️ Compilation & Execution](#️-compilation--execution)
- [📁 Project Structure](#-project-structure)
- [👩‍💻 Author & Contributions](#-author--contributions)

---

## 📖 Executive Summary

The **Java Number Guesser** is an enterprise-patterned Object-Oriented console application designed to demonstrate decoupling, single responsibility principle (SRP), and input sanitization in Java. Rather than implementing the game as a monolithic procedural script, the project refactors game loops, input parsing, rule evaluation, player scoring, attempt histories, and game-over transitions across **seven discrete classes**.

---

## 🎯 Architecture & Multi-Class Separation of Concerns

| Class | Responsibility & Methods | Design Principle |
| :--- | :--- | :--- |
| `Main.java` | Application launch bootstrap (`main`) | Dependency inversion / entry orchestrator |
| `NumberGuessingGame.java` | Coordinates overall game loops and round transitions | Master Controller pattern |
| `Player.java` | Encapsulates participant identity, score, and attempt metrics | Domain Entity encapsulation |
| `Judge.java` | Compares target against player guess ("Higher", "Lower", "Match") | Pure business logic evaluation |
| `GuessReader.java` | Reads console input and catches non-numeric tokens without crashing | Exception handling & input sanitization |
| `History.java` | Stores sequential guess audit trails and calculates statistics | In-memory ledger / state logging |
| `Over.java` | Evaluates victory conditions and prompts for replay loops | Termination state management |

---

## ✨ Key Technical Capabilities

- **🛡️ Crash-Proof Input Sanitization:** `GuessReader` gracefully captures non-numeric tokens, negative values, and out-of-range guesses without `InputMismatchException` crashes.
- **📜 In-Memory Guess Audit Trail:** `History` tracks all user attempts chronologically, enabling performance post-mortems after each round.
- **🔄 Clean Lifecycle Control:** Decoupled victory evaluation in `Over` and game reset logic in `NumberGuessingGame`.
- **📸 Visual Verification:** Repository includes screenshots `Random1.jpg` and `Random2.jpg` proving console execution and feedback.

---

## 🏗️ Class Interaction Diagram

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                     Java Number Guesser Class Diagram                       │
└─────────────────────────────────────────────────────────────────────────────┘
                                       │
                                       ▼
                              ┌──────────────────┐
                              │    Main.java     │
                              └────────┬─────────┘
                                       │
                                       ▼
                       ┌──────────────────────────────┐
                       │    NumberGuessingGame.java   │
                       └──────┬──────┬──────┬──────┬───┘
                              │      │      │      │
          ┌───────────────────┼──────┼──────┼──────┴───────────────┐
          ▼                   ▼      ▼      ▼                      ▼
   ┌─────────────┐     ┌───────────┐ ┌─────────┐ ┌─────────────┐ ┌──────────┐
   │ Player.java │     │Judge.java │ │History  │ │GuessReader  │ │Over.java │
   │ (Score/ID)  │     │(Evaluate) │ │(Audit)  │ │(Safe Input) │ │(Victory) │
   └─────────────┘     └───────────┘ └─────────┘ └─────────────┘ └──────────┘
```

---

## 🛠️ Tech Stack Matrix

| Domain | Technology | Implementation Details |
| :--- | :--- | :--- |
| **Language** | Java (JDK 8+) | Modular OOP, robust exception handling |
| **I/O** | `java.util.Scanner` | Console input streaming with try-catch validation |
| **Collections** | Java Collections Framework | Dynamic list tracking of player guess histories |
| **Compiler & Runtime** | `javac`, JVM | Native bytecode compilation and execution |

---

## ⚙️ Compilation & Execution

### 1. Clone the Repository
```bash
git clone https://github.com/keerthi19hub/Random_Guessing_Game.git
cd Random_Guessing_Game
```

### 2. Compile All Classes
```bash
javac *.java
```

### 3. Run the Game
```bash
java Main
```

---

## 📁 Project Structure

```text
Random_Guessing_Game/
├── Main.java               # Application bootstrap
├── NumberGuessingGame.java # Game loop controller
├── Player.java             # Player entity and score tracking
├── Judge.java              # Rule evaluation and hint generation
├── GuessReader.java        # Exception-safe console input reader
├── History.java            # Guess log and statistical tracking
├── Over.java               # End condition and replay handler
├── Random1.jpg             # Execution preview screenshot
├── Random2.jpg             # Victory and hint screenshot
└── README.md               # Technical documentation
```

---

## 👩‍💻 Author & Contributions

**Keerthi N**  
- **GitHub:** [@keerthi19hub](https://github.com/keerthi19hub)  
- **Portfolio:** [keerthi19hub.github.io](https://keerthi19hub.github.io)  
- **Course:** Object-Oriented Programming in Java · Alliance University, Bengaluru  
- **Role:** Designed the 7-class architecture, input sanitization routines, and state tracking.

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=14532D,16A34A,4ADE80&height=100&section=footer" width="100%" alt="Footer Banner" />
</p>
