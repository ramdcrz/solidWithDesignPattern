package labAssignment6;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Unified method depending on abstraction rather than concrete classes
    public void borrowResource(LibraryResource resource) {
        System.out.println(this.name + " has successfully borrowed: " + resource.getTitle());
    }
}