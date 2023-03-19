public class Main {
    public static void main(String[] args) {

        //создайте несколько объектов «Книга» (достаточно двух) и
        // несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.

        //author
        Author author = new Author("Лев", "Толстой");
        Author author2 = new Author("Гузель", "Яхина");

        //book

        Book book2 = new Book("Гордость и предубеждения", author, 1222);
        Book book1 = new Book("Living Time", author2,1890);



        //В том же методе main измените год публикации одной из книг с помощью сеттера.

        book1.setYear(1120);
        System.out.println(book1.toString());
        System.out.println("book1.year = " + book1.getYear());
        System.out.println("book2.author = " + book2.getAuthor());
    }
}