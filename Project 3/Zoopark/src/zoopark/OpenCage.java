package zoopark;

public class OpenCage extends Valers {
    
    OpenCage(int maxAnimal) {
	super(maxAnimal);
    }
    
    public void putAnimal(Ungulates a) {		
	super.putAnimal(a);
    }
	
    public void putAnimal(Animals a) {		
	//super.putAnimal(a);
	System.out.println("Не тот вид животного");
    } 
}
