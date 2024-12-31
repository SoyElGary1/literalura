package com.alura.literalura.service;


import com.alura.literalura.DTO.ApiGutexResponseDTO;
import com.alura.literalura.DTO.LibroDTO;
import org.springframework.stereotype.Service;

@Service
public class GutexApiService {
    private final String BASE_URL = "http://gutendex.com/books";
    private ConsumoAPI consumoAPI;
    private ConvierteDatos convierteDatos;

    public GutexApiService(ConsumoAPI consumoAPI, ConvierteDatos convierteDatos) {
        this.consumoAPI = consumoAPI;
        this.convierteDatos = convierteDatos;
    }

    public LibroDTO getBookByName(String bookName){
        String url = BASE_URL + "/?search=" + bookName.replace(" ","+");
        String jsonResponse = consumoAPI.obtenerDatos(url);

        ApiGutexResponseDTO response = convierteDatos.obtenerDatos(jsonResponse, ApiGutexResponseDTO.class);

        // Validar si la respuesta y la lista de libros no son nulas o vacías
        if (response != null && response.books() != null && !response.books().isEmpty()) {
            return response.books().get(0);
        } else {
            return null;
        }
    }

}
