package com.cinema.repository;

import java.util.Optional;

import com.cinema.entities.Pelicula;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CineRepository extends JpaRepository<Pelicula, Long>{

    Void save(Optional<Pelicula> peliculaToUpdate);
    
}
