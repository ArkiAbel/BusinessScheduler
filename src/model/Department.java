package model;

public class Department {
    private int departmentID;
    private String departmentName;
    private String description;
    private int managerID;
    private int parentDepartmentID; //in case of hierarchy
    private int locationID;
}
