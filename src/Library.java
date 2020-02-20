import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Library {
    private int id;


    private TreeSet<Book> libraryBooks;
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


    public Library(int nBooks, int signuptime, int maxscannedbooks) {
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


    //return true if the library 1 is better than library 2
    public boolean bestLibrary_a(Library l1, Library l2){
        int l1Points, l2Points;
        l1Points = l2Points = 0;
        if(l1.getSignuptime() < l2.getSignuptime()) {
            l1Points+=1;
        }
        else
            l2Points+=1;

        if(l1.getLibraryScore() < l2.getLibraryScore()) {
            l1Points++;
        }
        else
            l2Points+=1;

        if(l1.getMaxscannedbooks() > l2.getMaxscannedbooks()) {
            l1Points+=1;
        }
        else
            l2Points+=1;

        if(l1Points >= l2Points){
            return true;
        }
        return false;
    }

    //return true if the library 1 is better than library 2
    public boolean bestLibrary_b(Library l1, Library l2){
        if(getSignuptime() < l2.getSignuptime()) {
            return true;
        }
        return false;
    }


    //return true if the library 1 is better than library 2
    public boolean bestLibrary_c(Library l1, Library l2){
        int l1Points, l2Points;
        l1Points = l2Points = 0;

        int mediaPuntos1, mediaPuntos2;
        mediaPuntos1 = mediaPuntos2 = 0;
        //mediaPuntos1 = l1.getLibraryScore()/Main.days;
        //mediaPuntos2 = l2.getLibraryScore()/Main.days;

        //SUPONIENDO QUE EL NUMERO DE LIBROS QUE ENVIAN ES IGUAL
        if(l1.getSignuptime() < l2.getSignuptime()) {
            int daydif = l2.getSignuptime() - l1.getSignuptime();
            if(mediaPuntos1*daydif > (l2.getLibraryScore()-l1.getLibraryScore())){
                return true;
            }
        }
        return false;
    }



    public TreeSet<Book> getLibraryBooks() {
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
