package day39_CustomClass_Statics.carpetTask;

import java.util.ArrayList;

public class CarPetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5,2, 3.5, false);
        carpets[1].customOrder(4.5,3.5, 4.5, false);
        carpets[2].customOrder(6,1, 6.5, true);
        carpets[3].customOrder(5.5,3.5, 8.5, false);
        carpets[4].customOrder(10,2, 7.5, true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();






    }

}

/*
create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
        write a program to add all the persian Carpets into the list of persianCarpets, and add all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */