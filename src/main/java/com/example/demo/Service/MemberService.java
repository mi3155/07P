package com.example.demo.Service;

import com.example.demo.Dto.MemberDTO;
import com.example.demo.Dto.MemoDTO;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.Memo;

public interface MemberService {

    //회원가입
    Member Memberjoin(MemberDTO dto);


    //DTO -> Entity 변환  // 빌더 사용 버젼
    default Member dtoToEntity(MemberDTO dto) {
        Member entity = Member.builder()
                .email(dto.getEmail())
                .pwd(dto.getPwd())
                .zipcode(dto.getZipcode())
                .addr1(dto.getAddr1())
                .addr2(dto.getAddr2())
                .build();

        return entity;
    }
}
