import java.util.*;

public class Book implements Comparable<Book> {
  int id;
  int value;
  int num_libs;
  public ArrayList<Library> libraries ;

  public Book(int id, int value){
      this.id = id;
      this.value = value;
      libraries = new ArrayList<Library>();
  }

  public Book(int id, int value, int num_libs){
      this.id = id;
      this.value = value;
      this.num_libs = num_libs;
      libraries = new ArrayList<Library>();
  }

  public int get_id() {
    return id;
  }

  public void set_id(int v){
    value = v;
  }

  public int get_value() {
    return value;
  }

  public void set_value(int v){
    value = v;
  }

  public boolean is_better_than(Book a){
    return value >= a.get_value();
  }

  public void addLibrary(Library library){
    libraries.add(library);
  }

    @Override
    public int compareTo(Book b) {
        if (id == b.id) return 0;
        if (value == b.value) return b.id - id;
        return value - b.value;
    }
}
