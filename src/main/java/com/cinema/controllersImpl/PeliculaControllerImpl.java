package com.cinema.controllersImpl;

import java.util.List;
import java.util.Optional;

import com.cinema.controllers.PeliculaController;
import com.cinema.entities.Pelicula;
import com.cinema.service.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaControllerImpl implements PeliculaController {

    @Autowired
    PeliculaService peliculaService;


    @RequestMapping(value="/peliculas", method = RequestMethod.GET )
    @Override
    public List<Pelicula> getPeliculas() {
        return peliculaService.findAllPeliculas();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pelicula addPelicula(Pelicula pelicula) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deletePelicula(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String updatePelicula(Pelicula pelicula) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
