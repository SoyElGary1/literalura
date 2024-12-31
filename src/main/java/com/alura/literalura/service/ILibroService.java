package com.alura.literalura.service;

import com.alura.literalura.model.Libro;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ILibroService {

    void obtenerLibroPorTitulo(String titulo);

}
