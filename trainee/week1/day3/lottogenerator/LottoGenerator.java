package de.brightstraining.trainee.week1.day3.lottogenerator;

public class LottoGenerator {
    public int[] generiereZahlen() {
        int[] lottozahlen = new int[6];

        for (int ziehung = 0; ziehung < lottozahlen.length; ziehung++) {
            lottozahlen[ziehung] = (int) (Math.random() * 49) + 1;
            // System.out.println(lottozahlen);

            for (int neueZiehung = 0; neueZiehung < ziehung; neueZiehung++) {
                if (lottozahlen[neueZiehung] == lottozahlen[ziehung]) {
                    ziehung--;
                }
            }
        }
        return lottozahlen;
    }
}