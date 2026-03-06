package model;
import java.util.Set;

public class Role {
    private int id;
    private String title;
    private String description;
    private int seniorityLevel;
    private EmploymentType employmentType;
    private Set<String> permissions;
    private int minHoursPerWeek;
    private int maxHoursPerWeek;
}
