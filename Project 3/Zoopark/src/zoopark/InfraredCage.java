package zoopark;

public class InfraredCage extends Valers {
    
    InfraredCage(int maxAnimal) {
	super(maxAnimal);
    }
    
    public void putAnimal(ColdBlooded a) {		
	super.putAnimal(a);
    }
	
    public void putAnimal(Animals a) {		
	//super.putAnimal(a);
	System.out.println("Не тот вид животного");
    } 
}
