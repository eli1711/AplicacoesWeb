package br.com.aweb.to_do_list.model;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data


public class ToDo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(length = 100, nullable = false)
    private String title;
   
    @Column(nullable = false)
    private LocalDateTime creatAt;
    
    @Column(nullable = false)
    private LocalDate deadline;

    @Column(nullable = false)
    private LocalDate finishedAt;
    
}
