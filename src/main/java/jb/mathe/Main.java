package jb.mathe;

public class Main {
    public static void main(String[] args) {
        //Simulate an easy example of the polynomdivision
        Funktion dividend = new Funktion(3);
        dividend.setKoeffizienten(new int[] {1, 2, 3, 4});
        Funktion divisor = new Funktion(1);
        divisor.setKoeffizienten(new int[] {1, 2});
        Polynomdivision polynomdivision = new Polynomdivision(dividend, divisor);
//        polynomdivision.calculate();
        polynomdivision.print();
    }
}