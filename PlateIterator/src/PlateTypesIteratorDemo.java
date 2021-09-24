
public class PlateTypesIteratorDemo {

	public static void main(String[] args) {
	  PlatesStore namesRepository = new PlatesStore();

	  
	  System.out.println("Types of plates ..... \n");
	  
	  
	      for(Iterator iter = namesRepository.creeateIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Plate type name : " + name);
	      } 	
	   }
	
	
	
}
