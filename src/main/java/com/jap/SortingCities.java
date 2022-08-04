package com.jap;

/**
 * Hello world!
 *
 */
public class SortingCities
{
    public static void main( String[] args )
    {
        SortingCities object = new SortingCities();
		String [] citiesName = {"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
		int [] distance = {138,52,118,136,85,276,103,87,214,101};

		String [] convertedNames = object.convertToUpperCase(citiesName);
		for(int i =0;i< citiesName.length;i++){
				System.out.print(convertedNames [i]+ ", ");
		}
		System.out.println(" ");
		object.nearZurich(distance,citiesName );
		object.greaterCites(distance,citiesName );

    }
	public String[] convertToUpperCase(String []citiesName){

			String [] upperCase = new String[citiesName.length];

			for(int i =0;i < citiesName.length;i++){
				upperCase[i] = citiesName[i].toUpperCase();

			}
		return upperCase;
	}	
	public String nearZurich(int [] distance, String []citiesName){
			String Nearzurich = "";
			for(int i=0;i < citiesName.length;i++){

				if(distance[i] == 52 ) {
					Nearzurich = citiesName[i];
					System.out.println(citiesName[i]);
				}
			}
		return Nearzurich;
	}
	public String greaterCites(int []distance, String []citiesName){
		String GreaterCity = "";
		for(int i =0;i < distance.length;i++){
			if(distance[i] >= 270)
				GreaterCity = citiesName[i];
		}
		System.out.print(GreaterCity);
		return GreaterCity;
	}
	
}