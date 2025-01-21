package org.example;

abstract class LibraryItem {
    private String inventoryNumber;
    private String author;

    public LibraryItem(String inventoryNumber, String author) {
        this.inventoryNumber = inventoryNumber;
        this.author = author;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getItemType();

    @Override
    public String toString() {
        return getItemType() + " [Inventory Number: " + inventoryNumber + ", Author: " + author + "]";
    }
}

