package com.inherit.par01_inheritTest.after;

import java.util.Date;

public class Computer extends Product{
	//desktop과 smartPhone의 공통 속성을 추출
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	public Computer() {}

	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	@Override
	public String printInfo(){	
		return super.printInfo()+", "+this.cpu+", "+this.hdd+", "
				+this.ram+","+this.os;
	}
	
}
