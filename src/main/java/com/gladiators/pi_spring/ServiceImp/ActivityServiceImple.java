package com.gladiators.pi_spring.ServiceImp;

import com.gladiators.pi_spring.Entities.Activity;
import com.gladiators.pi_spring.Repositories.ActivityRepository;
import com.gladiators.pi_spring.ServiceInter.IActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ActivityServiceImple implements IActivityService {

    @Autowired
    ActivityRepository activityRepository;


    @Override
    public Long AddActivity(Activity AC) {
        activityRepository.save (AC);
        return AC.getId ();
    }

    @Override
    public void deleteActivityById(Long idA) {
        activityRepository.deleteById (idA);
    }

    @Override
    public Activity updateActivity(Activity activity) {
        activityRepository.save(activity);
        return activity;
    }

    @Override
    public List<Activity> retrieveAllActivity() {
        List<Activity> ListActivty = activityRepository.findAll();
        return ListActivty;
    }
}
