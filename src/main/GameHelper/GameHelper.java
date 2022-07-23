package src.main.GameHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//import src.main.Ship.Ship;

public class GameHelper {


    public ArrayList<String> placeShip(ArrayList<String> ship){

      ship.add("A2");
      ship.add("B2");
      ship.add("C2");

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
