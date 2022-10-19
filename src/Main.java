import java.io.*;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         FileWriter fileToWrite = null;
         PrintWriter printWriterFile = null;

         String gitBashPath = "C:\\Program Files\\Git\\git-bash";
         ProcessBuilder processBuilder = new ProcessBuilder();
         processBuilder.command(gitBashPath, "-c", "cat in.txt | wc > out.txt");

         try {

             File directory = new File ("./data");
             directory.mkdir();
             File file = new File (directory, "in.txt");
             file.createNewFile();

             fileToWrite = new FileWriter("./data/in.txt");
             printWriterFile = new PrintWriter(fileToWrite);

             Scanner scanner = new Scanner(System.in);
             String writeOnFile = scanner.nextLine();
             printWriterFile.write(writeOnFile);

             try {
                 String outFilePath = "./data/out.txt";
                 File writewc = new File(outFilePath);
                 processBuilder.directory(new File("./data"));
                 processBuilder.start();
             } catch (IOException error) {
                 error.printStackTrace();
             }

         } catch (Exception error) {
             error.printStackTrace();
         } finally {
             try {
                 if (null != fileToWrite)
                     fileToWrite.close();
             } catch (Exception error2) {
                 error2.printStackTrace();
             }
         }
     }
}