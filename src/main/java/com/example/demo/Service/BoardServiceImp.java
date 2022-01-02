package com.example.demo.Service;

import com.example.demo.Dto.BoardDTO;
import com.example.demo.Dto.MemberDTO;
import com.example.demo.Entity.Board;
import com.example.demo.Entity.Member;
import com.example.demo.Repository.Boardrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImp implements BoardService{

    @Autowired
    private final Boardrepository boardrepo;

    @Override
    public Board Boardjoin(BoardDTO dto) {
        Board board = dtoToEntity(dto); //DTO -> Entity
        System.out.println("BOARD0" + board);
        boardrepo.save(board);    // DB에 Insert, 삽입
        return board;  //member 리턴(컨트롤러에 전달할 것)
    }
}