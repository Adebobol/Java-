class Book {
    String title;
    int page;

    Book(String title, int page){

        this.title = title;
        this.page = page;
    }

    String displayInfo(){
        return this.title + " (" + this.page + ") pages";
    }
}


class Library{
    String name;
    int year;
    Book[] books;

    Library(String name,int year,Book[] books){
        this.name = name;
        this.books = books;
        this.year = year;
    }

    void displayLibraryInfo(){
        System.out.printf("The %d %s.",year,name);
        System.out.println();
        System.out.println("Books Available: ");
        System.out.println();
        for(Book book : books ){
            System.out.println(book.displayInfo());
        }
    }
}








public class Aggregation {
    public static void main(String[] args) {
        
        // Aggregation = Represents a "has-a" relationships between objects.
        // One objects contains another object as part of its structure, but the contained objects can exist independently.

        Book book1 = new Book("Flower bloosom",137);
        Book book2 = new Book("Leaving nothing behind",370);

        Book[] books = {book1,book2};

        Library library = new Library("Anifowose Library", 2003, books);

        for (Book book : books){
            System.out.println(book.displayInfo());
        }
          
        library.displayLibraryInfo();



    }
}
