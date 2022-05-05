package Week3.Day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> listValues=new ArrayList<Integer>();
		listValues.add(3);
		listValues.add(2);
		listValues.add(11);
		listValues.add(4);
		listValues.add(6);
		listValues.add(7);
		Collections.sort(listValues);
		System.out.println("The sorted list values are: " + listValues );
		Integer secondElementFromLast =listValues.get(listValues.size()-2);
		System.out.println("The second element from the last is :"+secondElementFromLast);
	}
	

}
