package pckg_vj9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SpaceHandlers {


    public static <T> void saveObjectToFile(String filePath, List<T> scientists) {
        File file = new File(filePath);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for(T scientist : scientists) {

                oos.writeObject(scientist);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<SpaceScientist> loadObjectFromFile(String filePath) {
        File file = new File(filePath);
        List<SpaceScientist> scientists = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                SpaceScientist obj =(SpaceScientist)  ois.readObject();
//                System.out.println(obj.toString());
//                System.out.println(obj.getClass().getCanonicalName());
                scientists.add(obj);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return scientists;
    }

}
