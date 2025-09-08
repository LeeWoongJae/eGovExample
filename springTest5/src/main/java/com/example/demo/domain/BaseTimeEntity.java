package com.example.demo.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;


@Getter
@MappedSuperclass // 부모생성자를 만들지 말라고 명시
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
	 	@CreatedDate // entity 생성시 자동으로 날짜컬럼이 생기고 데이터 등록시 자동으로 등록된 시간 등록
	    private LocalDateTime createdDate;

	    @LastModifiedDate // 수정작업시 마지막 수정시간 등록
	    private LocalDateTime modifiedDate;
}
