package pckg_vj9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpaceApp {
    public static void main(String[] args) {
        SpaceScientist scientist1 = new SpaceScientist("Nuvo Vindi ","microbiologist",new ArrayList<String>(Arrays.asList("test tube", "petri  dish", "pipette")), new Species("Faust", "Adana" ));
        SpaceScientist scientist2 = new SpaceScientist("Jar Jar Thinks","physicist",new ArrayList<String>(Arrays.asList("dust detectors", "magnetometer", "plasma wave detector")), new Species("Gungan", "Naboo" ));
        List<SpaceScientist> scientists = new ArrayList<>();
        scientists.add(scientist1);
        scientists.add(scientist2);

        SpaceHandlers.saveObjectToFile("spaceScientists.bin", scientists);
        List<SpaceScientist> readScientists = SpaceHandlers.loadObjectFromFile("spaceScientists.bin");
        listSpaceScientists(readScientists);

    }

    private static void listSpaceScientists(List<SpaceScientist> scientists) {
        scientists.forEach(SpaceScientist ->{
            System.out.println(SpaceScientist.toString());
        });
    }
}
