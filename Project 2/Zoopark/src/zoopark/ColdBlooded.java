
package zoopark;

public class ColdBlooded extends Animals {
    
    public ColdBlooded(String name, int weight, boolean isMale) {
        super(name, weight, isMale);
        System.out.println(name + " " + weight + " " + isMale);
    }
}