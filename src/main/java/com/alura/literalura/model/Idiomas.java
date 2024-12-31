package com.alura.literalura.model;

public enum Idiomas {
    US("Ingles"),
    ES("Español");

    private String categoriaOmdb;

    Idiomas(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Idiomas fromString(String text) {

        for (Idiomas categoria : Idiomas.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ningún lenguaje encontrada: " + text);
    }

}
