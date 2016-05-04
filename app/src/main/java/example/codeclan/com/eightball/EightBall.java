package example.codeclan.com.eightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 04/05/2016.
 */
public class EightBall extends AppCompatActivity {

        ImageButton mEightBallButton;
        EditText mEightBallInput;
        TextView mEightBallDefault;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_eightball);
    }

}
