package com.giovanebarnes.workouttracker.controller;

import com.giovanebarnes.workouttracker.model.Workout;
import com.giovanebarnes.workouttracker.service.WorkoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping
    public ResponseEntity<List<Workout>> getALlWorkout() {
        return ResponseEntity.ok(workoutService.findAll());
    }

    @PostMapping
    public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
        Workout saved = workoutService.save(workout);
        return ResponseEntity.status(201).body(workoutService.save(workout));
    }
}
