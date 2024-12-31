package com.alura.literalura.service;

import com.alura.literalura.repository.LibroRepository;

public class LibroService implements ILibroService{

    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private LibroRepository repository;
    private final String URL_BASE = "https://gutendex.com/books/search=";


    @Override
    public void obtenerLibroPorTitulo(String titulo) {
        var json = consumoAPI.obtenerDatos(URL_BASE+titulo.replace(" ", "%20"));
        var datos = convierteDatos.obtenerDatos(json, Book.class);


        return repository.save(libro);
    }
}
