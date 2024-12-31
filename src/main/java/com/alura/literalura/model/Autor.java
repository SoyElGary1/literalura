package com.alura.literalura.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Integer anioNacimiento;

    private Integer anioDefuncion;

    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;

    public Autor() {
    }
}