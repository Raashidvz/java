class Book extends Publisher {
    String bookTitle;
    double price;

    Book(String publisherName, String bookTitle, double price) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.price = price;
    }
}