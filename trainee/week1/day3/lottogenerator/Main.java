package de.brightstraining.trainee.week1.day3.lottogenerator;

public class Main {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] output = lottoGenerator.generiereZahlen();
        System.out.println(output);
    }
}