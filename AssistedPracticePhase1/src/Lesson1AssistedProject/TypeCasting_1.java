package Lesson1AssistedProject;
public class TypeCasting_1 {

		public static void main(String[] args) {
			System.out.println("Implicit");
			char a='A';
			System.out.println(" a= "+a);
			int b=a;
			System.out.println(" b= "+b);
			long c=a;
			System.out.println(" d= "+c);
			double d=a;
			System.out.println(" e=: "+d);
			
			System.out.println("Explicit");
			
			double x=55.55;
			int y=(int)x;
			System.out.println(" x= "+x);
			System.out.println(" y= "+y);
			
		}
	}

