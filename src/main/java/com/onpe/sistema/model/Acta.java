package com.onpe.sistema.model;

import jakarta.persistence.*;

@Entity
public class Acta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mesa;
    private Integer votosValidos;
    private Integer votosImpugnados;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMesa() { return mesa; }
    public void setMesa(String mesa) { this.mesa = mesa; }
    public Integer getVotosValidos() { return votosValidos; }
    public void setVotosValidos(Integer votosValidos) { this.votosValidos = votosValidos; }
    public Integer getVotosImpugnados() { return votosImpugnados; }
    public void setVotosImpugnados(Integer votosImpugnados) { this.votosImpugnados = votosImpugnados; }
}