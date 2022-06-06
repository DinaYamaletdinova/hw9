public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Tolkien");
        Author author2 = new Author("Howard", "Lovecraft");

        Book book1 = new Book("The Hobbit, or There and Back Again", author1, 1937);
        Book book2 = new Book("At the Mountains of Madness", author2, 1936);

        System.out.println(book1.getAuthor().getFullName()+ " " + book1.getTitle()+" "+book1.getYear());
        System.out.println(book2.getAuthor().getFullName()+ " " + book2.getTitle()+" "+book2.getYear());
    }

}