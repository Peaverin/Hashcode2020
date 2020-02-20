import java.util.*;

public class Book {
  int value;
  public int get_value() {
    return value;
  }

  public void set_value(int v){
    value = v;
  }

  public bolean es_mejor_que(Book a){
    return value >= a.get_value();
  }


}
