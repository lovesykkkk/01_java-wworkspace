package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {
	
	private int z;
	
	public Child1() {
		//super(); 생략돼있음. 부모기본생성자 없어지면 오류난다
	}
	
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("나 첫번째 자식이야");
	}
	
	//나중
	@Override
	public void print() {
		System.out.println("나 첫번째 자식이야");
	}
	

}
