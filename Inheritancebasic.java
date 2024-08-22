package myPracticeProject;
class Parentclass{
	String nameP = "Akshitha";
}
class Childclass extends Parentclass
{
	String nameC = "Hansini"; 
}
public class Inheritancebasic {

	public static void main(String[] args) {
		Childclass C1 = new Childclass();
		System.out.println(C1.nameP +" and "+ C1.nameC);
		
	}

}
