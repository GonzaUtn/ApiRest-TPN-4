package com.example.ApiRest.Entities;

import lombok.*;
import org.hibernate.envers.Audited;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;


    @OneToMany ( cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Libro> libros = new ArrayList<Libro>();






}
