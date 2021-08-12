package com.cinema.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.cinema.entities.Pelicula;
import com.cinema.repository.PeliculaRepository;
import com.cinema.service.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> findAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> findPeliculaById(Long id) {
        Optional<Pelicula> pelicula = peliculaRepository.findById(id);
        return pelicula;
    }

    @Override
    public Pelicula savePelicula(Pelicula pelicula) {
        if (pelicula != null) {
            return peliculaRepository.save(pelicula);
        }
        return new Pelicula();
    }

    @Override
    public String deletePelicula(Long id) {
        if(peliculaRepository.findById(id).isPresent()) {
            peliculaRepository.deleteById(id);
            return "Película eliminada correctamente";
        }

        return "ERROR: La película no existe";
    }

    @Override
    public String updatePelicula(Pelicula pelicula) {
        
        Long idPelicula = pelicula.getId();

        if(peliculaRepository.findById(idPelicula).isPresent()) {
            Pelicula peliculaUpdate = new Pelicula();

            peliculaUpdate.setId(pelicula.getId());
            peliculaUpdate.setTitulo(pelicula.getTitulo());
            peliculaUpdate.setAnyo(pelicula.getAnyo());
            peliculaUpdate.setFecha_vista(pelicula.getFecha_vista());

            return "Película modificada";

        }

        return "ERROR: La película no se puede modificar";
    }


    
}
