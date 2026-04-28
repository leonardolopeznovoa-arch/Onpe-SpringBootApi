package com.onpe.sistema.service;

import com.onpe.sistema.model.Acta;
import com.onpe.sistema.model.Participacion;
import com.onpe.sistema.repository.ActaRepository;
import com.onpe.sistema.repository.ParticipacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnpeService {

    @Autowired
    private ActaRepository actaRepo;

    @Autowired
    private ParticipacionRepository partRepo;

    // --- LÓGICA PARA ACTAS ---
    public List<Acta> getAllActas() {
        return actaRepo.findAll();
    }

    public Acta getActaById(Long id) {
        return actaRepo.findById(id).orElse(null);
    }

    public Acta saveActa(Acta acta) {
        return actaRepo.save(acta);
    }

    public void deleteActa(Long id) {
        actaRepo.deleteById(id);
    }

    // --- LÓGICA PARA PARTICIPACIÓN ---
    public List<Participacion> getAllParticipaciones() {
        return partRepo.findAll();
    }

    public Participacion getParticipacionById(Long id) {
        return partRepo.findById(id).orElse(null);
    }

    public Participacion saveParticipacion(Participacion participacion) {
        return partRepo.save(participacion);
    }

    public void deleteParticipacion(Long id) {
        partRepo.deleteById(id);
    }
}