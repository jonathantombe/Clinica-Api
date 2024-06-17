package com.project.ms.clinica.app.repository;

import com.project.ms.clinica.app.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    void deleteByPacienteId(Long id);
}

