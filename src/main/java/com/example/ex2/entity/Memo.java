package com.example.ex2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;

@Entity // 엔터티 클래스임을 나타내는 어노테이션
@Table(name="tbl_memo") // 데이터베이스 테이블의 정보 지정하는 어노테이션. tbl_memo 테이블 생성
@ToString // 자동으로 toString() 메서드 생성
@Getter // 모든 필드의 Getter 메서드 자동 생성
@Builder // 빌더 패턴 자동 생성
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자 자동 생성
@NoArgsConstructor // 파라미터 없는 기본 생성자를 자동 생성
public class Memo {

    @Id // 데이터베이스의 Primary Key를 지정함
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //MySQL 등 일부 데이터베이스에서 @Id 어노테이션과 함께 사용해 자동으로 식별자 할당함
    private Long mno;

    @Column(length=200, nullable=false) //데이터베이스에 컬럼을 생성하는 어노테이션
    // nullable == not null
    private String memoText;
}