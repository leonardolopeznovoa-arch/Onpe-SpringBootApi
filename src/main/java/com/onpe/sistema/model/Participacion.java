package com.onpe.sistema.model;

import jakarta.persistence.*;

@Entity
public class Participacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String local;
    private Integer totalElectores;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public Integer getTotalElectores() { return totalElectores; }
    public void setTotalElectores(Integer totalElectores) { this.totalElectores = totalElectores; }
}