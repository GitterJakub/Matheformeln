package jb.dm;

public class Algorithmen {
    public Algorithmen() {
    }

    public static int ggT(int a, int b) {
        System.out.println("ggt(" + a + "," + b + ")");
        if (b == 0) return a;
        if (a==0) return b;
        if (a<b) return ggT(b%a, a);
        return ggT(b, a%b);
    }

    public static void teilenMitRest(int dividend, int divisor) {
        System.out.println("teilenMitRest(" + dividend + "," + divisor + ")");
        if (divisor <= 0){
            throw new IllegalArgumentException("b muss größer als 0 sein!");
        }
        int quotient = dividend/divisor;
        int rest = berechneRest(dividend, divisor);
        System.out.println("Quotient: " + quotient + " Rest: " + rest);
    }

    private static int berechneRest(int rest, int divisor){
        System.out.println("berechneRest(" + rest + "," + divisor + ")");
        if (rest < divisor) return rest;
        return berechneRest(rest-divisor, divisor);
    }

}
