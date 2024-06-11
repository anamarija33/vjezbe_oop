package pckg_vj9;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsHandling {
    public static <T> void saveObj2File(String fullPath, List<T> objcts) {
        File file = new File(fullPath);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            for(T obj: objcts){
                oos.writeObject(obj);
            }

        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static <T> List<T> readFromFile(String fullPath) {
        File file = new File(fullPath);
        List<T> objects = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(file)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available()>0){
                T ob = (T) ois.readObject();
                System.out.println(ob.toString());
                System.out.println(ob.getClass().getCanonicalName());
                objects.add(ob);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    return objects;
    }

    public static void writeIntoTxt(String filePath, ArrayList<Gunslinger> dta) {
        File file = new File(filePath);
        try(FileWriter  fw = new FileWriter(file)){
            BufferedWriter bw =  new BufferedWriter(fw);
            for (int i = 0; i < dta.size(); i++) {
                bw.flush();
                bw.write(dta.get(i).getName());
                bw.write(", ");
                int duelsWon = dta.get(i).getDuels();
                bw.write(Integer.toString(duelsWon));
                bw.write(", ");
                bw.write(dta.get(i).getStrongHand());
                bw.write(", ");
                boolean twoHanded = dta.get(i).isTwoGuns();
                bw.write(Boolean.toString(twoHanded));
                bw.write(", ");
                DateTimeFormatter dobFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedDOB = dta.get(i).getDob().format(dobFormatter);
                bw.write(formattedDOB);
                bw.newLine();
            }
            System.out.println("Finished writing into the file -> " + file.getPath());
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static List<String[]> readFromCSVFile(String fullPath) {
        List<String[]> data = new ArrayList<String[]>();
        File file = new File(fullPath);
        String[] rowData;
        String lnRow;

        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            while ((lnRow = br.readLine()) != null) {
                rowData = lnRow.split("\\s*,\\s*");
                data.add(rowData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return data;

    }

    public static void listAllDataFromFile(List<String[]> data) {
        for(String[] row: data){
            System.out.println(Arrays.toString(row));
        }
    }

    public static List<Gunslinger> recreateObjFromTxtFile(List<String[]> data) {
        List<Gunslinger> guns = new ArrayList<>();

        data.forEach(row->{
            Gunslinger gns;
            int cnt = 0;
            String name = row[cnt];
            System.out.println(name);
            cnt++;
            Integer duels = Integer.parseInt(row[cnt]);
            cnt++;
            String domHand = row[cnt];
            cnt++;
            boolean twoGuns = Boolean.parseBoolean(row[cnt]);
            cnt++;
            DateTimeFormatter dobFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dob = LocalDate.parse(row[cnt], dobFormatter);
            gns = new Gunslinger(name);
            gns.setDob(dob);
            gns.setDuels(duels);
            gns.setStrongHand(domHand);
            gns.setTwoGuns(twoGuns);
            guns.add(gns);
        });
        return guns;
    }

}
