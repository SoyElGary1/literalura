package com.alura.literalura.repository;

import com.alura.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

    @Query("SELECT b.idiomas FROM Libro b GROUP BY b.idiomas")
    List<String> groupByBooksLanguage();

    List<Libro> findByIdiomas(String idioma);

}
