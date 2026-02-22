class Literature extends Book {

    Literature(String publisherName, String bookTitle, double price) {
        super(publisherName, bookTitle, price);
    }

    void display() {
        System.out.println("\nCategory: Literature");
        System.out.println("Title: " + bookTitle);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Price: " + price);
    }
}