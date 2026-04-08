# solidWithDesignPattern
**Lab Assignment 6: Library Resource Management with SOLID Principles**

This project demonstrates the application of **SOLID Design Principles** in a library management system. By implementing the **Dependency Inversion Principle (DIP)** and **Open-Closed Principle (OCP)**, the system allows for flexible and extensible resource borrowing without modifying existing code.

## Problem Statement

You are developing a library management system where students can borrow different types of resources (Books, Journals, Audio Books). The system needs to be designed in a way that:

- Students can borrow any type of library resource seamlessly
- New resource types can be added without modifying the Student class
- The system depends on abstractions rather than concrete implementations
- Maintains high cohesion and low coupling between components

SOLID principles solve this by ensuring that high-level modules (Student) don't depend on low-level modules (specific resource types), but both depend on abstractions.

## Project Structure

```
/workspaces/solidWithDesignPattern/
├── README.md
└── src/labAssignment6/
    ├── LibraryResource.java          # Abstraction: Interface for all library resources
    ├── Book.java                     # Concrete Implementation: Book resource
    ├── Journal.java                  # Concrete Implementation: Journal resource
    ├── AudioBook.java                # Concrete Implementation: Audio Book resource
    ├── Student.java                  # High-level Module: Depends on abstraction
    └── TestProgram.java              # Main: Demonstrates SOLID principles in action
```

## SOLID Principles Implementation

### 1. **Dependency Inversion Principle (DIP)** - `LibraryResource` Interface
The Student class depends on the LibraryResource abstraction rather than concrete resource classes.

**Key Implementation:**
- `Student.borrowResource(LibraryResource resource)` - Depends on interface, not concrete classes
- All resource types implement `LibraryResource` interface
- Enables loose coupling between Student and resource implementations

### 2. **Open-Closed Principle (OCP)** - Extensible Design
The system is open for extension (adding new resource types) but closed for modification (no changes to Student class).

**Benefits:**
- Add new resource types (e.g., DVD, Magazine) without modifying Student
- Existing code remains unchanged when adding new features
- Promotes code reusability and maintainability

## Class Structure

### **LibraryResource Interface**
Defines the contract for all library resources.

**Methods:**
- `getTitle()`: Returns the formatted title of the resource

### **Concrete Resource Classes**

#### `Book`
**Properties:**
- `title`: The book's title
- Returns: "Title (Book)"

#### `Journal`
**Properties:**
- `title`: The journal's title
- Returns: "Title (Journal)"

#### `AudioBook`
**Properties:**
- `title`: The audio book's title
- Returns: "Title (Audio Book)"

### **Student Class**
Represents a library user who can borrow resources.

**Methods:**
- `borrowResource(LibraryResource resource)`: Borrows any type of library resource
- Depends on abstraction, not concrete implementations

## Execution Flow

1. Create a Student instance
2. Create various LibraryResource implementations (Book, Journal, AudioBook)
3. Student borrows resources through the unified interface
4. System displays borrowing transactions

## Sample Output

```
--- Library System Transaction Log ---
Justin Mason has successfully borrowed: Head First Design Patterns (Book)
Justin Mason has successfully borrowed: ACM SIGPLAN Notices (Journal)
Justin Mason has successfully borrowed: The Pragmatic Programmer (Audio Book)
```

## Benefits of SOLID Implementation

✅ **Dependency Inversion**: High-level modules don't depend on low-level modules
✅ **Open-Closed Principle**: System extensible without modifying existing code
✅ **Loose Coupling**: Changes to resource classes don't affect Student
✅ **High Cohesion**: Each class has a single, well-defined responsibility
✅ **Testability**: Easy to mock interfaces for unit testing
✅ **Maintainability**: New resource types can be added seamlessly

## Example Walkthrough

```java
// Create a student
Student student = new Student("Justin Mason");

// Create different types of resources
LibraryResource book = new Book("Head First Design Patterns");
LibraryResource journal = new Journal("ACM SIGPLAN Notices");
LibraryResource audioBook = new AudioBook("The Pragmatic Programmer");

// Student can borrow any resource type without knowing concrete classes
student.borrowResource(book);        // Works with Book
student.borrowResource(journal);     // Works with Journal
student.borrowResource(audioBook);   // Works with AudioBook

// Adding a new resource type (e.g., DVD) requires only:
// 1. Create DVD class implementing LibraryResource
// 2. No changes needed to Student class!
```

## Key Concepts

| SOLID Principle | Implementation |
|----------------|-----------------|
| **Single Responsibility** | Each class has one reason to change |
| **Open-Closed** | Open for extension, closed for modification |
| **Liskov Substitution** | Any LibraryResource can be used where LibraryResource is expected |
| **Interface Segregation** | LibraryResource interface is minimal and focused |
| **Dependency Inversion** | Student depends on LibraryResource abstraction |

## Resource Types Comparison

| Resource Type | Title Format | Example |
|---------------|--------------|---------|
| Book | "Title (Book)" | "Design Patterns (Book)" |
| Journal | "Title (Journal)" | "IEEE Transactions (Journal)" |
| AudioBook | "Title (Audio Book)" | "Clean Code (Audio Book)" |

## How to Run

Compile and run the main class:
```bash
cd /workspaces/solidWithDesignPattern/src
javac labAssignment6/*.java
java labAssignment6.TestProgram
```

Or use your preferred Java IDE to execute `TestProgram.java`.

## Learning Objectives

This assignment demonstrates:
- Understanding of SOLID design principles
- Implementation of dependency injection through interfaces
- Benefits of abstraction in software design
- How to create extensible and maintainable code
- Real-world application of design patterns in library systems

## UML Diagram
![alt text](https://github.com/ramdcrz/solidWithDesignPattern/blob/main/solidWithDesignPattern_UML.png)