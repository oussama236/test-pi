package com.gladiators.pi_spring.ServiceImp;

import com.gladiators.pi_spring.Entities.Activity;
import com.gladiators.pi_spring.Entities.Evaluation;
import com.gladiators.pi_spring.Repositories.EvaluationRepository;
import com.gladiators.pi_spring.ServiceInter.IEvaluationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class EvaluationServiceImple implements IEvaluationService {



    @Autowired
    EvaluationRepository evaluationRepository;
    @Override
    public Long AddEvaluation(Evaluation EV) {
        evaluationRepository.save (EV);
        return EV.getId ();
    }

    @Override
    public void deleteEvaluationById(Long idA) {
        evaluationRepository.deleteById (idA);

    }

    @Override
    public Evaluation updateEvaluation(Evaluation evaluation) {
        evaluationRepository.save(evaluation);
        return evaluation;
    }

    @Override
    public List<Evaluation> retrieveAllEvaluation() {
        List<Evaluation> ListEvaluation = evaluationRepository.findAll();
        return ListEvaluation;
    }
}
