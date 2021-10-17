package ConstructorOverloading;

public class OverloadingConstructor {
	String name;
	int age;
	char section;
	char gender;
	int sub1, sub2, sub3;
	int percentage;
	
	OverloadingConstructor(int a, int b, int c,String n, int age, char sec, char gen){
		sub1=a;
		sub2=b;
		sub3=c;		
		name=n;		
		this.age=age;
		section=sec;
		gender=gen;
		percentage = (sub1+sub2+sub3)/3;
	}
		
	OverloadingConstructor(int a, int b, int c){
		sub1=a;
		sub2=b;
		sub3=c;
		percentage = (sub1+sub2+sub3)/3;
		age=0;
		section='-';
		gender='-';
		name="-";
	}

	
	
	void display(){
		System.out.println("percentage of student "+name+" is "+ percentage+"%.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingConstructor s1= new OverloadingConstructor(50,60,70,"s1",15,'a','f');
		OverloadingConstructor s2= new OverloadingConstructor(0,40,90);
		OverloadingConstructor s3=new OverloadingConstructor(0,50,20);
		OverloadingConstructor s4=new OverloadingConstructor(70,80,90,"s4",15,'d','m');
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}

}
