package com.example.demo.Service;

import com.example.demo.Dto.MemberDTO;
import com.example.demo.Entity.Member;
import com.example.demo.Repository.Memberrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImple implements MemberService{

    @Autowired
    private final Memberrepository memberropo;

    @Override
    public Member Memberjoin(MemberDTO dto) {
        Member member = dtoToEntity(dto); //DTO -> Entity
        System.out.println("MEMBER" + member);
        memberropo.save(member);    // DB에 Insert, 삽입
        return member;  //member 리턴(컨트롤러에 전달할 것)
    }
}
