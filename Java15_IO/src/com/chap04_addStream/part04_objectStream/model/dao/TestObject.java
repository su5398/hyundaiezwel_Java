package com.chap04_addStream.part04_objectStream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.chap04_addStream.part04_objectStream.model.dto.Member;

public class TestObject {
	public void output() {
		Member[] marr = {
				new Member("user01","pass01","권장현",28,'남',1250.7),
				new Member("user02","pass02","김장현",20,'여',1284.7),
				new Member("user03","pass03","Lamiae",20,'여',1259.5)
		};
		
		//ObjectOutputStream
		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));
		
			for(int i=0; i<marr.length; i++) {
				objOut.writeObject(marr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
