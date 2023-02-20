package com.gladiators.pi_spring.ServiceInter;

import com.gladiators.pi_spring.Entities.Activity;
import com.gladiators.pi_spring.Entities.Evaluation;

import java.util.List;

public interface IEvaluationService {




    Long AddEvaluation(Evaluation AC);
    void deleteEvaluationById(Long idA);

    public Evaluation updateEvaluation(Evaluation evaluation);

    List<Evaluation> retrieveAllEvaluation();

}
