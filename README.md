# Quiz Management System (Java Swing GUI)

Java Swing application for managing student quiz performance data, featuring CRUD operations, search functionality, and intuitive record navigation with OOP principles.

<br>

## Features

| Module                | Key Components                                | 
|-----------------------|-----------------------------------------------|
| Student Management    | Add students with quiz scores & average       | 
| Search System         | Find students by registration number          |
| Record Navigation     | First/Previous/Next/Last student controls     |
| Data Display          | JTextArea for clean output presentation       |
| Input Validation      | Basic null/zero value checks                  |

<br>

## Technical Highlights

- **Object-Oriented Architecture**  
  (`Student` class with encapsulation, `QuizManagement` for business logic)
- **Event-Driven Design**  
  (Implements `ActionListener` for all GUI interactions)
- **Collection Framework**  
  (Uses `ArrayList<Student>` for dynamic data storage)
- **Swing Components**  
  (`JFrame`, `JLabel`, `JTextField`, `JTextArea`, `JButton`)

<br>

## Getting Started

* **Clone this repository:**
    ```
    git clone https://github.com/yourusername/Quiz-Management-System.git
    ```
* **Prerequisites:**
    - Java 8 or later
    - Swing library (included in standard Java SE)

* **Compile and Run:**
    ```
    javac QuizSystem.java
    java QuizSystem
    ```

<br>

## Usage

- **Add Student:**  
  Enter Name, RegNo, Quiz Count, and Scores → Click "ADD"
- **Search Student:**  
  Enter RegNo → Click "SEARCH"
- **View All Records:**  
  Click "DISPLAY" to show all student data
- **Navigate Records:**  
  Use `FIRST`, `PREV`, `NEXT`, `LAST` buttons to browse students

<br>

## UI Components

| Element       | Purpose                          |
|---------------|-----------------------------------|
| Text Fields   | Input student details            |
| ADD Button    | Commit new student record        |
| SEARCH Button | Find specific student            |
| Text Area     | Display results/output           |
| Nav Buttons   | Cycle through student records    |

<br>

