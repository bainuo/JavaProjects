package zoopark;

public class Ungulates extends Animals {
    
    public Ungulates(String name, int weight, boolean isMale) {
        super(name, weight, isMale);
        System.out.println(name + " " + weight + " " + isMale);
    }
}
