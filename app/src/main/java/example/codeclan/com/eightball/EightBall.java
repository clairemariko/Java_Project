package example.codeclan.com.eightball;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 02/05/2016.
 */
public class EightBall extends AppCompatActivity {

    Button mMainButton;
    EditText mQuestionInput;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("EightBall:", "onCreateCalled");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mMainButton = (Button) findViewById(R.id.main_button);
        mQuestionInput = (EditText) findViewById(R.id.main_question);



        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("EightBall:", "submit button clicked!");

                Intent ClickedButton = new Intent (EightBall.this, AnswerDetails.class);

                ClickedButton.putExtra("question", mQuestionInput.getText().toString());

                startActivity(ClickedButton);
            }
        });
    }
}
