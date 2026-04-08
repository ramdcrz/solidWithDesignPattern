package labAssignment6;

public class AudioBook implements LibraryResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title + " (Audio Book)";
    }
}