package at.codersbay.java.advanced.exercises.taskmanagement;

/**
 * Erstelle ein Taskverwaltungssystem. Das Taskverwaltungssystem besteht aus einer Liste von Aufgaben (Task).
 *
 * Eine Aufgabe hat eine ID einen Titel, eine Beschreibung einen Status-Erledigt (true|false).
 *
 * Das Taskverwaltungssystem hat eine Methode die einen Task der Taskliste hinzufügt.
 * Das Taskverwaltungssystem hat eine Methode die anhand der ID ein Task aus der Taskliste entfernt.
 * Das Taskverwaltungssystem hat eine Methode die ein Task abgeschliesst.
 * Das Taskverwaltungssystem hat eine Methode die alle Tasks vom Taskverwaltungssystem anzeigt.
 *
 */
public class Main {

    public static void main(String[] args) {

        TaskManagement taskManagement = new TaskManagement();


        Task task1 = new Task(1, "Mein Erster Task", "Lorem Ipsum", false);
        taskManagement.addTask(task1);

        Task task2 = new Task(2, "Mein Zweiter Task", "Lorem Ipsum", false);
        taskManagement.addTask(task2);

        Task task3 = new Task(3, "Mein Dritter Task", "Lorem Ipsum", false);
        taskManagement.addTask(task3);

        Task task4 = new Task(4, "Mein Vierter Task", "Lorem Ipsum", false);
        taskManagement.addTask(task4);

        taskManagement.finishTask(task1);

        taskManagement.removeTask(3);

        taskManagement.print();


    }

}
