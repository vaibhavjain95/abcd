package lti1.abcd;
public class Student
{
	private int no1;
	private int no2;
	private int no;
	public int getno1() {
		return no1;
	}
	public void setno1(int no1)
	{
		this.no1=no1;
	}
	public int getno2() {
		return no2;
	}
	public void setno2(int no2)
	{
		this.no2=no2;
	}
	
	
	public void displayInfo(){
		System.out.println(this.no1+this.no2);
	}
}