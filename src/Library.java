

public class Library {
    public Book[] books;
    public int nBooks;
    public int signuptime;
    public int maxscannedbooks;
    public int libraryScore;

    public Library(int nBooks, int signuptime, int maxscannedbooks){
        this.nBooks = nBooks;
        this.signuptime = signuptime;
        this.maxscannedbooks = maxscannedbooks;
    }

    public void calScore(){
        int aux = 0;
        for (int i = 0; i < nBooks; i++)
            aux += books[i].get_value();
        libraryScore = aux;
    }
}
