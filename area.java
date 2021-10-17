package ConstructorsMethods;

public class area {

	float ar;
	String s;
	
	area(){
	
		ar=0;//default
		s="none";
		//System.out.println("area is "+ar);	
	}
	area(float r){
		
		ar=3.14f*r*r;//circle
		s="Circle";
		//System.out.println("area of circle is "+ar);
	}
	area(float l,float b){
		
		ar=l*b;//square, rectangle
		s="Square or rectanlge";
	//	System.out.println("area of square or rectangle is "+ar);
	}
	
	area(double h, double b){
		ar=(float)(0.5*h*b);//triangle
		s="triangle";
		//System.out.println("area of triangle is "+ar);
		
	}
	
	area(double h, float b){
		ar=(float)(0.5*h*b);//rhombus
		s="rhombus";
		//System.out.println("area of Rhombus is "+ar);
		
	}
	
	void display(){
		
		System.out.println("area calculated "+ ar +" meter square of shape "+s);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area s1=new area();
		s1.display();
		area s2=new area(2.4f);
		s2.display();
		area s3=new area(3.0f,2.1f);
		s3.display();
		area s4=new area(5.0,3.0);
		s4.display();
		area s5=new area(3.2,4.0f);
		s5.display();
				
	}

}
