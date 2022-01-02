package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="tbl_member")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private String email;

    @Column
    private String pwd;
    @Column
    private int zipcode;
    @Column
    private String addr1;
    @Column
    private String addr2;
    @Column
    private String grade;


}
