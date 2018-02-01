package zoopark;

abstract public class Animals {
    
    private String name;
    private int weight;
    // is this boy?
    private boolean isMale;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return weight;
    }
 
    public void setAge(int age) {
        this.weight = weight;
    }
 
    public boolean isMale() {
        return isMale;
    }
 
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
 
    public Animals(String name, int weight, boolean isMale) {
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
    }
    
}
