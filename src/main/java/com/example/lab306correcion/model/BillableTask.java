package com.example.lab306correcion.model;

import com.example.lab306correcion.model.Task;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class BillableTask extends Task {

    private double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, LocalDate date, boolean status, double hourlyRate) {
        super(title, date, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
