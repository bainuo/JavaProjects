package zoopark;

public class Bassein extends Valers {
        
    Bassein(int maxAnimal) {
	super(maxAnimal);
    }
    
    public void putAnimal(Waterfowl a) {		
	super.putAnimal(a);
    }
	
    public void putAnimal(Animals a) {		
	//super.putAnimal(a);
	System.out.println("Не тот вид животного");
    } 
}