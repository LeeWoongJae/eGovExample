package yedam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;
import yedam.service.BookVO;
import yedam.service.mapper.BookMapper;

@Log4j2
@SpringBootTest
class BookApplicationTests {

	@Autowired BookMapper bookMapper;
	
	
	//@Test
	void contextLoads() {
	}
	
	//@Test
	public void test() {
		log.info(bookMapper.selectAll());
	}
	
	//@Transactional
	//@Rollback(false) @@Rollback(true)
	//@Test
	public void test2() {
//		int result = bookMapper.registBook(new BookVO("asdd","asdasddesc","Lee","pubTest"));
//		if(result>0) {
//			System.out.println(result+"건 등록완료!");
//			
//		}else {
//			System.out.println(result+" 등록실패");
//		}
	}
	
//	@Test
//	public void test3() {
//		System.out.println(bookMapper.selectOne(1));
//		log.info(bookMapper.selectOne(1));
//	}
	
	
	

}
