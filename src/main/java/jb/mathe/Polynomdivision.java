package jb.mathe;

public class Polynomdivision {
    private final Funktion dividend;
    private final Funktion divisor;
    private final Funktion quotient;

    public Polynomdivision(Funktion dividend, Funktion divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotient = new Funktion(dividend.getGrad() - divisor.getGrad());
        calculate();
    }

    //Calculate the quotient
    private void calculate() {
        // Lokale Variablen, die nur in dieser Methode verwendet werden.
        // Damit wird sichergestellt, dass die Variablen nicht überschrieben werden
        int[] dividendKoeffizienten = this.dividend.getKoeffizienten().clone();
        int[] divisorKoeffizienten = this.divisor.getKoeffizienten().clone();
        int[] quotientKoeffizienten = this.quotient.getKoeffizienten().clone();
        int tempQuotient;
        int tempDividendGrad = this.dividend.getGrad();
        int tempQuotientGrad = this.quotient.getGrad();
        int[] tempDividendKoeffizienten; //Zwischenspeicher für die Koeffizienten des Dividenden

        // Kopie der Koeffizienten des Dividenden, damit dividendKoeffizienten nicht überschrieben werden
        tempDividendKoeffizienten = this.dividend.getKoeffizienten().clone();


        quotientKoeffizienten[this.quotient.getGrad()] = dividendKoeffizienten[this.dividend.getGrad()] / divisorKoeffizienten[this.divisor.getGrad()];
        tempQuotient = quotientKoeffizienten[this.quotient.getGrad()]; // Quotient der ausgerechnet wurde

        // Achtung! der tempDividendGrad wird hier verändert, die anderen Variablen nicht!
        calculateTempDividendKoeffizienten(tempDividendKoeffizienten, tempDividendGrad, tempQuotient, divisorKoeffizienten);

        for (int i = tempQuotientGrad; i > 0; i--) {
            tempQuotientGrad -= 1;
            tempDividendGrad -= 1;
            quotientKoeffizienten[tempQuotientGrad] = tempDividendKoeffizienten[tempDividendGrad] / divisorKoeffizienten[this.divisor.getGrad()];
            tempQuotient = quotientKoeffizienten[tempQuotientGrad];

            // Achtung! der tempDividendGrad wird hier verändert, die anderen Variablen nicht!
            calculateTempDividendKoeffizienten(tempDividendKoeffizienten, tempDividendGrad, tempQuotient, divisorKoeffizienten);
        }

        this.quotient.setKoeffizienten(quotientKoeffizienten);
    }

    private void calculateTempDividendKoeffizienten(int[] tempKoeffizienten, int tempDividendGrad, int tempQuotient, int[] divisorKoeffizienten) {
        for (int i = this.divisor.getGrad(); i >= 0; i--) {
            tempKoeffizienten[tempDividendGrad] -= tempQuotient * divisorKoeffizienten[i];
            tempDividendGrad--;
        }
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
