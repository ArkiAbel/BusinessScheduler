package model;
import java.util.List;

public class Schedule {
    private int id;
    private int departmentID;
    private Date weekStartDate;
    private Date weekEndDate;
    private List<Shift> shifts;
    private Status status;
    private String createdBy;
    private String createdAt;
}
