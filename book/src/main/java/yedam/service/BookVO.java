package yedam.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BookVO {
	

	
//	public BookVO(String bookName , String bookDesc, String author , String pub) {
//		this.bookName = bookName;
//		this.bookDesc = bookDesc;
//		this.author = author;
//		this.pub = pub;
//	}
//	
	
	private int bookNo;
	
	private String bookName;
	
	private String bookCoverimg;
	
	private Date bookDate;
	
	private int bookPrice;
	
	private String bookInfo;
	
	private String author;
	
	private String bookPublisher; 
	
	
	
}
