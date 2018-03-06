package Country;

public class Country {

	String name;
	int population, area;

	public Country(String cn, int a, int p) {

		name=cn;
		area=a;
		population=p;
	}

	public void compare(Country p1, Country p2)
	{

		if(p1.population>p2.population){

			System.out.println(p1.name);

		}

		else{

			System.out.println(p2.name);
		}

	}
}






