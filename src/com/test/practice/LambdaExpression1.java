package com.test.practice;

@FunctionalInterface
interface Drawable{
void draw();
}
@FunctionalInterface
interface Sayable{  
    public String say();  
} 

@FunctionalInterface
interface Sayable1{  
    public String say(String name);  
} 


@FunctionalInterface
interface GetNumber{  
    public int say(int num);  
} 

@FunctionalInterface
interface Addable{  
    int add(int a,int b);  
}


public class LambdaExpression1 {

	public static void main(String[] args) {
		
/*Drawable d=new Drawable() {
	
	@Override
	public void draw() {
		System.out.println("Hello Drawing");
		
	}
};*/
		Drawable d2=()->{
			System.out.println("Hello Drawing");
		};
		
		Sayable s=()->{
			return "Hello";
		};
		
		Sayable1 s2=(name)->{
			return "Hello "+name;
		};
		
		GetNumber g=num->{
			return num;
		};
		
		Addable add=(a,b)->(a+b);
		
		Addable add1=(a,b)->{
			return a+b;
		};
		
		System.out.println(add1.add(30, 30));
		System.out.println(add.add(20, 30));
		System.out.println(g.say(10));
		System.out.println(s2.say("Dileep"));
		System.out.println(s.say());
d2.draw();
	}

}
