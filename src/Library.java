

public class Library {
    private Book[] books;
    private int nBooks;
    private int signuptime;
    private int maxscannedbooks;
    private int libraryScore;

    public Library(int nBooks, int signuptime, int maxscannedbooks){
        this.nBooks = nBooks;
        this.signuptime = signuptime;
        this.maxscannedbooks = maxscannedbooks;
    }


    public Library(Book[] books, int nBooks, int signuptime, int maxscannedbooks, int libraryScore) {
        this.books = books;
        this.nBooks = books.length;
        this.signuptime = signuptime;
        this.maxscannedbooks = maxscannedbooks;
        this.libraryScore = calScore();
    }

    public int calScore(){
        int aux = 0;
        for (int i = 0; i < nBooks; i++)
            aux += books[i].get_value();
        return aux;
    }

    //return false if the library
    public boolean bestLibrary(Library l1, Library l2){
        //aqui se decidira las prioridades
        //if(signuptime <= )

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
