package Lesson2AssistedProject;
import java.util.*;

public class Mapping6 {
	

		public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"kamesh");    
		      hm.put(2,"tamil");    
		      hm.put(3,"priya");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"jeeva");  
		      ht.put(5,"archana");  
		      ht.put(6,"harini");  
		      ht.put(7,"anandhi");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		      //TreeMap
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Annie");    
		      map.put(9,"Carlotte");    
		      map.put(10,"Catie");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}
