import java.util.*;

public class Book {
  int id;
  int value;
  int num_libs;
  public Library[] libraries ;

  public Book(int id, int value){
      this.id = id;
      this.value = value;
  }

  public Book(int id, int value, int num_libs){
      this.id = id;
      this.value = value;
      this.num_libs = num_libs;
      libraries = new Library[num_libs];
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

  public int compare(Book a, Book b) {
    return a - b;
  }


}
