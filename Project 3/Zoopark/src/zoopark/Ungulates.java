package zoopark;

public class Ungulates extends Animals {
    
    public Ungulates(int id, String name, int weight) {
        super(id, name, weight);
    }
    
    public String getClassName() {
	return "Ungulates";
    }
}
