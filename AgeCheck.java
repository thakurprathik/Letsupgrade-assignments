package praticeworkspace;

import java.util.Scanner;

public class AgeCheck {
 Scanner sc = new Scanner(System.in);
	
 public void validage() {
	System.out.println("enter your age to check the validation");
	int age = sc.nextInt();
	if(age>=18)
		System.out.println("your are eligiable to vote");
	else
		System.out.println("oops! your are not eligiable to vote yet ");
 }
	public static void main(String[] args) {
    AgeCheck ac = new AgeCheck();
    ac.validage();
	}

}
