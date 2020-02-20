import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int AMOUNT = 100;
    public static ArrayList<Book> books;
    public static TreeSet<Library> libraries;

    public static void main(String[] args) {
        long totalTime = 0;
        long[] totalTimes = new long[6];
        int[] scores = new int[6];
        final String[] fileNames = new String[]{"a_example","b_read_on","c_incunabula","d_tough_choices", "e_so_many_books", "f_libraries_of_the_world"};
        //final String[] fileNames = new String[]{"b_read_on"};
        IO io = new IO();
        for (int i = 0;i<fileNames.length;i++) {
            books = new ArrayList<>();
            libraries = new TreeSet<>();
            String fileName = fileNames[i];
            long startTime = System.nanoTime();
            //Read everything:
            io.readInput(System.getProperty("user.dir")+"/"+fileName+".txt");

            //DO WORK HERE:
            solutionB(fileName);

            //Calculate elapsed time:
            long endTime = System.nanoTime();
            long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
            long durationInMilli = TimeUnit.NANOSECONDS.toMillis(durationInNano);
            totalTimes[i] = durationInMilli;
            totalTime += durationInMilli;

            //Print time and score:
            System.out.println(fileName + ": " + durationInMilli + "ms");
        }
    }

    public static void solutionB(String fileName){
        int nlib = 0;
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir")+"/Solutions/"+fileName+".txt", "UTF-8");
            writer.println(libraries.size());
            while(!libraries.isEmpty()){
                Library actual = libraries.pollLast();
                if(!actual.isEmpty()){
                    nlib ++;
                    writer.println(actual.getId() + " " + actual.getnBooks());
                    while(!actual.isEmpty()){
                        Book actualBook = actual.pollLast();
                        writer.print(actualBook.get_id() + " ");
                    }
                    writer.println();
                }

            }
            writer.close();
            System.out.println(nlib);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

}
