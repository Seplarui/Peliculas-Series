package com.cinema.service;

import java.util.List;
import java.util.Optional;

import com.cinema.entities.Pelicula;

public interface PeliculaService {

    public List<Pelicula> findAllPeliculas();
    public Optional<Pelicula> findPeliculaById(Long id);
    public Pelicula savePelicula(Pelicula pelicula);
    public String deletePelicula(Long id);
    public String updatePelicula(Pelicula pelicula);

}