package akshithaj0;

class person
{
	void getFirstName()
	{
		System.out.print("Akshitha ");
	}
	void getLastName()
	{
		System.out.print("Nampally ");
	}
}
class Employees extends person
{
	void employee_id() {
		System.out.println("123");
	}
	void getLastName()
	{
		System.out.print("Manager");
	}
}
public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1 = new Employees();
		e1.getFirstName();
		e1.getLastName();
	}

}
