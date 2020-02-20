import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class IO {
    public void readInput(String fileName){
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String sCurrentLine;
            sCurrentLine = br.readLine();
            String[] splited;
            splited = sCurrentLine.split("\\s+"); //split by spaces

            int nBooks = Integer.parseInt(splited[0]);
            int nLibraries = Integer.parseInt(splited[1]);
            int nDays = Integer.parseInt(splited[2]);
            ArrayList<Book> books = new ArrayList<>();
            TreeSet<Library> libraries = new TreeSet<>();
            sCurrentLine = br.readLine();
            splited = sCurrentLine.split("\\s+"); //split by spaces

            //Books:
            for(int i = 0; i<nBooks ; i++){
                books.add(new Book(i, Integer.parseInt(splited[i])));
            }

            //Libraries:
            for(int i = 0; i<nLibraries; i++){
                //Load library
                sCurrentLine = br.readLine();
                splited = sCurrentLine.split("\\s+"); //split by spaces
                int amountBooks = Integer.parseInt(splited[0]);
                Library library = new Library(i, amountBooks,Integer.parseInt(splited[1]),Integer.parseInt(splited[2]));
                libraries.add(library);
                //Load books:
                sCurrentLine = br.readLine();
                splited = sCurrentLine.split("\\s+"); //split by spaces
                for(int j = 0; j<amountBooks; j++){
                    library.addBook(books.get(Integer.parseInt(splited[j])));
                }
            }
        Main.books = books;
        Main.libraries = libraries;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void outputSolution(String fileName){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            /*
            writer.println(solutionSlides.size());
            for(Slide slide : solutionSlides){
                if(!slide.isVertical()){
                    writer.println(slide.getId0());
                }else{
                    writer.println(slide.getId0() + " " + slide.getId1());
                }

            }
            */
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
