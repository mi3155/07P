package com.example.demo.Service;

import com.example.demo.Dto.MemoDTO;
import com.example.demo.Entity.Board;
import com.example.demo.Entity.Memo;
import org.springframework.data.domain.Page;

public interface MemoService {

    //메모추가
    Long addmemo(MemoDTO dto);

    Page<Memo> getBoardList(int page, int size);

    //DTO -> Entity 변환
    default Memo dtoToEntity(MemoDTO dto){
        Memo entity = new Memo();
        entity.setId(dto.getId());
        entity.setMemoText(dto.getMemoText());
        return entity;
    }
}
