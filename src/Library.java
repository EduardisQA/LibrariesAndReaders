import java.util.*;

public class Library {
    private Set<Book> booksSet = new HashSet<>();
    private Map<Integer, List<Book>> booksMap = new HashMap<>();

    public Library(Book ... books) {
        for (Book book : books) {
            this.booksSet.add(book);
        }
    }
    public void takeBook(User user, Book book) {
        if (!booksSet.contains(book)) System.out.println("book not exist");
        else {
            List<Book> books = booksMap.get(user.getTicketNumber());
            if (books == null) {
                books = new LinkedList<>();
                booksMap.put(user.getTicketNumber(), books);
            }
            books.add(book);
        }
    }

    public void returnBook(User user, Book book) {
        List<Book> books = booksMap.get(user.getTicketNumber());
        if (books != null) {
            books.remove(book);
        }
    }

    public int mustReturnBooksByUserCount(User user) {
        List<Book> books = booksMap.get(user.getTicketNumber());
        if (books == null) {
            return 0;
        }
        return books.size();
    }
}

