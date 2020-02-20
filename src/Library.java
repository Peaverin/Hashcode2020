import java.util.Comparator;
import java.util.SortedSet;

public class Library {
    private int id;
    private SortedSet<Book> books;
    private int nBooks;
    private int signuptime;
    private int maxscannedbooks;
    private int libraryScore;



    /*public Library(SortedSet<Book> books, int signuptime, int maxscannedbooks) {
        this.nBooks = books.size();
        this.signuptime = signuptime;
        this.maxscannedbooks = maxscannedbooks;
    }*/

    /*public int calScore(){
        int aux = 0;
        for (int i = 0; i < nBooks; i++)
            aux += books.(i).get_value();
        return aux;
    }*/

    public void addBook(){
        Book aux = new Book();
        books.add()
    }



    //return false if the library 1 is worse than library 2
    public boolean bestLibrary(Library l1, Library l2){
        //aqui se decidira las prioridades
        if(getSignuptime() <= l2.getSignuptime()) {
            if(getMaxscannedbooks() <= l2.getMaxscannedbooks()){
                if (getLibraryScore() >= l2.getMaxscannedbooks()){
                    return true;
                }
            }
        }
        return false;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getnBooks() {
        return nBooks;
    }

    public int getSignuptime() {
        return signuptime;
    }

    public int getMaxscannedbooks() {
        return maxscannedbooks;
    }

    public int getLibraryScore() {
        return libraryScore;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setnBooks(int nBooks) {
        this.nBooks = nBooks;
    }

    public void setSignuptime(int signuptime) {
        this.signuptime = signuptime;
    }

    public void setMaxscannedbooks(int maxscannedbooks) {
        this.maxscannedbooks = maxscannedbooks;
    }

    public void setLibraryScore(int libraryScore) {
        this.libraryScore = libraryScore;
    }
}
