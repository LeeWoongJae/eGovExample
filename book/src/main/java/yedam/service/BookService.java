package yedam.service;

import java.util.List;


public interface BookService {
	
	List<BookVO> selectAll(); // 전체조회
	int lastBookNo();// 마지막 도서번호 조회
	int registBook(BookVO book); // 등록
	BookVO selectOne(String bookName); // 단건조회
	List<RentVO> bookRentList(); // 대여매출현황
}
