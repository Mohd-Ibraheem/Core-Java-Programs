package com.abstraction;

interface Google{
	void app(int a,int b);
}
public class Interface_4 implements Google{
	

	@Override
	public void app(int a, int b) {
  System.out.println("The value of app:"+ a*b);

}
	public static void main(String[] args) {
		Google gl=new Interface_4();
		gl.app(12, 4);
	}

}
