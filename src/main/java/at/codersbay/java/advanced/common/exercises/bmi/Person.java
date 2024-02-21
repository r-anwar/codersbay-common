package at.codersbay.java.advanced.common.exercises.bmi;

/**
 * Die Person braucht folgende Informationen:
 * • Die größe der Person
 * • Das Gewicht der Person
 * • Das Geschlecht der Person
 *
 * Finden Sie dazu passende Datentypen.
 *
 * Beim erzeugen einer Instanz einer Person, sollen alle drei Felder durch Konstruktorparameter befüllt werden.
 * Erstellen Sie eine bmiBerechnen Methode welche den BMI berechnet. Finden Sie einen passenden
 * Rückgabewert. (Die Formel zur Berechnung des BMI finden Sie im Internet)
 * Erstellen Sie eine bmiAusgeben Methode, die den BMI und die Information, ob die Person
 * "untergewichtig", "übergewichtig" oder "normalgewichtig" (je nach Geschlecht) ist, auf die Konsole
 * ausgibt
 * z.b.
 * Die Person, männlich, hat einen BMI von 21. Das liegt im Normalbereich
 * oder
 * Geschlecht: m, BMI: 21, Normalbereich
 */
public class Person {

    double height;
    double weight;
    int sex;
    int bmi;


    public Person(int height, int weight, int sex) {
        this.height = height;
        this.weight = weight;

        if(sex < 0 || sex > 1) {
            sex = 0;
        }
        this.sex = sex;
    }

    public void bmiBerechnen() {
        this.bmi = Double.valueOf(weight / ((height/100) * (height/100))).intValue();
    }

    public void bmiAusgeben() {
        String bmiCategory = "";
        String sex = "";

        if(this.sex == 0) {
            sex = "m";
            if(this.bmi < 20.1) {
                bmiCategory = "Untergewicht";
            } else if(this.bmi < 25.1) {
                bmiCategory = "Normalgewicht";
            } else {
                bmiCategory = "Übergewicht";
            }
        } else {
            sex = "w";
            if(this.bmi < 19.1) {
                bmiCategory = "Untergewicht";
            } else if(this.bmi < 24.1) {
                bmiCategory = "Normalgewicht";
            } else {
                bmiCategory = "Übergewicht";
            }
        }

        System.out.println("Geschlecht: " + sex + ", BMI: " + this.bmi + ", " + bmiCategory);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
