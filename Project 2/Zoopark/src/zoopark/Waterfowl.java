
package zoopark;

public class Waterfowl extends Animals {
    
    public Waterfowl(String name, int weight, boolean isMale) {
        super(name, weight, isMale);
        System.out.println(name + " " + weight + " " + isMale);
    }
}
