package com.sistema.examenes.services;

import com.sistema.examenes.entidades.Categoria;
import com.sistema.examenes.entidades.Examen;

import java.util.List;
import java.util.Set;

public interface ExamenService {

    Examen agregarExamen(Examen examen);
    Examen actualizarExamen(Examen examen);
    Set<Examen> obtenerExamenes();

    Examen obtenerExamen(Long examenId);

    void eliminarExamen(Long examenId);

    List<Examen> listarExamenesDeUnaCategoria(Categoria categoria);

    List<Examen> obtenerExamenesActivos();

    List<Examen> obtenerExamenesActivosDeUnaCategoria(Categoria categoria);

}
