package com.collection.part02_set.hashSet;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		HashSet hset = new HashSet();
		
		//다형성 적용하여 생성 가능
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();
		
		//set에 객체를 추가
		hset.add(new String("java"));
		hset.add(123);
		hset.add(45.67);
		hset.add(new Date());
		
		//순서유지x
		System.out.println("hset: "+hset);
		
		hset.add(new String("java"));
		hset.add(123);
		
		//중복값x
		System.out.println("hset: "+hset);
		
		System.out.println("저장된 객체수: "+hset.size());
		System.out.println("포함확인: "+hset.contains(123));
		
	}
}
