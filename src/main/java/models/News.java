package models;

public class News {
    private int id;
    private int employeeId;
    private String title;
    private String content;


    public News() {
    }

    public News(int employeeId, String title, String content) {
        this.employeeId = employeeId;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
