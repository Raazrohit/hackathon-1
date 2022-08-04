package com.jap;

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
		String sortednames = object.convertToUpperCase(cityNames);
        System.out.println( sortednames );
    }
	public String convertToUpperCase(String[] cityNames )
	{
		String names = cityNames.toUpperCase();
		return names;
	}
}
