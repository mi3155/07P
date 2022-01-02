package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_memo")
@Data //Getter and Setter

public class Memo {
    @Id   //PK
    @GeneratedValue(strategy= GenerationType.IDENTITY) //AutoIncrement
    private Long id;

    @Column(length=200,nullable=false)
    private String memoText;


}
