package src.main.Ship;

import java.util.ArrayList;

public class Ship {

    //int[] locationCells = new int[7];

    //int numberOfHits = 0;

    public ArrayList<String> NewShip(){
        ArrayList<String> ship = new ArrayList<String>(3);

        return ship;
    }

    



    //public void setLocationCells(ArrayList<Ship> ) {
        //locationCells = locations;
         //for(int l: locations){
            //locationCells[l] = l;
            //locationCells = locations;
        // }
    //}

    // public String checkYourSelf(String guess){

    //     String result = "miss";

    //     System.out.print("this are my location cells");
    //     System.out.println(locationCells);

    //     int index = locationCells.indexOf(guess);

    //     if(index >= 0){
    //         locationCells.remove(index);

    //         if(locationCells.isEmpty()){
    //             result = "kill";
    //         }else{
    //             result = "hit";
    //             numberOfHits++;
    //         }
    //     }
    
        // for (int cell: locationCells){
        //     if(guess == cell){
        //         result = "hit";
                
        //         numberOfHits++;

        //         locationCells.remove(cell);
            
        //         break;
        //     } //END IF
        // } //END FOR

        //  if(numberOfHits == 3){
        //      result = "kill"; 
        //  }

    //     System.out.println(result);
    //     return result;
    // }
    
}
