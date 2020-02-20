import java.util.SortedSet;

public class Library {
    private int id;
    private SortedSet<Book> libraryBooks;
    private int nBooks;
    private int signuptime;
    private int maxscannedbooks;
    private int libraryScore;

    public Library(int id, int nBooks, int signuptime, int maxscannedbooks) {
        this.id = id;
        this.nBooks = nBooks;
        this.signuptime = signuptime;
        this.maxscannedbooks = maxscannedbooks;
    }

    public void addBook(int id, int value){
        Book aux = new Book(id, value);
        libraryBooks.add(aux);
        libraryScore += value;
    }

    public void removeBook(int id, int value) {
        //Book aux = books.get(id);
        Book aux = new Book(id, value);
        libraryBooks.remove(aux);
        libraryScore -= aux.get_value();
    }

    //return true if the library 1 is better than library 2
    public boolean bestLibrary(Library l1, Library l2){
        //aqui se decidira las prioridades
        if(getSignuptime() <= l2.getSignuptime()) {
            return true;
            /*
            if(getMaxscannedbooks() <= l2.getMaxscannedbooks()){
                /*if (getLibraryScore() >= l2.getMaxscannedbooks()){
                    return true;
                }*/

        }
        return false;
    }

    public SortedSet<Book> getLibraryBooks() {
        return libraryBooks;
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
