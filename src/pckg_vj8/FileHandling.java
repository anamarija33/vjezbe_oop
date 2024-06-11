package pckg_vj8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {

    private static Scanner sc;
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static boolean flag;
    private static boolean userAsk;

    public static void readFileScanner(String fileName) {

        File file = new File(fileName);
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            flag = false;
            System.out.println("Reading from file was finished!!!");
        } catch (FileNotFoundException e) {
            Scanner scnr = new Scanner(System.in);
            String inpt;
            System.out.println("File: " + file.toString() + " can not be found!!!" );
            System.out.println("Want to try again -> y for YES any other for NO...");
            inpt = scnr.nextLine();
            inpt = inpt.toLowerCase();
            if(inpt.equals("y")) {
                userAsk = true;
            } else {
                userAsk = false;
                System.out.println("User finished with exit code = YES!!!");
                System.out.println("No file was readed!!!");
                scnr.close();
            }
        }
    }

    public static void readFileBufferedReader(String fileName) {

        File file = new File(fileName);

        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while((line=br.readLine())!= null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File: " + file.toString() + " can not be found!!!" );
        } catch (IOException e) {
            System.out.println("Can not read from file -> " + file.toString());
        }
    }

    public static void write2File(String fileName) {

        File file = new File(fileName);
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write("Neki string kojeg zapisujemo u datoteku...\n");
            bw.append("Novi tekst u novoj liniji ...\n");
            bw.flush();
            bw.close();
            System.out.println("Finished...");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void askUser4File() {

        flag = true;
        userAsk = true;
        Scanner scn = new Scanner(System.in);
        String fileName;
        boolean userYes = true;

        while(flag & userAsk) {
            System.out.println("Enter file name:");
            fileName = scn.nextLine();
            readFileScanner(fileName);

        }

        scn.close();

    }
}
