package com.example.API.REST.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
//import org.hibernate.envers.Audited;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "libro")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Audited
public class Libro extends Base{
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;

    // Establecer una relación Many-to-Many con la entidad Autor.
    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    // No es necesario especificar una columna de unión aquí, ya que se utilizará la tabla de unión predeterminada.
    private List<Autor> autores;
}