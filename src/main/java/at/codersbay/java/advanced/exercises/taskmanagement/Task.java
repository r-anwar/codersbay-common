package at.codersbay.java.advanced.exercises.taskmanagement;


public class Task {

    private int id;
    private String title;
    private String description;
    private boolean status;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("title: ");
        sb.append(this.title);
        sb.append("; Description: ");
        sb.append(description);
        sb.append("; Status: ");
        if(this.status) {
            sb.append("done;");
        } else {
            sb.append("open;");
        }

        return sb.toString();
    }
}
