package src.main.GameHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

//import src.main.Ship.Ship;

public class GameHelper {


    public ArrayList<String> PlaceShip(ArrayList<String> ship){

      //VARs
      int placeShipUsed = 0;
      ArrayList<String> charsArray = new ArrayList<String>();
      charsArray.add("A");
      charsArray.add("B");
      charsArray.add("C");
      charsArray.add("D");
      charsArray.add("E");
      charsArray.add("F");
      charsArray.add("G");

      if(placeShipUsed == 0){

        Random rand = new Random();
        int intRandom1 = rand.nextInt(5);
        int intRandom2 = intRandom1 + 1;
        int intRandom3 = intRandom1 + 2;

        //rand for char
        int randIntChar = rand.nextInt(7);

        for(String r: charsArray){
          int indexRe = charsArray.indexOf(r);
          if(indexRe == randIntChar){
            String place1 = intRandom1 + r;
            String place2 = intRandom2 + r;
            String place3 = intRandom3 + r;

            ship.add(place1);
            ship.add(place2);
            ship.add(place3);

          }
        }

      }
 

      return ship;

      //ArrayList<Ship> locationCells = new ArrayList<Ship>();

      // locationCells.add("A2");
      // locationCells.add("B2");
      // locationCells.add("C2");

      //return locationCells;
    }


    //--------------
    //Get User Input
    //--------------
    public String getUserInput(String prompt) throws IOException{

        System.out.print(prompt + ": ");

          // Enter data using BufferReader
          BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

            // Reading data using readLine
            String hitNumberStr = reader.readLine();
            //int hitNumberInt = Integer.parseInt(hitNumberStr);

            return hitNumberStr;

    }
}
