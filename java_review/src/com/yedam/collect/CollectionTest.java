package com.yedam.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class CollectionTest {
	
	@DisplayName("Map")
	@Test
	public void test3() {
		Map<String , String> map = new HashMap<>();
		map.put("1000", "president");
		map.put("1001", "manager");
		map.put("1002", "employee");
		
		
		map.get("1002"); // 검색속도 : 1 고정
		
		
		
		
		
	}
	
	@DisplayName("List")
	@Test
	public void test1() {
		List<String> arr = new ArrayList<>();
		List<String> lk = new LinkedList<>();
		arr.add("apple");
		arr.add("banana");
		arr.add("strawberry");
		arr.add("orange");
		arr.add("banana");
		assertEquals(arr.size(), 5);
		// ArrayList 와 LinkedList 차이점 , 언제 사용하는지 알아와
		// Answer) ArrayList => index를 통한 빠른 접근가능 / 크기가 가득차면 새로언 배열을 만들고 복하새야해서 리사이즈 비용이 발생
		// Answer) LinkedList => 각 노드가 데이터 앞뒤 노드 참조를 가진다 / 삽입 삭제가 빠름 (참조만 바꿔주면됨) / 임의 접근이 느림 / 메모리 사용량이 많음
		// 노드란 ? 데이터와 연결될 정보를 가진 블록 
		// 사용하는 상황  
		// 조회가 많고 삽입삭제는 적을때 >> ArrayList (순회)/ 삽입 삭제가 많고 리스트 앞뒤로 작업할때 LinkedList(큐 / 덱)
		// set 컬렉션에 list 를 담아서 중복을 체크해서 확인
		Set<String> set = new HashSet<>(arr);
		assertEquals(set.size(), 5);
		
		
	}
	@DisplayName("Set")
	@Test
	public void test2() {
		// LOT같은 중복값을 허용하지 않는 코드는 SET 컬렉션을 사용하여 저장
		Set<String> arr = new HashSet<>();
		
		arr.add("apple");
		arr.add("banana");
		arr.add("strawberry");
		arr.add("orange");
		arr.add("banana");
		assertEquals(arr.size(), 4);
		
	}
}
