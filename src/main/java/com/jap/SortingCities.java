package com.jap;
import java.util.Arrays;
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

		String [] upperCase = object.toUpperCase(citiesName);
		for(int i =0;i< citiesName.length;i++){
				System.out.print(upperCase[i]+ ", ");
		}
		object.nearZurich(distance,upperCase);
		object.greaterCites(distance,upperCase);

    }
	public String[] toUpperCase(String []citiesName){

			String [] upperCase = new String[citiesName.length];

			for(int i =0;i < citiesName.length;i++){
				upperCase[i] = citiesName[i].toUpperCase();

			}

		return upperCase;	
	}
	public void greaterCites(int []distance,String []citiesName){

		for(int i =0;i < distance.length;i++){
			if(distance[i] >= 270)
			System.out.print(citiesName[i] + ", ");
		}
	}
	public void nearZurich(int [] distance, String []citiesName){

			for(int i=0;i < citiesName.length;i++){

				if(distance[i] == 52 )
				System.out.println(citiesName[i]);
			}

	}
}