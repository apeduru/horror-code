import java.util.*;

public class FIFOStack extends Vector(){

	public synchronized Object push(Object o) {
		add(o);
		return o;
	} 

	public synchronized Object pop() {
		if (isEmpty()) {
			return null;
		} 
		return remove(0);
	} 

	public synchronized boolean empty() {
		return isEmpty();
	} 
	
	private synchronized void stackUnderOverFlow(){
		try{
			pop();
		} catch (stackUnderOverFlow t){
			try{
				push();
			}
			catch(stackUnderOverFlow){
				t.printStackTrace();
			}
		}
		
	}
}