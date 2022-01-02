package com.example.demo.Controller;

import com.example.demo.Dto.MemberDTO;
import com.example.demo.Entity.Member;
import com.example.demo.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private final MemberService service;

    @GetMapping("/member/join.do")
    public String Join(){
        return"/member/join.html";
    }

    @PostMapping("/member/result.do")
    public String result(MemberDTO dto, Model model){
        //서비스메서드로 내용 DB 저장
        Member member = service.Memberjoin(dto);
        model.addAttribute("member",member);
        //페이지로 이동
        return"/member/result.html";
    }
}
