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
        ArrayList<String> ship2 = ship.NewShip();
        ArrayList<String> ship3 = ship.NewShip();

        //----------------------
        //CREATE OBJ AND INIT PLACE SHIPS
       //----------------------
       GameHelper placeShips = new GameHelper();

        placeShips.placeShip(ship1, 0);
        placeShips.placeShip(ship2, 1);  
        placeShips.placeShip(ship3, 2);  
        
        

        //---------------------
        //SAVE OBJs IN SHIPS ARRAY
       //----------------------
       ArrayList<ArrayList<String>> ShipsArray = new ArrayList<ArrayList<String>>(3);

       
        ShipsArray.add(ship1);
        ShipsArray.add(ship2);
        ShipsArray.add(ship3);

        System.out.println(ShipsArray);

        //----------------------
        //CHECK USER GUESS
        //----------------------
        GameHelper checkYourSelf = new GameHelper();

        

        for(ArrayList<String> s: ShipsArray){
            Boolean check = false;
            //"4D" is actually the guess value
            check = checkYourSelf.checkYourSelf("4D", s);
            
            

            

            if(check == true){
                //int index = ShipsArray.indexOf(s);
              
                int index = s.indexOf("4D");

                    s.remove(index);

                    if(s.isEmpty()){
                        System.out.println("KILL!!");
                    }else{
                        System.out.println("HIT!!");
                    }
           
            }else{
                System.out.println("MIZZ");
            }
        }

        System.out.println(ShipsArray);

        
    

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
