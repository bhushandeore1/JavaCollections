package Learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Bhushan");
		names.add("Ram");
		names.add("Krishna");
		names.add("Hari");
		
		for(String str:names) {
			System.out.print(str +"\t" +str.length()+"\t");
			StringBuffer br=new StringBuffer(str);
			System.out.println(br.reverse());
		}
		
		
		//Traversing Using Iterator
		Iterator<String> iter = names.iterator();
		while (iter.hasNext()) {
			String next = (String) iter.next();
			System.out.println(next);
		}
		
		ListIterator<String>litr = names.listIterator(names.size());
		while (litr.hasPrevious()) {
			String string = (String) litr.previous();
			System.out.println(string);
		}
		
	}

}
