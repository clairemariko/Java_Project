package example.codeclan.com.eightball;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 04/05/2016.
 */
public class EightBall extends AppCompatActivity {

        private ImageButton mEightBallButton;
        private EditText mEightBallInput;
        private TextView mEightBallDefault;
    private ArrayList<String> mAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_eightball);

        mEightBallButton = (ImageButton) findViewById(R.id.eightballbutton);
        mEightBallInput = (EditText) findViewById(R.id.eightballinput);
        mEightBallDefault =(TextView) findViewById(R.id.eightballanswer);

        mEightBallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String userInput= mEightBallInput.getText().toString();

                mEightBallDefault =(TextView) findViewById(R.id.text_noquestion);

                mEightBallDefault = (TextView) findViewById(R.id.eightballanswer);
                mEightBallDefault.setText( createResponse() );
                }
             });
         }


    public String createResponse() {
        mAnswers = new ArrayList<>();
        mAnswers.add("It is certain");
        mAnswers.add("It is decidedly so");
        mAnswers.add("Without a doubt");
        mAnswers.add("Yes, definitely");
        mAnswers.add("You may rely on it");
        mAnswers.add("As I see it, yes");
        mAnswers.add("Most likely");
        mAnswers.add("Outlook good");
        mAnswers.add("Yes");
        mAnswers.add("Signs point to yes");
        mAnswers.add("Reply hazy try again");
        mAnswers.add("Ask again later");
        mAnswers.add("Better not tell you now");
        mAnswers.add("Cannot predict now");
        mAnswers.add("Concentrate and ask again");
        mAnswers.add("Don't count on it");
        mAnswers.add("My reply is no");
        mAnswers.add("My sources say no");
        mAnswers.add("Outlook not so good");
        mAnswers.add("Very doubtful");

        mEightBallInput = (EditText) findViewById(R.id.eightballinput);
        String question = mEightBallInput.getText().toString();

        if( question.matches("")){
            return "Ask a question above";
        }
        if( question.toLowerCase().contains("lovecrumbs")){
            return "Yes and remind Claire to bring her travel mug";
        }
        if( question.toLowerCase().contains("lion bar")){
            return "No you should chose a better chocolate bar";
        }
        if ((question.toLowerCase().contains("spy") || question.toLowerCase().contains("resistance"))){
            return "You are always a spy";
        }
        if ( question.toLowerCase().contains("cake")){
            return "Tony will make it for you";
        }
        else {
            Random random = new Random();
            int result = random.nextInt(mAnswers.size());
            return mAnswers.get(result);
        }
        }


    }
