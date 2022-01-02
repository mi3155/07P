package com.example.demo.Service;

import com.example.demo.Dto.MemoDTO;
import com.example.demo.Entity.Board;
import com.example.demo.Entity.Memo;
import com.example.demo.Repository.Memorepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class MemoServiceImpl implements MemoService{

    @Autowired
    private final Memorepository memorepo;

    @Override
    public Long addmemo(MemoDTO dto) {
        Memo entity = dtoToEntity(dto); //DTO -> Entity로 변환
        memorepo.save(entity);//DB에 메모쓰기
        return entity.getId();
    }

    @Override
    public Page<Memo> getBoardList(int page, int size) {

        Sort sort1 = Sort.by("id").descending();

        Pageable pageable= PageRequest.of(page,size,sort1);

        Page<Memo> list=memorepo.findAll(pageable);
        return list;
    }
}
