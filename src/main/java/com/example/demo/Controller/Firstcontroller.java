package com.example.demo.Controller;


import com.example.demo.Dto.MemoDTO;
import com.example.demo.Entity.Board;
import com.example.demo.Entity.Memo;
import com.example.demo.Service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class Firstcontroller {

    @Autowired
    private final MemoService service;

    @GetMapping("/index")
    public String indexPage(){
        return "/index.html";
    }

    @PostMapping("/post")
    public String PostPage(MemoDTO dto, Model model){
        System.out.println(dto.toString());
        //dto 내용을 테이블에 저장 - .save()
        Long id = service.addmemo(dto);
        //dto 내용을 페이지로 전달 - model
        dto.setId(id);
        model.addAttribute("dto",dto);
        return "/Post.html";
    }

    @GetMapping("/list")
    public String ReadPage(MemoDTO dto,Model model){
        System.out.println("hihi");
        int nowPage=1; //기본 페이지

        Page<Memo> list =  service.getBoardList(nowPage-1,100); //페이지번호 0부터 시작

        model.addAttribute("list",list);

        return "/Member/list.html";
    }
}
