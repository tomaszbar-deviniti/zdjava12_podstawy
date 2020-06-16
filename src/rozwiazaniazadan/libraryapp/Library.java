package rozwiazaniazadan.libraryapp;

public class Library {
    private Book[] books;
    private int nextEmptyBookSlot;

    private static final int MAX_BOOKS_COUNT = 100;

    public Library(){
        this.books = new Book[MAX_BOOKS_COUNT];
    }

    public void addBook(Book book){
        if(nextEmptyBookSlot >= books.length){
            System.out.println("Biblioteka jest pełna");
            return;
        }
        this.books[nextEmptyBookSlot++] = book;
    }

    public void printBooks(){
        for(int i=0;i<books.length;i++){//tutaj można iterować do nextEmptyBookSlot
            if(books[i] != null){ 
                System.out.println(books[i]);
            }
        }
    }

    public Book[] searchBooks(String searchQuery){
        Book[] searchResult = new Book[MAX_BOOKS_COUNT];
        int iterator = 0;

        for(int i=0;i<this.books.length;i++){
            if(books[i] != null) {
                if (books[i].getAuthor().contains(searchQuery) || books[i].getTitle().contains(searchQuery)) {
                    searchResult[iterator++] = books[i];
                }
            }
        }
        Book[] endResult = new Book[iterator];
        for(int i=0;i<endResult.length;i++){
            endResult[i] = searchResult[i];
        }
        return endResult;
    }

}
