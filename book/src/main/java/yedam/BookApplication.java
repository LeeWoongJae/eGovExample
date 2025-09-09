package yedam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "yedam.**.mapper")
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}
