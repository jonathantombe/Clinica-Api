package com.project.ms.clinica.app.repository;


import com.project.ms.clinica.app.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    List<Medico> findByNombreContaining(String nombre);
}

