
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
@Table(name = "editorial")
public class Editorial {
    @Id
    @Column(name = "edit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editId;
    
    @Column(name = "edit_name")
    private Long editName;
    
    @Column(name = "code")
    private Long code;
}
