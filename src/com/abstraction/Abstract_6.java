package com.abstraction;

abstract class Z{
	abstract class Y{
	abstract void myAbstractMethod();
	}
}

class N extends Z{
	class M extends Y{

		@Override
		void myAbstractMethod() {
			System.out.println("inside abstract method implementation");
		}
		
	}
}
public class Abstract_6 {
	public static void main(String[] args) {
		N outer=new N();
		
		N.M inner=outer.new M();
		inner.myAbstractMethod();
	}

}
