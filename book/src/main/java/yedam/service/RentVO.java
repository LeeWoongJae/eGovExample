package yedam.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RentVO {
	
	private int rentNo;
	private int bookNo;
	private int rentPrice;
	private Date rentDate;
	private char rentStatus;
	
	private String bookName;
	BookVO bookVO;
}
