

public class Library {
    public Book[] books;
    public int nBooks;
    public int signuptime;
    public int maxscannedbooks;
    public int libraryScore;


    public void calScore(){
        int aux = 0;
        for (int i = 0; i < nBooks; i++)
            aux += books[i].get_value();
        libraryScore = aux;
    }
}
