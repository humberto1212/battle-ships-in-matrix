package src.main;

import java.io.IOException;
//import java.util.Random;

        //import src.main.GameHelper.*;
import src.main.Ship.Ship;

import java.util.*;

public class ShipGame {
    
    public static void main(String[] args) throws IOException{

        //int numOfGuesses = 0;

        //GameHelper helper = new GameHelper();
        
        //Array of Ships
        //ArrayList<Ship> randomPositions = new ArrayList<Ship>(3);

        //create Ship
        //Ship sh = new Ship();

        //set random location in array
        //sh.setLocationCells(randomPositions);
        
        //String result = "";

        //while(result != "kill"){

            //Get user input
            //String guess = helper.getUserInput("enter a number");

                    //System.out.print(sp);

                    // for (int cell: sp){
                    //     System.out.print(cell);
                    // }
            

            //result = sh.checkYourSelf(guess);
            //numOfGuesses++;
        //}//END WHILE

        //System.out.print("congratulation, you made " + numOfGuesses + " guesses" );

    }//MAIN

    public void setUpGame(){
        //--------------------------
        //create ships Object
        //initialize ships Object
        //with name and location
        //--------------------------

        //Array of Ships
        ArrayList<Ship> shipList = new ArrayList<Ship>(3);

        Ship sh1 = new Ship();
        // Ship sh2 = new Ship();
        // Ship sh3 = new Ship();

        shipList.add(sh1);
        // shipList.add(sh2);
        // shipList.add(sh3);


        //call placeShip() from helper
            //set the location of each ship depending on placeShip() result
    }

    public void startPlaying(){
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
                //call helper.checkYourSelf() to evaluate tge result
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