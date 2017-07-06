package ca.roumani.countingrooms;

/**
 * Created by user on 6/27/17.
 */

public class CountingModel {

    private int buttonClickCounter;      //attributes
    private int[] coordinates = {0,0};   //iteration2
    private static final int WIDTH = 4;
    private static final int HEIGHT = 5;

    //constructor
    public CountingModel(){
        buttonClickCounter = 0;
    }

    //method (4 methods) all the buttons, iteration2

    public String getButtonClickCounter(){
        return String.format("%d", buttonClickCounter);   // "%d" reserves the number and string.format turns it to string
    }

    public String getCoordinates(){
        return String.format("(%d, %d)", coordinates[0], coordinates[1]);        //turns coordinate to string
    }

    //determines whether the robot can go in either direction of the coordinate system
    public boolean canGoNorth(){
        if(coordinates[1]-1 < 0 ){   //can't go up
            return false;
        }else
            return true;
    }

    public boolean canGoWest(){
        if(coordinates[0]-1 < 0){    //can't go right
            return false;
        }else
            return true;
    }

    public boolean canGoSouth(){
        if(coordinates[1]+1 > HEIGHT -1){   //can't go more the the max height
            return false;
        } else
            return true;
    }

    public boolean canGoEast(){
        if(coordinates[1]+1 > WIDTH -1){    // can't go more then the max width
            return false;
        }else
            return true;
    }

    //methods (all 4 buttons)
    public void northButtonClicked(){
        if(canGoNorth()){
            coordinates[1]--;
        }
        buttonClickCounter++;
    }

    public void westButtonClicked(){
        if(canGoWest()){
            coordinates[0]--;
        }
        buttonClickCounter++;
    }

    public void southButtonClicked(){
        if(canGoSouth()){
            coordinates[1]--;
        }
        buttonClickCounter++;
    }

    public void eastButtonClicked(){
        if(canGoEast()){
            coordinates[0]--;
        }
        buttonClickCounter++;
    }


    public static void main(String[] args) {
    }


}

