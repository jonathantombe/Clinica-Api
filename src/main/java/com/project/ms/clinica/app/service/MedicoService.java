package com.project.ms.clinica.app.service;


import com.project.ms.clinica.app.model.Medico;
import com.project.ms.clinica.app.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }

    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> findById(Long id) {
        return medicoRepository.findById(id);
    }

    public void deleteById(Long id) {
        medicoRepository.deleteById(id);
    }

    public void deleteAll() {
        medicoRepository.deleteAll();
    }

    public List<Medico> findByNombreContaining(String nombre) {
        return medicoRepository.findByNombreContaining(nombre);
    }
}
