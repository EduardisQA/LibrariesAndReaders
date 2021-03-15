

public class User {
    private String name;
    private String lastName;
    private int ticketNumber;
    private Library linkedLibrary;

    public User(String name, String lastName, int ticketNumber, Library linkedLibrary) {
        this.name = name;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
        this.linkedLibrary = linkedLibrary;

    }

    public String getName() {
        return name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void takeBook(Book book) {
        linkedLibrary.takeBook(this, book);
    }

    public void returnBook(Book book) {
        linkedLibrary.returnBook(this, book);
    }

    public int mustReturnBooksCount() {
        return linkedLibrary.mustReturnBooksByUserCount(this);
    }
}