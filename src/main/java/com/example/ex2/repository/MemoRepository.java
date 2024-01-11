package com.example.ex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ex2.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
