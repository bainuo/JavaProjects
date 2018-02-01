package zoopark;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoopark {

    public static void main(String[] args) {
        
        Bassein V1 = new Bassein(2);
        Waterfowl B = new Waterfowl("Vala", 100, true);
        V1.putAnimal(B);
        Waterfowl C = new Waterfowl("Lilu", 100, true);
        V1.putAnimal(C);
        Bird D = new Bird("Abara", 100, true);
        V1.putAnimal(D);
        
        OpenCage V2 = new OpenCage(4);
        Ungulates E = new Ungulates("Kala", 1000, true);
        V2.putAnimal(E);        
        Ungulates I = new Ungulates("Nala", 1000, true);
        V2.putAnimal(I);
        Ungulates F = new Ungulates("Mala", 1000, true);
        V2.putAnimal(F);
        Ungulates U = new Ungulates("Ala", 1000, true);
        V2.putAnimal(U);
        
        CoveredCage V3 = new CoveredCage(2); 
        Bird S = new Bird("Tari", 1000, true);
        V3.putAnimal(S);
        
        InfraredCage V4 = new InfraredCage(2); 
        ColdBlooded Y = new ColdBlooded("Croco", 1000, true);
        V4.putAnimal(Y);
        
        Bird W = new Bird("Abara", 100, true);
        V2.putAnimal(W);
    }

}