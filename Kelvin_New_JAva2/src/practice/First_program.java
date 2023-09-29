package practice;

import java.util.ArrayList;

public class First_program
{
	public static void main(String[] args) 
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		System.out.println(l);
		l.add(1,"F");
		System.out.println(l);
		//new imple
		l.add("gopi");
		System.out.println(l);
	}
}
