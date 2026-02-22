class Fiction extends Book {

    Fiction(String publisherName, String bookTitle, double price) {
        super(publisherName, bookTitle, price);
    }

    void display() {
        System.out.println("\nCategory: Fiction");
        System.out.println("Title: " + bookTitle);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Price: " + price);
    }
}