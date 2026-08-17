To Do List

A simple Java console-based To Do List application with JSON persistence using Gson and Maven for dependency management and running the project.

Features

- Add new tasks
- View tasks
- Mark tasks as completed
- Remove tasks
- Save tasks to a JSON file
- Load saved tasks when the program starts
- Input validation for menu selection

Project Structure

todolist/
├── Main.java
├── Task.java
├── TaskManager.java
├── TaskStorage.java
├── pom.xml
└── tasks.json

Requirements

- Java 21 or later
- Maven 3.9 or later
- Termux/Linux environment or another Java-compatible environment

Setup

1. Install and configure Java

Check that Java is installed:

java -version
javac -version

2. Setup Maven

Check Maven:

mvn -version

If "JAVA_HOME" is not configured correctly, set it to your JDK installation.

For Termux with OpenJDK 21:

export JAVA_HOME=$PREFIX/lib/jvm/java-21-openjdk

To make it permanent in Bash:

echo 'export JAVA_HOME=$PREFIX/lib/jvm/java-21-openjdk' >> ~/.bashrc
source ~/.bashrc

Verify:

mvn -version

Compile the Project

Navigate to the project directory:

cd ~/projects/java/projects/todolist

Then run:

mvn clean compile

Maven will download the required dependencies, including Gson, and compile the Java source files.

A successful compilation should end with:

BUILD SUCCESS

Run the Program

After compiling, run:

mvn exec:java

The application will start and display the To Do List menu.

*********************
 -=*=- To Do List -=*=
*********************
 -=*=-  Menu  -=*=- 
0. Exit
1. To Add New Task
2. View Tasks
3. Complete Task
4. Remove Task
---------****-------

Data Storage

Tasks are stored in:

tasks.json

The application uses Gson to convert Java "Task" objects into JSON when saving and JSON back into Java objects when loading.

The basic flow is:

Java Task Objects
       ↓
      Gson
       ↓
   tasks.json
       ↓
      Gson
       ↓
Java Task Objects

The "TaskStorage" class is responsible for saving and loading the tasks.

Technologies Used

- Java 21 — application language
- Maven — build and dependency management
- Gson — JSON serialization and deserialization

Commands Summary

Purpose| Command
Check Java| "java -version"
Check compiler| "javac -version"
Check Maven| "mvn -version"
Compile project| "mvn clean compile"
Run program| "mvn exec:java"

Notes

Do not run the application using only:

java -cp "target/classes:" Main

because Gson is an external dependency and would not be included in that classpath.

Use:

mvn exec:java

so Maven automatically provides Gson at runtime.

License

This project is intended for learning and personal use.