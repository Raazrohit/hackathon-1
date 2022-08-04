package com.jap;
import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class SortingCities
{
    public static void main( String[] args )
    {	SortingCities object = new SortingCities();
		String [] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
		int [] distance = {138,52,118,136,85,276,103,87,214,101};
		String[] sortednames = object.convertToUpperCase(cityNames);
		for(int i =0;i< cityNames.length;i++){
				System.out.print(sortednames[i]+ ", ");
		}
		object.nearZurich(distance,cityNames);
		object.greaterCity(distance,cityNames);
    }
	public String convertToUpperCase(String[] cityNames )
	{
		String[] names = cityNames.toUpperCase();
		return names;
	}
	public void nearZurich (int[] distance, String[] cityNames)
	{
		for(int i = 0; i<cityNames.length; i++)
		{
			if(distance[i] == 52)
			System.out.println(cityNames[i]);
		}
	}
	public void greaterCity(int[] distance, String[] cityNames)
	{
		for(int i = 0; i<distance.length; i++)
		{
			if(distance[i >= 270])
			System.out.println(cityNames[i]+", ");
		}
	}
}
