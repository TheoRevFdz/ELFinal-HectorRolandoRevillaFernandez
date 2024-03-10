package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.repositories;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {
    @Query(value = "FROM Libro l WHERE l.genero.id = :idgenero AND l.nmbre LIKE LOWER(CONCAT('%', :NMBRE, '%'))")
    List<Libro> findByNombreAndGenero(@Param("nombre") String nombre, @Param("idGenero") Long idGenero);
}
