import java.io.*;

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
            int[] scores = new int[nBooks];
            sCurrentLine = br.readLine();
            splited = sCurrentLine.split("\\s+"); //split by spaces
            for(int i = 0; i<nBooks ; i++){

                scores[i] = Integer.parseInt(splited[i]);
            }


            while ((sCurrentLine = br.readLine()) != null) {
                //DO STUFF HERE//
                splited = sCurrentLine.split("\\s+"); //split by spaces
                //tagsNumber = Integer.parseInt(splited[1]);
            }
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
