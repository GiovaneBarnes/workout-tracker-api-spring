package com.giovanebarnes.workouttracker.service;
import com.giovanebarnes.workouttracker.model.Workout;
import com.giovanebarnes.workouttracker.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout save(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> findAll() {
        return workoutRepository.findAll();
    }
}
