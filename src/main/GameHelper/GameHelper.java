package src.main.GameHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

//import src.main.Ship.Ship;

public class GameHelper {


    public ArrayList<String> placeShip(ArrayList<String> ship, int  placeShipUsed){
      
      //Matrix x-axis
      ArrayList<String> charsArray = new ArrayList<String>();
      charsArray.add("A");
      charsArray.add("B");
      charsArray.add("C");
      charsArray.add("D");
      charsArray.add("E");
      charsArray.add("F");
      charsArray.add("G");

      System.out.println(placeShipUsed);


      //---------------------
      // FIRST SHIP AND THIRD SHIP
      //---------------------
      if(placeShipUsed == 0 || placeShipUsed == 2){
        Random rand = new Random();
        int intRandom1 = rand.nextInt(5);
        int intRandom2 = intRandom1 + 1;
        int intRandom3 = intRandom1 + 2;

        //rand for char
        int randIntChar = rand.nextInt(7);

        for(String r: charsArray){
          int indexRe = charsArray.indexOf(r);
          if(indexRe == randIntChar){
            String place1_1 = intRandom1 + r;
            String place1_2 = intRandom2 + r;
            String place1_3 = intRandom3 + r;

            ship.add(place1_1);
            ship.add(place1_2);
            ship.add(place1_3);

          }
        }
        
      }

      //---------------------
      //    SECOND SHIP
      //---------------------
      if(placeShipUsed == 1){

        Random rand = new Random();
        int intRandom = rand.nextInt(7);

        //rand for char
        int randIntChar2_1 = rand.nextInt(5);
        int randIntChar2_2 = randIntChar2_1 + 1;
        int randIntChar2_3 = randIntChar2_1 + 2;

        for(String r: charsArray){
          int indexRandIntChar = charsArray.indexOf(r);

          if(randIntChar2_1 == indexRandIntChar){
            String place2_1 = intRandom + r;
            ship.add(place2_1);
           
          }


          if(randIntChar2_2 == indexRandIntChar){
            String place2_2 = intRandom + r;
            ship.add(place2_2);
           
          }

          if(randIntChar2_3 == indexRandIntChar){
            String place2_3 = intRandom + r;
            ship.add(place2_3);
         

          }        
        }
             
      }
      //System.out.print(blockedPlaces);
      return ship;
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

    //--------------
    //Check if miss, hit or kill
    //--------------
    public Boolean checkYourSelf(String guess, ArrayList<String> ships){
      Boolean checked = false;

      for(String s: ships){
        if(s.equals(guess) ){
          checked = true;
        }
      }
      return checked;
  
  }

}
