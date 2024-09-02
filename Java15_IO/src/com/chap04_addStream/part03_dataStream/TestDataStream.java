package com.chap04_addStream.part03_dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	//데이터 자료형 별로 처리하는 기능을 추가한 보조스트림
	//DataInputStream&DataOutputStream
	
	public void test() {
		DataInputStream din = null;
		DataOutputStream dout = null;
		
		try {
			din = new DataInputStream(new FileInputStream("data.txt"));
			dout = new DataOutputStream(new FileOutputStream("data.txt"));
		
			//파일에 자료형별로 출력
			dout.writeUTF("홍길동");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("김길동");
			dout.writeInt(77);
			dout.writeChar('C');
			
			while(true) {
				System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
			}
//			System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
//			System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일 읽기 완료");
		}catch (IOException e) {	
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				din.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
