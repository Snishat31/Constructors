package ConstructorsMethods;

abstract class Marks{
	double s1,s2,s3,s4,p;
	
	Marks(){
		s1=s2=s3=s4=p=0;
		System.out.println("Marks Constructor");
	}
	
	abstract double getPercentage();
}


class StudentA extends Marks{
	StudentA(){
		s1=56;
		s2=65;
		s3=78;
	}
	double getPercentage(){
		p=(s1+s2+s3)/3;
		return p;
	}
}


class StudentB extends Marks{
	StudentB(){
		s1=36;
		s2=96;
		s3=89;
		s4=99;
	}
	double getPercentage(){
		p=(s1+s2+s3+s4)/4;
		return p;
	}
}


public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA a=new StudentA();
		System.out.println("Percentage of student A "+a.getPercentage()+"%");
		
		StudentB b=new StudentB();
		System.out.println("Percentage of student B "+b.getPercentage()+"%");
	}

}
