package src.test;

import java.util.ArrayList;

import src.main.GameHelper.GameHelper;
import src.main.Ship.Ship;


public class ShipTestDrive {

    public static void main (String[] args){

        //----------------------
        //CREATE AND INIT OBJ SHIP
       //-----------------------
       Ship ship = new Ship();
       ArrayList<String> ship1 = ship.NewShip();

        //----------------------
        //CREATE OBJ AND INIT PLACE SHIPS
       //----------------------
       GameHelper placeShips = new GameHelper();

       placeShips.placeShip(ship1);  

        //---------------------
        //SAVE OBJs IN SHIPS ARRAY
       //----------------------
       ArrayList<String> ShipsArray = new ArrayList<String>(3);

        ShipsArray.addAll(ship1);
        // ShipsArray.addAll(ship2);
        // ShipsArray.addAll(ship3);
       

         for(String s: ShipsArray ){
             System.out.println(s);
         }



        // dot.setLocationCells(locations);

        // String result = dot.checkYourSelf(userGuess);

        // String testResult = "failed";

        // if (result.equals("hit")){
        //     testResult = "passed";

        // }

        // if (result.equals("kill")){
        //     testResult = "you made <X> moves";
        // }
        
        // if(result.equals("failed")){
        //     System.out.println(testResult);
        // }

        // System.out.println(testResult);

    }
}