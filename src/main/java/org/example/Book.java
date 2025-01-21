package org.example;

public class Book extends LibraryItem {
    public Book(String inventoryNumber, String author) {
        super(inventoryNumber, author);
    }

    @Override
    public String getItemType() {
        return "Book";
    }
}
