package bookStream;

import java.util.Arrays;
import java.util.List;

public class LibraryData {

    public static List<Book> getSampleBooks() {
        return Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 4.4, 1925),
                new Book("The Midnight Library", "Matt Haig", "Fantasy", 4.1, 2020),
                new Book("Project Hail Mary", "Andy Weir", "Sci-Fi", 4.7, 2021),
                new Book("The Martian", "Andy Weir", "Sci-Fi", 4.6, 2011),
                new Book("Java for Dummies", "Barry Burd", "Tech", 3.2, 2017),
                new Book("Generic Mystery 1", "John Doe", "Mystery", 2.1, 2023),
                new Book("Generic Mystery 2", "John Doe", "Mystery", 1.8, 2024),
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.8, 1937),
                new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "Fantasy", 4.9, 1954),
                new Book("Foundation", "Isaac Asimov", "Sci-Fi", 4.5, 1951),
                new Book("I, Robot", "Isaac Asimov", "Sci-Fi", 4.2, 1950),
                new Book("Cooking with Cardboard", "Chef Bad", "Culinary", 1.2, 2022),
                new Book("Normal People", "Sally Rooney", "Romance", 3.8, 2018),
                new Book("Brave New World", "Aldous Huxley", "Dystopian", 4.3, 1932),
                new Book("A Really Bad Romance", "John Doe", "Romance", 2.5, 2021),
                new Book("1984", "George Orwell", "Dystopian", 4.7, 1949),
                new Book("Animal Farm", "George Orwell", "Dystopian", 4.6, 1945)
        );
    }
}