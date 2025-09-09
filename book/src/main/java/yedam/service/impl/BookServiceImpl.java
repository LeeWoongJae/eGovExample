package yedam.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;
import yedam.service.BookService;
import yedam.service.BookVO;
import yedam.service.RentVO;
import yedam.service.mapper.BookMapper;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService{

	final BookMapper bookMapper;
	
	@Override
	public List<BookVO> selectAll() {

		return bookMapper.selectAll();
	}

	@Override
	public int registBook(BookVO book) {
		
		return bookMapper.registBook(book);
	}

	@Override
	public BookVO selectOne(String bookName) {
		
		return bookMapper.selectOne(bookName);
	}

	@Override
	public int lastBookNo() {
		
		return bookMapper.lastBookNo();
	}

	@Override
	public List<RentVO> bookRentList() {

		return bookMapper.bookRentList();
	}

}
