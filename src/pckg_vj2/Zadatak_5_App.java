package pckg_vj2;

public class Zadatak_5_App {
    public static void main(String[] args) {
        int[][] profiti = {{1, 125855, 105625, 0},
                {2, 284569, 155748, 0},
                {3, 324152, 198455, 0},
                {4, 204563, 195251, 0},
                {5, 452198, 257654, 0},
                {6, 471326, 322188, 0},
                {7, 505169, 355748, 0},
                {8, 498569, 315782, 0},
                {9, 367163, 389455, 0},
                {10, 289568, 302369, 0},
                {11, 115255, 109854, 0},
                {12, 98544, 85223, 0}};
        String[] naslovi = {"mjesec", "prihod", "rashod", "profit u mjesecu"};
        double prosjecni_profit = 0;
        for (int[] rw : profiti) {
            rw[3] = rw[1] - rw[2];
            prosjecni_profit += rw[3];
        }
        prosjecni_profit /= 12;
        prosjecni_profit = (double) Math.round(prosjecni_profit * 100) / 100;

        for (int[] rw : profiti) {
            for (int i = 0; i < 4; i++) {
                System.out.print(naslovi[i] + ": " + rw[i] + ", ");

            }
            System.out.println();
        }
        System.out.println("Prosječni profit za promatranu godinu: " + prosjecni_profit);
    }
}
