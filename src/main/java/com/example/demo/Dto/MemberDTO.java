package com.example.demo.Dto;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private String email;
    private String pwd;
    private int zipcode;
    private String addr1;
    private String addr2;
    private int grade;
}
