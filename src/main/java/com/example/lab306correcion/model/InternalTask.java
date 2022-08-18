package com.example.lab306correcion.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class InternalTask extends Task{

    public InternalTask() {
    }

    public InternalTask(String title, LocalDate date, boolean status) {
        super(title, date, status);
    }

}
