package jb.mathe;

public class Funktion {
    private int grad;
    private int [] koeffizienten;

    public Funktion(int grad) {
        this.grad = grad;
        this.koeffizienten = new int[grad+1];
    }

    //setter for koeffizienten
    public void setKoeffizienten(int [] koeffizienten) {
        if (koeffizienten.length != this.grad+1) {
            throw new IllegalArgumentException("Koeffizienten müssen die Länge " + (this.grad+1) + " haben!");
        }
        this.koeffizienten = koeffizienten;
    }
    public int[] getKoeffizienten() {
        return this.koeffizienten;
    }

    public int getGrad() {
        return this.grad;
    }

    //Calculate the value of the function for a given x
    public int calculate(int x) {
        int result = 0;
        for (int i = 0; i < this.koeffizienten.length; i++) {
            result += (int) (this.koeffizienten[i] * Math.pow(x, i));
        }
        return result;
    }

    //Print the function
    public void print() {
        for (int i = this.koeffizienten.length-1; i >= 0; i--) {
            if (this.koeffizienten[i] != 0) {
                if (i != this.koeffizienten.length-1) {
                    System.out.print(" + ");
                }
                System.out.print(this.koeffizienten[i] + "x^" + i);
            }
        }
        System.out.println();
    }
}
