package BvS;
import java.util.Scanner;
public class BvS {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		System.out.println("Input three numbers.");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();

		if(a>c && a>b){

			System.out.println("The largest number is " + a);
		}

		if(b>c && b>a){

			System.out.println("The largest number is " + b);
		}


		if(c>a && c>b){

			System.out.println("The largest number is " + c);
		}

		else if(a<b && a<c){

			System.out.println("The smallest number is " + a);
		}

		else if(b<a && b<c){

			System.out.println("The smallest number is " + b);
		}
		
		else if(c<a && c<b){

			System.out.println("The smallest number is " + c);

		}
	}
}