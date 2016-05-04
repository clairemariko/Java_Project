package example.codeclan.com.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by user on 03/05/2016.
 */
public class Landing extends AppCompatActivity {


    ImageButton mStarWarsButton;
    ImageButton mEightBallButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_landing);

        mStarWarsButton = (ImageButton) findViewById(R.id.row_image_starwars);
        mEightBallButton =(ImageButton) findViewById(R.id.ball_row_image);



        mStarWarsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Landing:", "submit button clicked!");

                Intent ClickedButton = new Intent(Landing.this, Yoda.class);

                startActivity(ClickedButton);
            }
        });

        mEightBallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Landing:", "submit button clicked!");

                Intent ClickedButton = new Intent(Landing.this, EightBall.class);

                startActivity(ClickedButton);
            }
        });

    }
}