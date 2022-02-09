package assignment;

	 import java.util.*;
	 public class Maps{

	 	public static void main(String[] args) {
	 		// map
	 		
	 		//Hashmap
	 		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	 	      hm.put(1,"a");    
	 	      hm.put(2,"b");    
	 	      hm.put(3,"c");   
	 	       
	 	      System.out.println("\nThe elements of Hashmap are ");  
	 	      for(Map.Entry m:hm.entrySet()){    
	 	       System.out.println(m.getKey()+" "+m.getValue());    
	 	      }
	 	      
	 	     //HashTable
	 	       
	 	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	 	      
	 	      ht.put(4,"d");  
	 	      ht.put(5,"e");  
	 	      ht.put(6,"f");  
	 	      ht.put(7,"g");  

	 	      System.out.println("\nThe elements of HashTable are ");  
	 	      for(Map.Entry n:ht.entrySet()){    
	 	       System.out.println(n.getKey()+" "+n.getValue());    
	 	      }
	 	      
	 	      
	 	      //TreeMap
	 	      
	 	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	 	      map.put(8,"h");    
	 	      map.put(9,"i");    
	 	      map.put(10,"j");       
	 	      
	 	      System.out.println("\nThe elements of TreeMap are ");  
	 	      for(Map.Entry l:map.entrySet()){    
	 	       System.out.println(l.getKey()+" "+l.getValue());    
	 	      }    
	 	      
	 	   }  
	 }


