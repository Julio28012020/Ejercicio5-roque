package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyecto extends BaseEntity {

    @Embedded
    private ContactoCliente contactoCliente;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EstadoProyecto estado;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Prioridad prioridad;
}