package tp5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testList {
	
	
	public static void main(String[] args) {
	
		Class c=person.class;
		auteur a=(auteur) c.getDeclaredAnnotation(auteur.class);
		System.out.print(a);


		
		
		
/**	
 * 
 * Set<person>p1=new HashSet<person>();
		p1.add(new person(1, "khaoula", "ouifaya"));
		p1.add(new person(2, "xxxxxx", "xxxxxx"));
		p1.add(new person(1, "khaoula", "ouifaya"));
		System.out.print("\n");
		System.out.print(p1);
		
 * Map<String, Integer>lesNotes=new HashMap();
		lesNotes.put("adhaM", 19);
		lesNotes.put("rabiaa", 03);
		lesNotes.put("khalid", 13);
		lesNotes.put("jawad", 20);
		
		for(Map.Entry<String, Integer> e:lesNotes.entrySet()) {
			
			String noM=e.getKey();
			Integer value=e.getValue()*2;
			
			System.out.print("\n"+noM+" "+value);
		}
		
 * List<Integer> list1= new ArrayList<Integer>();
	list1.add(12);
	list1.add(23);
	list1.add(23);
	list1.add(12);for(int i = 0;i<list1.size();i++){
		
		System.out.print("liste n:"+i+"valeur est"+list1.get(i));
		
	}
	
for(Integer e:list1){
		
		System.out.print("liste n:"+e+"valeur est"+list1.get(e));
		
	}

		
		**/
}
}
