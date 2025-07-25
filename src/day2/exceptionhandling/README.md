# Day 2: Exception Handling in Java 🚨

This project demonstrates the use of exception handling in Java using a simple **ATM Withdrawal Simulator**. It covers key concepts like `try-catch-finally`, custom exceptions, and clean error messages.

---

## 📌 What This Program Does

- Takes user input for withdrawal amount 💳
- Checks for sufficient balance 🏦
- Throws and handles a **custom exception** (`InsufficientBalanceException`) when needed
- Always runs a `finally` block to show graceful completion ✅

---

## 🔍 Key Java Concepts Used

- `try-catch-finally` block
- Custom exception class (extending `Exception`)
- Input validation and error handling
- Java 8 best practices for clean code

---

## 📂 Project Structure

day2.exceptionhandling/
├── ATM.java
└── InsufficientBalanceException.java


---

## 💡 Sample Output

Enter withdrawal amount: 1500
⚠️ Error: Insufficient balance. Available: ₹1000.0
✅ Thank you for using our ATM.

## 🚀 How to Run

1. Make sure you're using Java 8+
2. Compile and run `ATM.java`
3. Enter any amount to simulate withdrawal

---

🛠️ _Happy Learning!_  
📌 _Maintained by [Bhavya Sree](https://github.com/Bhavya-codeplay)_