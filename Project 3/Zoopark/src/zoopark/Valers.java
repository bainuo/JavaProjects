package zoopark;

  import java.util.ArrayList;
    import java.util.List;

    public class Valers {

    private int CageLimit;

    List<Animals> result = new ArrayList<Animals>();

    Valers(int maxAnimal) {
        this.CageLimit = maxAnimal;
    }
    public void putAnimal(Animals a) {

        int numAnimals=result.size();

        if (numAnimals>=CageLimit) { 
           System.out.println("Вольер уже полный");
           System.out.println(" ");
        }
        else {
           this.result.add(a);
           System.out.println("Животное добавлено в вольер");
           System.out.println("  ");
        }
    }

    public int getCageAnimals() {
        return result.size();
    }
}
