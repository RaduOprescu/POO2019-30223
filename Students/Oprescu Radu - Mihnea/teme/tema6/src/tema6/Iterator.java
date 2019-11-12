package tema6;

public class Iterator implements java.util.Iterator {

	private String[] deck= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	int index=0;
	
	public boolean hasNext() {
		if(index==deck.length) {
			return false;
		}
		else {
			return true;
		}
	}

	public Object next(){

		return (Object)deck[index++];
	
	}
	
	public static void main(String[] args) {
        Iterator i = new Iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
	
}
