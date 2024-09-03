package com.collection.part01_list.sort.controller;

import java.util.ArrayList;

import com.collection.part01_list.sort.model.vo.Score;

public class ScoreController {
	public void scoreSort() {
		
		ArrayList list = new ArrayList();
		
		
		list.add(new Score("권장현",99));
		list.add(new Score("이장현",75));
		list.add(new Score("김장현",82));
		
		list.add(new Score("박장현",45));
		list.add(new Score("성장현",52));
		list.add(new Score("최장현",64));
		
		System.out.println("list: "+list);
		
		//list에 index 3에 해당하는 객체의 이름값 확인
		//((Score)list.get(3)).getName();
		//Score s = ((Score)list.get(1));
		
		list.sort(null);
		System.out.println("list: "+list);
		
		list.sort(new ScoreSorting());
		System.out.println("list: "+list);
		
		list.sort(new ScoreSorting2());
		System.out.println("list: "+list);
	}
}
