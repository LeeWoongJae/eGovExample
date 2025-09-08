package com.example.demo.domain;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity // Setter는 그리 잘 쓰이지 않는다 필드값을 DB에 변경해야하는이유
public class Posts extends BaseTimeEntity {

	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment(mySQL)를 자동 생성 - sequence(ORACLE) 자동생성해서 관리
	@Id
	private Long id;
	
	
	private String title;
	private String content;
	
	//@Transient // DB생성단계에서 author컬럼은 생성되지 않고 나머지 컬럼들에 대해서 생성후 데이터가 추가된다
	private String author;
	
	
	
	
//	@CreatedDate
//	@Temporal(TemporalType.TIMESTAMP) // Date Type 지정
//	private Date wdate; 
//	
//	@LastModifiedDate
//	@Temporal(TemporalType.TIMESTAMP) // Date Type 지정
//	private Date updateDate;
	
	
	public Posts() {}

	@Builder
	public Posts(String title, String content, String author, Date wdate) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;
		//this.wdate = wdate;
	}
	
	public void update(String title , String content) {
		this.title = title;
		this.content  = content;
	}
	
	
}
