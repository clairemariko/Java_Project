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


    ImageButton mYodaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mYodaButton = (ImageButton) findViewById(R.id.yoda_button);

        mYodaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Landing:", "submit button clicked!");

                Intent ClickedButton = new Intent(Landing.this, AnswerDetails.class);

                startActivity(ClickedButton);
            }


        });

    }
}