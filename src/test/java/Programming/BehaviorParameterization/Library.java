package Programming.BehaviorParameterization;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {

        List<Book> booksName = new ArrayList<>();
        booksName.add(new Book("selenium"));
        booksName.add(new Book("java"));
        booksName.add(new Book("aws"));

        List<Book> booksPageCount = new ArrayList<>();
        booksPageCount.add(new Book(10));
        booksPageCount.add(new Book(120));
        booksPageCount.add(new Book(150));

        List<Book> longNovalIs = findLongNovals(booksPageCount);
        System.out.println(longNovalIs.toString());
    }

    public static List<Book> findLongNovals(List<Book> books){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getPageCount() > 140){
                result.add(book);
            }
        }
        return result;
    }
}
