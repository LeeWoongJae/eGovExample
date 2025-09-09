package yedam.web;

import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import yedam.service.BookService;
import yedam.service.BookVO;

@Controller
public class BookController {

	@Autowired BookService bookService;
	
	
	
	@DisplayName("인덱스")
	@GetMapping("/")
	public String start() {
		return "index";
	}
	
	@DisplayName("전체조회")
	@GetMapping("/book")
	public String list(Model model) {
		model.addAttribute("list", bookService.selectAll());
		return "list";
	}
	
	@DisplayName("등록페이지 호출")
	@GetMapping("/regist")
	public String registPage(Model model) {
		model.addAttribute("max", bookService.lastBookNo());
		return "regist";
	}
	
	@DisplayName("책등록")
	@PostMapping("/register")
	public String registBook(BookVO bookVO , Model model) {
		bookService.registBook(bookVO);
		model.addAttribute("list", bookService.selectAll());
		return "redirect:/book";
	}
	
	@DisplayName("책단건조회")
	@GetMapping("/book/{bookName}")
	public String selectOne(@PathVariable String bookName , Model model) {
		model.addAttribute("b",bookService.selectOne(bookName));
		return "bookOne";
	}
	
	@GetMapping("/rentList")
	public String rentList(Model model) {
		model.addAttribute("rentList" , bookService.bookRentList());
		return "rent";
	}
	
	
}
