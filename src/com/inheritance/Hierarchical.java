package com.inheritance;

class Hourse{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Hourse{  
void bark(){System.out.println("barking...");}  
}  
class Hierarchical extends Hourse{  
void meow(){System.out.println("meowing...");  
}  
 
public static void main(String args[]){  
	Hierarchical c=new Hierarchical();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  

}
}
