package com.cinema.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    @Column(name="titulo")
    String titulo;
    @Column(name="anyo")
    int anyo;
    @Column(name="fecha_vista")
    String fecha_vista;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    public String getFecha_vista() {
        return fecha_vista;
    }
    public void setFecha_vista(String fecha_vista) {
        this.fecha_vista = fecha_vista;
    }

}
