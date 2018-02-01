package zoopark;

public class Waterfowl extends Animals {
    
    public Waterfowl(int id, String name, int weight) {
        super(id, name, weight);
    }
    
    public String getClassName() {
	return "Waterfowl";
    }
}
