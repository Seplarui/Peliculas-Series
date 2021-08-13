package com.cinema.controllersImpl;

import java.util.List;
import java.util.Optional;

import com.cinema.controllers.PeliculaController;
import com.cinema.entities.Pelicula;
import com.cinema.service.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping(value="/peliculas/{id}", method = RequestMethod.GET)
    public Optional<Pelicula> getPeliculaById(@PathVariable Long id) {
       return peliculaService.findPeliculaById(id);
    }

    @Override
    @RequestMapping(value="/peliculas/add", method=RequestMethod.POST)
    public Pelicula addPelicula(Pelicula pelicula) {
        if(pelicula.getTitulo()!=null) {
            return peliculaService.savePelicula(pelicula);
        }
        return null;
        
    }

    @Override
    @RequestMapping(value="peliculas/delete/{id}", method=RequestMethod.DELETE)
    public String deletePelicula(@PathVariable Long id) {
        
        if (id != 0){
            peliculaService.deletePelicula(id);
            return "Película con id: "+id + " borrada";
        }
        return "ERROR: No se ha podido eliminar la película";
    }

    @Override
    public String updatePelicula(Pelicula pelicula) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
