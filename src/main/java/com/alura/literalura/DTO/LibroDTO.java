package com.alura.literalura.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroDTO(
        @JsonAlias(value = "title")
        String title,

        @JsonAlias(value = "authors")
        List<Author> authors,

        @JsonAlias(value = "languages")
        List<String> language,

        @JsonAlias(value = "download_count")
        int downloadCount
) {
}
