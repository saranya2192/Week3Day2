package Week3.Day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("We");
		list.add("learn");
		list.add("java");
		list.add("java");
		list.add("basics");
		list.add("as");
		list.add("Part");
		list.add("of");
		list.add("java");
		list.add("sessions");
		list.add("in");
		list.add("java");
		list.add("week1");
		System.out.println("List values are: " + list);
		
		Set<String> set=new LinkedHashSet<String>();
		set.addAll(list);
		System.out.println("Displaying the String without duplicate words : "+ set);}
}
	
	

