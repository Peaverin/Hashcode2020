import java.io.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int AMOUNT = 100;
    public static void main(String[] args) {
        long totalTime = 0;
        long[] totalTimes = new long[5];
        int[] scores = new int[5];
        final String[] fileNames = new String[]{"a_example","b_lovely_landscapes","c_memorable_moments","d_pet_pictures", "e_shiny_selfies"};
        IO io = new IO();
        for (int i = 0;i<fileNames.length;i++) {
            String fileName = fileNames[i];
            long startTime = System.nanoTime();

            //DO WORK HERE:

            //Calculate elapsed time:
            long endTime = System.nanoTime();
            long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
            long durationInMilli = TimeUnit.NANOSECONDS.toMillis(durationInNano);
            totalTimes[i] = durationInMilli;
            totalTime += durationInMilli;

            //Calculate score:
            int score = 0;
            //CALCULATE SCORE HERE:

            scores[i] = score;
            //Output solution:
            io.outputSolution(System.getProperty("user.dir")+"/"+fileName+"_sol_" + AMOUNT +"_"+durationInMilli +".txt");

            //Print time and score:
            System.out.println(fileName + ": " + durationInMilli + "ms | Score: " + score);
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir")+"/TimesLog/Times_with_AMOUNT="+AMOUNT+".txt", "UTF-8");
            writer.println("AMOUNT = " + AMOUNT);
            int totalScore = 0;
            for(int i = 0;i<fileNames.length;i++){
                writer.println(fileNames[i] + ": " + totalTimes[i] + "ms | Score: " + scores[i]);
                totalScore += scores[i];
            }
            writer.println("Total time: " + totalTime + "ms | Total Score: " + totalScore);
            writer.close();
            System.out.println("Total time: " + totalTime + "ms | Total Score: " + totalScore);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
