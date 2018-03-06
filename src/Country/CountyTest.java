package Country;
import java.util.Scanner;
public class CountyTest {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Input Country 1's name, population, and area");
	
		Country country1=new Country(scanner.nextLine(),scanner.nextInt(), scanner.nextInt());
		
		scanner.nextLine();
		
		System.out.println("Input Country 2's name, population, and area");
		
		Country country2=new Country(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());

		
		System.out.println(country1.name);
		System.out.println(country1.population);
		System.out.println(country1.area);
		
		scanner.nextLine();
		
		System.out.println(country2.name);
		System.out.println(country2.population);
		System.out.println(country2.area);

		scanner.nextLine();
		
		country2.compare(country1,country2);
		
		}
		
	}
