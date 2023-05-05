package Inheritance_day2;

import java.util.Scanner;

public class ProjectDetailEntry {

	public static void main(String[] args) {
		 
		System.out.println("1 ABC Project");
		System.out.println("2 XYZ Project");
		System.out.println("enter choice");
		Scanner s= new Scanner(System.in);
		int c= s.nextInt();
		
		Project p;
		if( c==1)
    		p= new AbcProject();
		else
			p= new XYZProject();
		
		
		p.addProjectDetails();
		p.displayProjectDetails();
		
	}

}
