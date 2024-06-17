package com.project.ms.clinica.app.repository;


import com.project.ms.clinica.app.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByNombreContaining(String nombre);
}


