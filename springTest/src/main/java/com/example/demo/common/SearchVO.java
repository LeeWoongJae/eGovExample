package com.example.demo.common;

import lombok.Data;

@Data
public class SearchVO {
	// int : 초기값 0 , null 불가  / Integer : 초기값 Null 
	Integer prevPage;
	Integer nextPage;
}
