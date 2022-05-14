package org.themaryanjuguna.models;

public class User {
    private int id;
    private int employeeId;
    private String name;
    private String profile;
    private String position;
    private String role;
//constructor
    public User(int employeeId, String name, String profile, String position, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.profile = profile;
        this.position = position;
        this.role = role;
    }
}
