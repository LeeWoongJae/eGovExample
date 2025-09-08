package com.example.demo.repository;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Posts;
import com.example.demo.dto.PostsListResponseDto;


@Repository
public interface PostsRepository extends JpaRepository<Posts, Long>{
	@Query("SELECT p FROM Posts p ")
	Page<PostsListResponseDto>findAllPage(Pageable pageable);

	// CRUD 자동 생성 -> JpaRepository 를 상속받았을 경우
	
	// JpaRepository<Entity , id-dataType>
	
	
}
