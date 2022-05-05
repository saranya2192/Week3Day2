package Week3.Day2;
import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingCollection {
	public static void main(String[] args) {
		 List<Integer> firstList=new ArrayList<Integer>();
		 firstList.add(3);
		  firstList.add(2);
		   firstList.add(11);
		  firstList.add(4);
		   firstList.add(6);
		    firstList.add(7);
		    System.out.println("The First list is: "+ firstList);
		     //Declare another array for {1,2,8,4,9,7};
		     List<Integer> secondList=new ArrayList<Integer>();
		     secondList.add(1);
		      secondList.add(2);
		       secondList.add(8);
		        secondList.add(4);
			 secondList.add(9);
			  secondList.add(7);
			  System.out.println("Second List is:" + secondList);
			  firstList.retainAll(secondList);
			  System.out.println("The common elements are: " +firstList);
			  ArrayList<Integer> thirdList =  new ArrayList<Integer>();
			  for(Integer temp:firstList)
			  {
			  if(secondList.contains(temp))
			  {
			  thirdList.add(temp);
			  }
			  }
			  System.out.println("Second Elemenst");
			  System.out.println("Common elements are : " + thirdList);
	}
}


