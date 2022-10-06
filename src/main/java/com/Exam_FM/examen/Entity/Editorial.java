/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Exam_FM.examen.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Editorial")
public class Editorial {
     @Id
    @Column(name = "Edit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editId;
    
    @Column(name = "Edit_name")
    private Long editName;
    
    @Column(name = "code")
    private Long code;
}
