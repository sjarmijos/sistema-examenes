package com.sistema.examenes.services.impl;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.entidades.Pregunta;
import com.sistema.examenes.repositorios.PreguntaRepository;
import com.sistema.examenes.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public Pregunta agregarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Pregunta actualizarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Set<Pregunta> obtenerPreguntas() {
        return (Set<Pregunta>) preguntaRepository.findAll();
    }

    @Override
    public Pregunta obtenerPregunta(Long preguntaId) {
        return preguntaRepository.findById(preguntaId).get();
    }

    @Override
    public Set<Pregunta> obtenerPreguntasDelExamen(Examen examen) {
        return preguntaRepository.findByExamen(examen);
    }

    @Override
    public Pregunta listarPregunta(Long preguntaId) {
        return this.preguntaRepository.getOne(preguntaId);
    }

    @Override
    public void eliminarPregunta(Long preguntaId) {
        Pregunta pregunta = new Pregunta();
        pregunta.setPreguntaId(preguntaId);
        preguntaRepository.delete(pregunta);
    }
}
