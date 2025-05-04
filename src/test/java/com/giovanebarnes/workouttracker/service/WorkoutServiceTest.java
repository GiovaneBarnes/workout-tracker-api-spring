package com.giovanebarnes.workouttracker.service;

import com.giovanebarnes.workouttracker.model.Workout;
import com.giovanebarnes.workouttracker.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WorkoutServiceTest {

    @Autowired
    private WorkoutService workoutService;

    @MockitoBean
    private WorkoutRepository workoutRepository;

    void testSaveWorkout() {
        Workout workout = new Workout();
        workout.setName("Chest Day");
        workout.setType("Weight Training");
        workout.setDurationInMinutes(45);
        workout.setWorkoutDate(LocalDateTime.now());

        Workout saved = workoutService.save(workout);

        assertEquals("Chest Day", saved.getName());
    }
}
