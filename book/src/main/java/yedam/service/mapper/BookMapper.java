package yedam.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import yedam.service.BookVO;
import yedam.service.RentVO;

@Mapper
public interface BookMapper {

	List<BookVO> selectAll(); // 전체조회
	int registBook(BookVO book); // 등록
	BookVO selectOne(String bookName); // 단건조회
	int lastBookNo(); // 마지막 도서 번호 조회
	List<RentVO> bookRentList(); // 도서대여매출현황
	
}
