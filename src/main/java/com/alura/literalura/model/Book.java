package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record Book(
        @JsonAlias(value = "title")
        String title,

        @JsonAlias(value = "authors")
        List<Author> authors,

        @JsonAlias(value = "languages")
        List<String> language,

        @JsonAlias(value = "download_count")
        Integer downloadCount


) {
}
