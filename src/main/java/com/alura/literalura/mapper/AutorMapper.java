package com.alura.literalura.mapper;

import com.alura.literalura.DTO.AutorDTO;
import com.alura.literalura.model.Autor;

public class AutorMapper {

    public static Autor toEntity(AutorDTO authorDTO) {

        Autor author = new Autor();
        author.setNombre(authorDTO.name());
        author.setAnioNacimiento(authorDTO.birthYear() != null ? authorDTO.birthYear() : 0);
        author.setAnioDefuncion(authorDTO.deathYear() != null ? authorDTO.deathYear() : 0);

        return author;

    }
}
