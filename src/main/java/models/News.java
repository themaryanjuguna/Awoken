package models;

public class News {
    private int id;
    private int employeeId;
    private String title;
    private String content;



    public News(int employeeId, String title, String content) {
        this.employeeId = employeeId;
        this.title = title;
        this.content = content;
    }
}
