package service;

import model.Evaluacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EvaluacionRepository;

import java.util.List;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public Evaluacion guardarEvaluacion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    public List<Evaluacion> listarTodas() {
        return evaluacionRepository.findAll();
    }
}