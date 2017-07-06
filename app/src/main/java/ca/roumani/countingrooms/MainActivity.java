package ca.roumani.countingrooms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variable to hold the model
    CountingModel model;
    Button northButton;
    Button eastButton;
    Button westButton;
    Button southButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        model = new CountingModel();

        northButton = (Button) findViewById(R.id.northButton);
        eastButton = (Button) findViewById(R.id.eastButton);
        westButton = (Button) findViewById(R.id.westButton);
        southButton = (Button) findViewById(R.id.southButton);

        updateButton();
    }

    //controller method
    private void numberView(){
        TextView number = (TextView) findViewById(R.id.numberView);
        number.setText(this.model.getButtonClickCounter());                //connect with getButtonClickCounter() to get output

        TextView coordinate = (TextView) findViewById(R.id.coordinateView);
        coordinate.setText(this.model.getCoordinates());
    }

    //If robot can't go to certain direction, change background color to red, otherwise change to green
    private void updateButton(){
        if(!this.model.canGoNorth()){
            this.northButton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light)); //sets color red
        }else {
            this.northButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light)); //sets color green
        }

        if(!this.model.canGoSouth()){
            this.southButton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        }else {
            this.southButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        }

        if(!this.model.canGoEast()){
            this.eastButton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        }else {
            this.eastButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        }

        if(!this.model.canGoWest()){
            this.westButton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        }else {
            this.westButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        }

    }

     //methods for the buttons
    public void northButtonClicked(View v){
        this.model.northButtonClicked();
        this.numberView();
    }

    public void westButtonClicked(View v){
        this.model.westButtonClicked();
        this.numberView();
    }

    public void eastButtonClicked(View v){
        this.model.eastButtonClicked();
        this.numberView();
    }

    public void southButtonClicked(View v){
        this.model.southButtonClicked();
        this.numberView();
    }

}
