package example.codeclan.com.eightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 02/05/2016.
 */
public class AnswerDetails extends AppCompatActivity {

    TextView mAnswerText;


    String answers[] = {
            "come back to me another day",
            "yes",
            "no",
            "maybe"
    };


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details);

        mAnswerText = (TextView) findViewById(R.id.text_answer);
        //make this a default your question is unanswerable

        int index = new Random().nextInt(answers.length);

        mAnswerText.setText(answers[index]);
    }
}
