package example.codeclan.com.eightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Random;

/**
 * Created by user on 02/05/2016.
 */
public class YodaAnswer extends AppCompatActivity {

    TextView mAnswerText;


    String answers[] = {
            "Always pass on what you have learned",
            "Patience you must have young Padawan",
            "Must unlearn what you have learned",
            "Do or do not. There is no try",
            "May the Force be with you",
            "Difficult to see. Always in the motion the future",
            "Use your feelings Obi-Wan find him you will",
            "It is decidedly so",
            "Without a doubt",
            "Yes, definitely",
            "You may rely on it",
            "As I see it, yes",
            "Cannot predict now"


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
