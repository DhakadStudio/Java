💰 Expense Tracker

A simple Java console-based Expense Tracker built to practice core Java concepts and learn how to structure a real-world application.

The goal of this project wasn't just to make an expense calculator, but to understand how different Java concepts work together in a small application.

✨ What can it do?

The Expense Tracker currently allows you to:

- ➕ Add an expense
- 👀 View all expenses
- ✏️ Edit an existing expense
  - Edit description
  - Edit category
  - Edit amount
  - Edit date
  - Edit all details
- 🗑️ Remove an expense
- 🔎 Search expenses
- 🏷️ Filter expenses by category
- 📅 Calculate the total expense for a particular month
- 💰 Sort expenses by amount
- 📆 Sort expenses by date
- 📊 See a summary of spending by category

The application runs completely in the terminal and uses a simple menu so you can interact with it easily.

---

🛠️ Technologies & Concepts

This project is built with:

- Java 21
- Maven
- Jackson for JSON
- "ArrayList"
- "HashMap"
- "enum"
- "LocalDate"
- "Comparator"
- Java Streams
- JSON serialization/deserialization
- Basic object-oriented programming
- Layered project structure

---

📁 Project Structure

ExpenseTracker/
│
├── pom.xml
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── expensetracker/
│                   │
│                   ├── Main.java
│                   │
│                   ├── model/
│                   │   ├── Expense.java
│                   │   └── Category.java
│                   │
│                   ├── service/
│                   │   └── ExpenseService.java
│                   │
│                   ├── repository/
│                   │   └── ExpenseRepository.java
│                   │
│                   └── util/
│                       ├── DateUtil.java
│                       └── JsonUtil.java
│
└── expenses.json

What does each part do?

Main.java

Handles the terminal menu and user input.

«Main asks the user what they want to do.»

Expense.java

Represents an individual expense.

It contains information such as:

- ID
- Amount
- Description
- Category
- Date

Category.java

Contains the available expense categories using an enum.

For example:

FOOD
TRAVEL
SHOPPING
BILLS
ENTERTAINMENT
HEALTH
EDUCATION
OTHER

ExpenseService.java

Contains the main application logic.

«The service thinks and performs the operations.»

This is where searching, filtering, sorting, monthly totals, and category summaries are handled.

ExpenseRepository.java

Responsible for storing and retrieving expenses.

«The repository handles persistence.»

JsonUtil.java

Handles conversion between Java objects and JSON.

Java Object → JSON
JSON → Java Object

DateUtil.java

Contains common date-related functionality such as the date formatter.

---

🚀 Setup

1. Requirements

Make sure you have:

- Java 21 or newer
- Maven

Check Java:

java -version

Check Maven:

mvn -version

You should see your Java and Maven versions.

---

2. Clone the project

git clone <your-repository-url>

Then enter the project:

cd ExpenseTracker

---

3. Build the project

Maven will automatically download the required dependencies, including Jackson.

mvn compile

If everything is configured correctly, you should see:

BUILD SUCCESS

---

▶️ Running the Application

After compiling, run:

java -cp target/classes com.expensetracker.Main

The application will start and display the menu:

*********************
 * Expense Tracker *
*********************

    Menu

1. Add Expense
2. View Expenses
3. Edit Expense
4. Remove Expense
5. Search Expense
6. Filter by Category
7. Monthly Total
8. Sort by Amount
9. Sort by Date
10. Category Summary
0. Exit

Choose an option and follow the instructions shown in the terminal.

---

📦 Maven Dependencies

Jackson is managed through Maven, so you don't need to manually download ".jar" files.

The project uses Jackson for JSON handling and the Java Time module for "LocalDate".

Maven downloads the required dependencies when you run:

mvn compile

---

🧠 What I Practiced With This Project

This project was mainly built as a learning project.

While building it, I practiced how to use:

Collections

Using "ArrayList" to store expenses and "HashMap" for category-based summaries.

Enum

Using an enum for expense categories instead of storing categories as arbitrary strings.

LocalDate

Using Java's "LocalDate" to represent expense dates.

Comparator

Sorting expenses by:

- Amount
- Date

Streams

Using Java Streams for operations such as filtering, sorting, mapping, and calculating totals.

JSON

Using Jackson to convert Java objects to JSON and JSON back into Java objects.

Project Structure

Separating the application into:

Main
 ↓
Service
 ↓
Repository
 ↓
JSON/File

This helped me understand why application logic and data storage shouldn't all be placed inside one class.

---

🎯 Project Goal

The main purpose of this project is to get comfortable with Java by building something instead of only practicing individual concepts separately.

It's a small project, but it covers several concepts that appear in larger applications:

User Input
    ↓
Business Logic
    ↓
Data
    ↓
Persistence

---

🔮 Possible Future Improvements

Some things that could be added later:

- Persistent JSON storage
- Better input validation
- Prevent duplicate IDs
- Expense statistics
- Weekly/yearly reports
- Export reports
- Better terminal UI
- Unit tests
- Exception handling improvements
- Database support instead of JSON
- REST API version using Spring Boot

---

👨‍💻 About

This is a personal learning project created to practice Java and understand how different programming concepts come together in a real application.

Built with Java ☕