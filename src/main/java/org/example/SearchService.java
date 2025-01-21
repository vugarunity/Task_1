package org.example;

import java.util.List;

public class SearchService {
    private List<LibraryItem> libraryItems;

    public SearchService(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        return libraryItems.stream()
                .filter(item -> item.getInventoryNumber().equals(inventoryNumber))
                .toList();
    }

    public List<LibraryItem> searchByAuthor(String author) {
        return libraryItems.stream()
                .filter(item -> item.getAuthor().equalsIgnoreCase(author))
                .toList();
    }
}
