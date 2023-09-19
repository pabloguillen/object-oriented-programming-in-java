package module6;

import java.util.*;

public class TestBinarySearch {
	private Airports[] test;
	
	public TestBinarySearch() {
		Airports agr = new Airports("Agra");
		Airports bej = new Airports("Beijing");
		Airports chi = new Airports("Chicago");
		Airports ess = new Airports("Essen");
		Airports lag = new Airports("Lagos");
		Airports mon = new Airports("Montreal");
		Airports qut = new Airports("Quito");
		Airports sdy = new Airports("Sydney");
		test = new Airports[]{agr, bej, chi, ess, lag, mon, qut, sdy};
	}
	
	public void testing() {
		String airport = "Chicago";
		if (binarySearch(airport) != null) {
		System.out.println(binarySearch(airport));
	}
		System.out.println("Not found");
	}
	
	public String binarySearch (String toSearch) {
		int high = test.length-1;
		int low = 0;
		int mid;
		while (high >= low) {
			mid = (high-low)/2;
			mid = low +mid;
			int compare = toSearch.compareTo(test[mid].getCity());
			if (compare < 0) {
				high = mid-1;
			}
			else if (compare > 0) {
				low = mid+1;
				
			}
			else {
				return "Is found";
			}	
		}
		return null;
	}
	

}
