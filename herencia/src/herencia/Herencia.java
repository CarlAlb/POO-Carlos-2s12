package herencia;

import java.util.Scanner;

public class Herencia {

    public static void main(String[] args) {
        Dog[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    }

    private static void feed(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
        Dog2[] dogs = new Dog2[4];
        Scanner reader= new Scanner (System.in);
        Dog2[] doge = new Dog2[4];
        String[] names = {"", "", "", ""};
        String[] colours = {"", "", "", ""};
        double[] weight={0,0,0,0};
        double[] portion={0,0,0,0};
        
        
          for (int i = 0; i < dogs.length; i++) {
           System.out.println("Nombre:  ["+i+"]:  ");
           names[i]=reader.nextLine();
        }
           for (int i = 0; i < dogs.length; i++) {
           System.out.println("Color:  ["+i+"]:  ");
           colours[i]=reader.nextLine();
           }
           for (int i = 0; i < dogs.length; i++) {
           System.out.println("Peso:  ["+i+"]:  ");
           weight[i]=reader.nextDouble();
           }
           for (int i = 0; i < dogs.length; i++) {
           System.out.println("Cuanta porcion:  ["+i+"]:  ");
           portion[i]=reader.nextDouble();
           }
       
           
            
            for (int i = 0; i < dogs.length; i++) {
                Dog2  dog = new Dog2();
            dog.setName(names[i]);
            System.out.println("nombre: "+dog.getName());    
            dog.setColour(colours[i]);
            System.out.println("colores: "+dog.getColour());
            dog.setWeight(weight[i]);
            System.out.println("pesos: "+dog.getWeight());
            dogs[i] = dog;
            dog.setPortion(portion[i]);
            System.out.println("porciones: "+dog.getPortion());
             dogs[i] = dog;
              }
            return dogs;
    }
}
