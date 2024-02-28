package at.codersbay.java.advanced.exercises.taskmanagement;

import java.util.LinkedList;
import java.util.List;

public class TaskManagement {

    /*
     * Das Taskverwaltungssystem hat eine Methode die einen Task der Taskliste hinzufügt.
     * Das Taskverwaltungssystem hat eine Methode die anhand der ID ein Task aus der Taskliste entfernt.
     * Das Taskverwaltungssystem hat eine Methode die ein Task abgeschliesst.
     * Das Taskverwaltungssystem hat eine Methode die alle Tasks vom Taskverwaltungssystem anzeigt.
     */

    List<Task> tasks = new LinkedList<>();

    public TaskManagement() {
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public boolean addTask(Task task) {
        return this.tasks.add(task);
    }

    public boolean removeTask(int id) {
        for(Task task : new LinkedList<>(this.tasks)) {
            if(task == null) {
                continue;
            }

            if(task.getId() == id) {
                return this.tasks.remove(task);
            }
        }

        return false;
    }

    public void finishTask(Task task) {
        if(task == null) {
            return;
        }

        task.setStatus(true);
        return;
    }

    public void print() {
        for(Task task : tasks) {
            System.out.println(task);

        }
    }
}