package Lesson2AssistedProject;

public class Constracter4 {
public static void main(String[] args) {

	EmployeeInformation emp1=new EmployeeInformation();
	EmployeeInformation emp2=new EmployeeInformation();

	emp1.display();
	emp2.display();
	System.out.println("parameter constructer");
	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
	}
}
//default constructor
class EmployeeInformation{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}


//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}



