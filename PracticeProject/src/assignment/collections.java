package assignment;
	import java.util.*;

	public class collections {

		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> state=new ArrayList<String>();   
		      state.add("Telangana");//
		      state.add("Andhra Pradesh");    	   
		      System.out.println(state);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(155); 
		      vec.addElement(320); 
		      System.out.println(vec);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("RAJU");  
		       	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(1);  
		       set.add(2);  
		       set.add(3);
		       set.add(4);
		       System.out.println(set);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(5);  
		       set2.add(6);  
		       set2.add(9);
		       set2.add(8);	       
		       System.out.println(set2);
		      	} 
		      }  
		}


