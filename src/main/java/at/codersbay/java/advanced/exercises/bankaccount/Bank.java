package at.codersbay.java.advanced.exercises.bankaccount;

public class Bank {

    public void einzahlen(double betrag, Bankkonto konto) {
        double kontostand = konto.getKontostand();
        kontostand = kontostand + betrag;

        konto.setKontostand(kontostand);
    }

    public void abheben(double betrag, Bankkonto konto) {
        double kontostand = konto.getKontostand();

        if(kontostand >= betrag) {
            kontostand -= betrag;
            konto.setKontostand(kontostand);
        }
    }

    public void getKontostand(Bankkonto konto) {
        System.out.println(konto.getKontostand());
    }
}