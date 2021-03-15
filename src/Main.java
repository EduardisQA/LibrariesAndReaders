

class Main {
    public static void main(String[] args) {
        Book book1 = new Book("label1", "author1");
        Book book2 = new Book("label2", "author2");
        Book book3 = new Book("label3", "author3");
        Library library = new Library(book1, book2);
        User user1 = new User("Eduard", "lastName1", 1, library);
        User user2 = new User("Anton", "lastName2", 2, library);

        user1.takeBook(book1);
        user1.takeBook(book2);
        user1.takeBook(book3);

        user2.takeBook(book2);

        System.out.println(user1.getName() + ": " + user1.mustReturnBooksCount());
        System.out.println(user2.getName() + ": " + user2.mustReturnBooksCount());
        user1.returnBook(book1);
        user2.returnBook(book2);
        System.out.println(user1.getName() + ": " + user1.mustReturnBooksCount());
        System.out.println(user2.getName() + ": " + user2.mustReturnBooksCount());
    }
}