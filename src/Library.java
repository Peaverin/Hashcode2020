import java.util.SortedSet;
import java.util.TreeSet;

public class Library implements Comparable<Library> {
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
        libraryBooks = new TreeSet<>();
    }

    public void addBook(Book book){
        libraryBooks.add(book);
        libraryScore += book.value;
        book.addLibrary(this);
    }

    public boolean isEmpty(){
        return libraryBooks.isEmpty();
    }

    public Book pollLast() {
        Book book = libraryBooks.pollLast();
        libraryScore -= book.get_value();
        for(int i = 0;i<book.libraries.size();i++){
            book.libraries.get(i).libraryBooks.remove(book);
            book.libraries.get(i).setnBooks(book.libraries.get(i).nBooks - 1);
        }
        nBooks--;
        return book;
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

    public int getId(){
        return id;
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

    @Override
    public int compareTo(Library l2) {
        if(id == l2.getId()) return 0;
        /*if(getSignuptime() < l2.getSignuptime()) {
            return 1;
        }
        return -1;*/
        int l1Points, l2Points;
        l1Points = l2Points = 0;
        if(getSignuptime() < l2.getSignuptime()) {
            l1Points+=1;
        }
        else
            l2Points+=1;

        if(getLibraryScore() < l2.getLibraryScore()) {
            l1Points+=1;
        }
        else
            l2Points+=1;

        if(getMaxscannedbooks() > l2.getMaxscannedbooks()) {
            l1Points+=2;
        }
        else
            l2Points+=2;

        if(l1Points >= l2Points){
            return 1;
        }
        return -1;
    }
        /*int l1Points, l2Points;
        l1Points = l2Points = 0;
        if(getSignuptime() < l2.getSignuptime()) {
            l1Points+=1;
        }
        else
            l2Points+=1;

        if(getLibraryScore() < l2.getLibraryScore()) {
            l1Points++;
        }
        else
            l2Points+=1;

        if(getMaxscannedbooks() > l2.getMaxscannedbooks()) {
            l1Points+=1;
        }
        else
            l2Points+=1;

        if(l1Points >= l2Points){
            return 1;
        }
        return -1;
    }
    */
    @Override
    public boolean equals(Object obj) {
        return id == ((Library)obj).getId();
    }
}
