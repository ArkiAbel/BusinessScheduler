package model;
import java.util.List;

public class Availability {
    private int employeeID;
    private List<DayOfWeek> availableDays;
    private Time earliestStart;
    private Time latestEnd;
    private int maxHoursPerWeek;
    private List<Date> vacationDays;
    private String exceptions;
}
