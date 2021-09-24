
public class PlatesStore implements PlatesContainer {
	
	 public String PlatesStore[] = {"The Roadrunner" , "Rambo" ,"Black Beauty" , "Bandito"};

	@Override
	public Iterator creeateIterator() {
		 
		return new PlateStore();
	}

	private class PlateStore implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < PlatesStore.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return PlatesStore[index++];
	         }
	         return null;
	      }		
	   }
	
	
	
}
