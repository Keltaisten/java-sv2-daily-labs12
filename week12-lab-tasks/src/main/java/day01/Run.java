package day01;

import java.time.LocalDate;

public class Run {
    private double distance;
    private LocalDate dateOfRun;

    public Run(double distance, LocalDate dateOfRun) {
        this.distance = distance;
        this.dateOfRun = dateOfRun;
    }

    public double getDistance() {
        return distance;
    }

    public LocalDate getDateOfRun() {
        return dateOfRun;
    }
}
