package com.gladiators.pi_spring.Controllers;

import com.gladiators.pi_spring.Entities.Activity;
import com.gladiators.pi_spring.ServiceImp.ActivityServiceImple;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Gestion des activites")
@RequestMapping(value = "/api/activitys", produces = MediaType.APPLICATION_JSON_VALUE)
public class ActivityRestController {


    @Autowired
    ActivityServiceImple activityServiceImple;




    @ApiOperation(value = "Récupérer la liste des activites")
    @GetMapping("/retrieve-all-Activty")
    public List<Activity> getActivity() {
        List<Activity> listClasses = activityServiceImple.retrieveAllActivity ();
        return listClasses;
    }


    @PostMapping("/add-Activity")
public Long ajouterActivite(@RequestBody Activity Ac){
    return activityServiceImple.AddActivity (Ac);
}
    @DeleteMapping("/remove-Activ/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable final Long id) {


        activityServiceImple.deleteActivityById (id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/modify-Activity/{id}")
    public ResponseEntity<Void> updateActivity(@RequestBody Activity activityDTO) {
        activityServiceImple.updateActivity(activityDTO);
        return ResponseEntity.ok().build();
    }

}
