package example.codeclan.com.eightball;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by user on 02/05/2016.
 */
public class EightBall extends AppCompatActivity {

    ImageButton mMainButton;
    EditText mQuestionInput;
    TextView mDefaultMessage;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("EightBall:", "onCreateCalled");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mMainButton = (ImageButton) findViewById(R.id.main_button);
        mQuestionInput = (EditText) findViewById(R.id.main_question);
        mDefaultMessage =(TextView) findViewById(R.id.text_noquestion);



        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("EightBall:", "submit button clicked!");

                String userInput= mQuestionInput.getText().toString();

                mDefaultMessage =(TextView) findViewById(R.id.text_noquestion);

                if (userInput.equals("")) {
                    mDefaultMessage.setText("Question enter you have not!");



                } else {

                    Intent ClickedButton = new Intent (EightBall.this, AnswerDetails.class);

                    ClickedButton.putExtra("question", userInput);

                    startActivity(ClickedButton);

                }
            }

        });
    }


}
