package zoopark;


public class Bird extends Animals {      
    
    public Bird(int id, String name, int weight) {
        super(id, name, weight);
    }
    
    public String getClassName() {
	return "Bird";
    }
}
