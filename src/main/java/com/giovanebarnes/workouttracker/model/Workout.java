package com.giovanebarnes.workouttracker.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Workout {
    @Id
    @GeneratedValue
    @Getter
    private Long id;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private String type;
    @Setter @Getter
    private LocalDateTime workoutDate;
    @Setter @Getter
    private Integer durationInMinutes;
}
