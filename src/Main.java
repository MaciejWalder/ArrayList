import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String[] cats=new String[3];
        cats=new String[]{"Max", "Milus","Klakier"};


        LinkedList<String> dogs=new LinkedList<>();
        dogs.add("Scooby");
        dogs.add("Pluto");
        dogs.add("Tyson");
        System.out.println(dogs.get(0));

        ArrayList<String> birds=new ArrayList<>();
        birds.add("Tliti");
        birds.add("Ptaszek");
        System.out.println(birds);
    }

}
