package com.alura.literalura.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ConsumoAPI {
    private final HttpClient httpClient;

    public ConsumoAPI() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String obtenerDatos(String url) {
        // Construcción de la petición HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")  // Header para JSON
                .GET()
                .build();

        // Enviar la petición y manejar la respuesta
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar el estado de la respuesta
            if (response.statusCode() >= 200 && response.statusCode() < 300) {
                return response.body(); // Respuesta exitosa
            } else {
                throw new RuntimeException("Error en la petición: HTTP " + response.statusCode()
                        + " - " + response.body());
            }

        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
            throw new RuntimeException("Error al realizar la petición HTTP: " + e.getMessage(), e);
        }
    }

}