/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Exam_FM.examen.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "libro")

public class Libro {
    @Id
    @Column(name = "libro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libroId;
    
    @Column(name = "libro_nombre")
    private String libroNombre;

    @Column(name = "libro_Autor")
    private String libroAutor;

    @Column(name = "libro_Editorial")
    private String libroEditorial;

    @Column(name = "libro_tipo")
    private String libroTipo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="code")
    private Libro libro;
}
