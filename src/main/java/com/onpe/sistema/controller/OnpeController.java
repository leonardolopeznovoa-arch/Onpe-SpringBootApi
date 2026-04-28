package com.onpe.sistema.controller;

import com.onpe.sistema.model.Acta;
import com.onpe.sistema.model.Participacion;
import com.onpe.sistema.service.OnpeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OnpeController {

    @Autowired
    private OnpeService onpeService;

    @GetMapping("/actas")
    public List<Acta> listarActas() {
        return onpeService.getAllActas();
    }

    @PostMapping("/actas")
    public Acta crearActa(@RequestBody Acta acta) {
        return onpeService.saveActa(acta);
    }

    @GetMapping("/participacion")
    public List<Participacion> listarParticipaciones() {
        return onpeService.getAllParticipaciones();
    }

    @PostMapping("/participacion")
    public Participacion crearParticipacion(@RequestBody Participacion p) {
        return onpeService.saveParticipacion(p);
    }
}