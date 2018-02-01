package zoopark;


public class Bird extends Animals {
    
    
    
    public Bird(String name, int weight, boolean isMale) {
        super(name, weight, isMale);
        System.out.println(name + " " + weight + " " + isMale);
    }
}
