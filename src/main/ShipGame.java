package src.main;

import java.io.IOException;
//import java.util.Random;

import src.main.GameHelper.GameHelper;
//import src.main.GameHelper.*;
import src.main.Ship.Ship;

import java.util.*;

public class ShipGame {
    
    int numOfGuesses = 0;
    static GameHelper helper = new GameHelper();
    //Array of Ships
    static ArrayList<ArrayList<String>> ShipsArray = new ArrayList<ArrayList<String>>(3);
    
    public static void  main(String[] args) throws IOException{
        setUpGame();
        startPlaying();
    }//MAIN

    public static void setUpGame(){
        //--------------------------
        //create ships Object
        //initialize ships Object
        //with name and location
        //--------------------------

        Ship ship = new Ship();
        ArrayList<String> ship1 = ship.NewShip();
        ArrayList<String> ship2 = ship.NewShip();
        ArrayList<String> ship3 = ship.NewShip();

        helper.PlaceShip(ship1, 0);
        helper.PlaceShip(ship2, 1);  
        helper.PlaceShip(ship3, 2);  

        ShipsArray.add(ship1);
        ShipsArray.add(ship2);
        ShipsArray.add(ship3);
    }

    public static void startPlaying() throws IOException{

        while(!ShipsArray.isEmpty()){
           String userInput = helper.GetUserInput("try your luck");
           
           checkUserGuess(userInput);
         }

        //persist with the game, call helper.getUserInput() until all ships are remove from the game
            //call the checkUserGuess() to evaluate result
    }

    public static String checkUserGuess(String userInput){
        //-----------------------------------------------
        //loops through all ships and call helper.checkYourSelf() 
            //Check if there is any hit or kill
            // ++ numberOfGuesses
        //----------------------------------------------
        String result = "miss";

        for(ArrayList<String> s: ShipsArray){
            Boolean check = false;
            check =  helper.CheckYourSelf(userInput, s);

            if(check == true){
              
                int index = s.indexOf(userInput);

                    s.remove(index);

                    if(s.isEmpty()){
                        result = "KILL!!";
                    }else{
                        result = "HIT!!";
                    }
            }else{
                result = "MIZZ";
            }
            
        }

        return result;

            //Set local result variable (miss)
            //repeat with each of the ship objects in the list
                //call helper.checkYourSelf() to evaluate the result
                // set the result kill or hit variable depending on the result

                //If the ship is kill, remove ship from the list

            //Display result 
    }

    public void finishGame(){
        //print the result at the end of the game
        //---------------------------------------

        //display a generic GAMEOVER result message 
        // if numberOfGuesses is small display a "Well done" 
        // else display a bad result
    }



}//CLASS