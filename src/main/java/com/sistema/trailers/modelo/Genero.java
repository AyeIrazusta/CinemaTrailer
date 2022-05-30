package com.sistema.trailers.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genero {

    @Id
    @Column(name = "id_genero")
    private Integer id;

    private String titulo;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero(Integer id, String titulo) {
        super();
        this.id = id;
        this.titulo = titulo;
    }

    public Genero() {
        super();
    }

    public Genero(Integer id) {
        super();
        this.id = id;
    }

}
