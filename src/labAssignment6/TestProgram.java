package labAssignment6;

public class TestProgram {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Justin Mason");

        // Create various resources
        LibraryResource book = new Book("Head First Design Patterns");
        LibraryResource journal = new Journal("ACM SIGPLAN Notices");
        
        // Demonstrating extensibility without changing the Student class
        LibraryResource audioBook = new AudioBook("The Pragmatic Programmer");

        // The student can borrow any resource seamlessly
        System.out.println("--- Library System Transaction Log ---");
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(audioBook);
    }
}