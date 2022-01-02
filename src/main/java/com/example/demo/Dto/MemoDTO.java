package com.example.demo.Dto;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemoDTO {
    private Long id;
    private String memoText;
}
