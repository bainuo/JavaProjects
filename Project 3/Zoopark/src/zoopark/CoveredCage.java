package zoopark;

public class CoveredCage extends Valers {
    
    CoveredCage(int maxAnimal) {
	super(maxAnimal);
    }
    
    public void putAnimal(Bird a) {		
	super.putAnimal(a);
    }
	
    public void putAnimal(Animals a) {		
	//super.putAnimal(a);
	System.out.println("Не тот вид животного");
    } 
}
