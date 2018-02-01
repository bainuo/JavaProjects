package zoopark;

public class ColdBlooded extends Animals {
    
    public ColdBlooded(int id, String name, int weight) {
        super(id, name, weight);
    }
    
    public String getClassName() {
	return "ColdBlooded";
    }
}