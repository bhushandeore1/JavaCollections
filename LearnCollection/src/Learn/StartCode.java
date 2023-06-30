package Learn;
import java.util.*;


public class StartCode {
	public static void main(String[] args) {
		System.out.println("Lets Start");
		
		
		/* 
		 creating collection
		 1)Type safe-same type of elements(objects) are added to collection
		 
		 2)un type safe- different types of elememets are added to collection
		 
		 
		 */
		 
		//Type safe collection
		ArrayList<String> names=new ArrayList<>();
		names.add("Bhushan");
		names.add("Deore");
		names.add("Bhushan");
		names.add("Deore");
		names.add("Bhushan");
		names.add("Deore");
		names.add(2, "Ram");
		names.set(2, "Hare");
//		for(String i:names) {
//			if(i=="Bhushan") {
//				System.out.println(i);
//			} 
//			
//		} 
//		System.out.println(names);
		
//		System.out.println(names.isEmpty());;
		ArrayList<Integer> rollnumbers=new ArrayList<>();
		rollnumbers.add(20);
		
		//untype safe collection
		LinkedList list=new LinkedList();
		list.add(names);
		list.add(rollnumbers);
		System.out.println(list);
		
		
		//set
		HashSet<Double> nums=new HashSet<>();
		nums.add(12.33330);
		nums.add(98.93);
		nums.add(1233.1111);
		nums.add(1233.1111);
		System.out.println(nums);
		
		TreeSet<Double> test =new TreeSet<>();
		test.addAll(nums);
		System.out.println(test);
		
	}
}
