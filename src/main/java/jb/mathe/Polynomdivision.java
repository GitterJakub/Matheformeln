package jb.mathe;

public class Polynomdivision {
    private Funktion dividend;
    private Funktion divisor;
    private Funktion quotient;

    public Polynomdivision(Funktion dividend, Funktion divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotient = new Funktion(dividend.getGrad() - divisor.getGrad());
    }

    //Calculate the quotient
//    public void calculate() {
//        int [] dividendKoeffizienten = this.dividend.getKoeffizienten();
//        int [] divisorKoeffizienten = this.divisor.getKoeffizienten();
//        int [] quotientKoeffizienten = this.quotient.getKoeffizienten();
//
//        for (int i = 0; i < quotientKoeffizienten.length; i++) {
//            quotientKoeffizienten[i] = dividendKoeffizienten[i] / divisorKoeffizienten[0];
//            for (int j = 0; j < divisorKoeffizienten.length; j++) {
//                dividendKoeffizienten[i+j] -= quotientKoeffizienten[i] * divisorKoeffizienten[j];
//            }
//        }
//    }

    //Calculate the qutioent and return it
    public Funktion getQuotient() {
//        this.calculate();
        return this.quotient;
    }

    //Print the dividend, divisor and quotient
    public void print() {
        System.out.print("Dividend: ");
        this.dividend.print();
        System.out.print("Divisor: ");
        this.divisor.print();
        System.out.print("Quotient: ");
        this.quotient.print();
    }
}
