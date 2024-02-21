package at.codersbay.java.advanced.common.exercises.book;

/**
 * Die Klasse 'Person' definiert bereits zwei Datenfelder und einen Konstruktor, der diese Felder initialisiert.
 * Sie sollen in den kommenden Übungen dieses Grundgerüst ausbauen. Fügen Sie zwei
 * sondierende Methoden (getter) hinzu – getAuthor und getTitle –, die den jeweiligen Wert der
 * Datenfelder author und title zurückliefern. Testen Sie Ihre Klasse, indem Sie einige Instanzen
 * erzeugen und die Methoden aufrufen.
 *
 * a.) Fügen Sie der Klasse Book zweit Methoden printAuthor und printTitle hinzu. Diese Methoden sollen
 * die entpsrechenden Datenfelder auf der Konsole ausgeben.
 *
 * b.) Fügen Sie ein weiteres Datenfeld pages hinzu, dass die Anzahl der Seiten eines buches speichert.
 * Dieses Feld sollte vom Typ int sein und seinen Anfangswert duch den Konstruktor bekommen,
 * indem dieser neben author und title einen weiteren Parameter erhält. Fügen Sie auch eine
 * entsprechende sondierende Methode getPages hinzu.
 *
 * c.) Fügen Sie der Klasse Book eine Methode printDetails hinzu. Diese sollte den Autor, den Titel und die
 * Anzahl der Seiten auf der Konsole ausgeben. Es ist Ihnen überlasse, wie Sie die Ausgabe
 * formatieren. Beispielsweise können alle Angaben auf einer Zeile ausgegeben werden, oder jede
 * Information auf einer eigenen Zeile. Sie können auch erläuternden Text mit ausgeben, der die
 * einzelnen Informationen einleitet, etwa in der Form:
 * Titel: Robinson Crusoe, Autor: Daniel Defoe, Seiten: 232
 *
 * d.) Fügen Sie in der Klasse Book ein weiteres Datenfeld refNumber für eine Referenznummer ein. Dieses
 * Feld könnte beispielsweise eine eindeutige Kennzeichnung in einer Bibliothek modellieren. Es
 * sollte vom Typ String sein und im Konstruktor mit einer leeren Zeichenkette ("") initialisiert
 * werden, da es seinen Wert nicht als Konstruktorparameter bekommen soll. Definieren Sie
 * stattdessen eine verändernde Methode (mutator bzw. setter) mit folgendem Kopf:
 *          public void setRefNumber(String ref)
 * Im Rumpf der dieser Methode sollte der Wert des Parameters dem Datenfeld refNummer zugewiesen
 * werden. Fügen Sie eine zugehörige Zugriffsmethode getRefNumber ein, mit deren Hilfe Sie testen
 * können, ob die set-Methode korrekt arbeitet.
 *
 * d.) Passen Sie Ihre Methode printDetails so an, dass sie auch die Referenznummer ausgibt. Allerdings
 * soll die Nummer nur dann ausgegeben werden, wenn tatsächlich ein Wert eingetragen wurde —
 * also wenn das Datenfeld eine nichtleere Zeichenkette enthält. Falls das Datenfeld nicht gesetzt
 * wurde, geben Sie stattdessen "ZZZ" aus. Hinweis: Benutzen Sie eine bedingte Anweisung, die in
 * ihrer Prüfung die Methode length an refNummer aufruft.
 *
 * e.) Verändern Sie die Methode setRefNumber so, dass sie den Wert des Datenfelds nur ändert, wenn die
 * übergebene Zeichenkette mindestens drei Zeichen lang ist. Wenn der Parameter kürzer ist, lassen
 * Sie eine Fehlermeldung ausgeben und das Datenfeld unverändert.
 *
 * f.) Fügen Sie der Klasse Buch ein weiteres Datenfeld borrowed, vom Typ int hinzu. Es soll einen Zähler
 * halten, der angibt, wie häufig das Buch bereits ausgeliehen wurde. Fügen Sie eine verändernde
 * Methode borrow hinzu, die den Zahler bei jedem Aufruf um eins erhöht. Fügen Sie eine Methode
 * getBorrowed hinzu, die den Wert des neuen Datenfelds als Ergebnis liefert. Erweitern Sie die
 * Methode printDetails so, dass auch die Information des neuen Felds mit einem erläuternden Text
 * ausgegeben wird.
 *
 * g.) Fügen Sie zu der Klasse Book ein boolesches Datenfeld namens courseText hinzu. Dieses gibt an, ob
 * ein Buch als Fachbuch zu einem Kurs verwendet wird oder nicht. Dieses Datenfeld sollte über einen
 * Parameter im Konstruktor gesetzt werden und unveränderlich sein. Ergänzen Sie zu diesem Zweck
 * eine sondierende Methode namens isCourseText.
 * 
 */
public class Main {
}
