package com.example.demo.Repository;

import com.example.demo.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Memberrepository extends JpaRepository<Member,String>{

}
