package com.gladiators.pi_spring.ServiceInter;

import com.gladiators.pi_spring.Entities.Activity;

import java.util.List;

public interface IActivityService {


    Long AddActivity(Activity AC);
    void deleteActivityById(Long idA);

    public Activity updateActivity(Activity activity);

    List<Activity> retrieveAllActivity();
}
