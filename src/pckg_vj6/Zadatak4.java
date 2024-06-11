package pckg_vj6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Zadatak4 {
    public static void main(String[] args) {
        Robot flying_robot = new Robot(1, "flying  robot");
        Robot cleaning_robot = new Robot(2, "cleaning  robot");
        Robot thinking_robot = new Robot(3, "thinking  robot");
        Robot humorous_robot = new Robot(4, "humorous  robot");
        Robot friendly_robot = new Robot(5, "friendly  robot");
        Robot weird_robot = new Robot(6, "weird  robot");

        LinkedHashMap<Integer, Robot> robotsMap = new LinkedHashMap<>();

        robotsMap.put(1, flying_robot);
        robotsMap.put(2, cleaning_robot);
        robotsMap.put(3, thinking_robot);
        robotsMap.put(4, humorous_robot);
        robotsMap.put(5, friendly_robot);
        robotsMap.put(6, weird_robot);
        robotsMap.put(5,friendly_robot);
        LinkedHashSet<Robot> robotsSet = new LinkedHashSet<>(robotsMap.values());
        robotsSet.add(friendly_robot);
        System.out.println("*************************** SET ********************");
        for (Robot robot : robotsSet) {
            System.out.println(robot.toString());
        }
        System.out.println("*************************** MAP ********************");
        for (Integer key : robotsMap.keySet()) {
            System.out.println(robotsMap.get(key).toString());
        }

        // NE MOGU SE DODATI DUPLICIRANI OBJEKTI
    }


}
