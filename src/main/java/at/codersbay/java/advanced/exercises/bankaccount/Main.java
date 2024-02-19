package at.codersbay.java.advanced.exercises.bankaccount;

public class Main {

    public static void main(String[] args) {

        Bankkonto konto = new Bankkonto();
        konto.setInhaber("Max Mustermann");
        konto.setIban("AT1234567890");
        konto.setKontostand(100.15);

        Bank bank = new Bank();
        bank.getKontostand(konto);
        bank.abheben(50.5, konto);
        bank.getKontostand(konto);
        bank.einzahlen(35.789, konto);
        bank.getKontostand(konto);

        /**
         *
         * 2tes Bankkonto instanzieren - gehärt Maximillia Musterfrau.
         * Sie hat 100€ Konto
         * Sie überweist dem Max 27€.
         * Dazu muss die Bank nun Überweisungen beherrschen.
         */

    }
}