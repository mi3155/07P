package com.example.demo.Service;

import com.example.demo.Dto.BoardDTO;
import com.example.demo.Dto.MemberDTO;
import com.example.demo.Entity.Board;
import com.example.demo.Entity.Member;

public interface BoardService {

    Board Boardjoin(BoardDTO dto);

    default Board dtoToEntity(BoardDTO dto){
        Board Entity = new Board();
        Entity.setSubject(dto.getSubject());
        Entity.setContent(dto.getContent());
        Entity.setPwd(dto.getPwd());
        return Entity;
    }
}
