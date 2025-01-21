package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryRegistry {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("001", "Author A"));
        items.add(new Journal("002", "Author B"));
        items.add(new Book("003", "Author A"));
        items.add(new Journal("004", "Author C"));

        SearchService searchService = new SearchService(items);

        System.out.println("Search by Inventory Number '001':");
        searchService.searchByInventoryNumber("001").forEach(System.out::println);

        System.out.println("Search by Inventory Number '002':");
        searchService.searchByInventoryNumber("002").forEach(System.out::println);

        System.out.println("\nSearch by Author 'Author A':");
        searchService.searchByAuthor("Author A").forEach(System.out::println);
    }
}
