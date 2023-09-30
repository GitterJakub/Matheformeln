package jb.mathe;

public class Main {
    public static void main(String[] args) {
        //Simulate an easy example of the polynomdivision
        Funktion dividend = new Funktion(5);
        dividend.setKoeffizienten(new int[] {-4, 6, 1, 5,-4,-6});
        Funktion divisor = new Funktion(3);
        divisor.setKoeffizienten(new int[] {1, -1, 0,-2});

        Polynomdivision polynomdivision = new Polynomdivision(dividend, divisor);
        polynomdivision.print();

        //Beispiel 2 (x^7-x^6+3x^5+3x^4-6x^3) / (x^3-x^2)
        Funktion dividend2 = new Funktion(7);
        dividend2.setKoeffizienten(new int[] {0,0,0,-6,3,3,-1,1});
        Funktion divisor2 = new Funktion(3);
        divisor2.setKoeffizienten(new int[] {0,0,-1,1});

        Polynomdivision polynomdivision2 = new Polynomdivision(dividend2, divisor2);
        polynomdivision2.print();

    }
}