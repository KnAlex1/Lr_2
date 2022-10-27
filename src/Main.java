import com.book.Book;

public class Main
{
    public static void main(String[] args)
    {
        Book[] objects = new Book[4];

        objects[0] = new Book(1,"Harry Potter","J.K.Rowling","Bloomsbury",1997,350, 250);
        objects[1] = new Book(2,"Lord of the Rings","J.R.R.Tolkien","Bloomsbury",1954,370, 700);
        objects[2] = new Book(3,"The Hobbit","J.R.R.Tolkien","Bloomsbury",1937,370, 700);
        objects[3] = new Book(4,"The Alchemist","Paulo Coelho","Bloomsbury",1988,370, 700);

        Book.printBooksByAuthor(objects);
        Book.printBooksByPublications(objects);
        Book.printBooksByYear(objects);
    }
}

