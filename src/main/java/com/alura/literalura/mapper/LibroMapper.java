package com.alura.literalura.mapper;

import com.alura.literalura.DTO.LibroDTO;
import com.alura.literalura.model.Libro;

public class LibroMapper {

    public static Libro toEntity(LibroDTO dto){

        Libro book  = new Libro();
        book.setTitle(dto.title());
        book.setIdiomas(dto.language());
        book.setCantidadDescargas(String.valueOf(dto.downloadCount()));
        return book;
    }

}
