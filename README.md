# 📟 Recursive Jump Game Validator - Java

A performance-oriented path evaluation micro-application built in Java that analyzes reachability mechanics within structured array grids. The engine utilizes pure recursive optimization structures to map multi-path decisions without automation wrappers.

## ⚡ Core Features
* **Backtracking Search Tree:** Implements a localized recursive search algorithm (`canWin`) that maps decision paths through multi-length jumps, evaluating potential solutions dynamically.
* **Immediate Short-Circuit Pruning:** Features algorithmic short-circuit tree pruning that instantly returns a true state upon discovering the first viable end-of-map terminal position.
* **Boundary Safeguards:** Enforces strict conditional checks to eliminate array out-of-bounds anomalies and handles dead-end path scenarios (zero-value indexes) with minimal overhead.

## 📁 Class Layout
* `Main.java`: Directs execution flows, allocating hardcoded scenario array maps (validating both true/false results) and managing output testing indicators.
* `JumpValidator.java`: Encapsulates path verification boundaries, positional iteration logic, and internal recursive evaluation stacks.

---
**Developed by Axel Castañeda**