package at.codersbay.java.advanced.common.person;

public class Main {


    public static void main(String[] args) {

        Student max = new Student();
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.matrikelnummer = 123456789;
        max.ausgabe();


        Professor maxi = new Professor();
        maxi.firstName = "Maximillia";
        maxi.lastName = "Musterfrau";
        maxi.title = "PhD";
        maxi.ausgabe();




    }
}
