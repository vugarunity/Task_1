package org.example;

public class Journal extends LibraryItem {
    public Journal(String inventoryNumber, String author) {
        super(inventoryNumber, author);
    }

    @Override
    public String getItemType() {
        return "Journal";
    }
}