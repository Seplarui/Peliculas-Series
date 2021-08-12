package com.cinema.controllers;

import java.util.List;
import java.util.Optional;

import com.cinema.entities.Pelicula;

public interface PeliculaController {
    

    public List<Pelicula> getPeliculas();
    public Optional<Pelicula> getPeliculaById(Long id);
    public Pelicula addPelicula(Pelicula pelicula);
    public String deletePelicula(Long id);
    public String updatePelicula(Pelicula pelicula);
    
    
}
