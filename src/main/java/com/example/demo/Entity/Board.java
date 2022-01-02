package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbl_board")
public class Board {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //AutoIncrement
    private Long id;

    @Column
    private String subject;

    @Column
    private String content;

    @Column
    private String pwd;
}
