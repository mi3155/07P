package com.example.demo.Controller;

import com.example.demo.Dto.BoardDTO;
import com.example.demo.Entity.Board;
import com.example.demo.Entity.Member;
import com.example.demo.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private BoardService service;

    @GetMapping("/board/post")
    public String board(){
        return "/board/post.html";
    }

    @PostMapping("/board/result")
    public String result(BoardDTO dto, Model model){
        System.out.println(dto.toString());

        Board board = service.Boardjoin(dto);
        model.addAttribute("board",board);
        return "/board/result.html";

    }
}
