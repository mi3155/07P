package com.example.demo.Dto;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {
    private String subject;
    private String content;
    private String pwd;
}
