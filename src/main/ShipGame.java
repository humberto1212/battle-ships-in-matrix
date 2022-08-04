package src.main;

import java.io.IOException;
//import java.util.Random;

import src.main.GameHelper.GameHelper;
//import src.main.GameHelper.*;
import src.main.Ship.Ship;

import java.util.*;

public class ShipGame {
    
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    //Array of Ships
    ArrayList<ArrayList<String>> ShipsArray = new ArrayList<ArrayList<String>>(3);
    
    public static void main(String[] args) throws IOException{
                    //Missing code
    }//MAIN

    public void setUpGame(){
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

    public void startPlaying() throws IOException{

        while(!ShipsArray.isEmpty()){
           String userInput = helper.GetUserInput("try your luck");
           

           for(ArrayList<String> s: ShipsArray){
                Boolean check = false;
                check =  helper.CheckYourSelf(userInput, s);

                if(check == true){
                  
                    int index = s.indexOf(userInput);
    
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
        }


        //persist with the game, call helper.getUserInput() until all ships are remove from the game
            //call the checkUserGuess() to evaluate result
    }

    public void checkUserGuess(){
        //-----------------------------------------------
        //loops through all ships and call helper.checkYourSelf() 
            //Check if there is any hit or kill
            // ++ numberOfGuesses
        //----------------------------------------------

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