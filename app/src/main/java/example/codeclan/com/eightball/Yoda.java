package example.codeclan.com.eightball;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by user on 02/05/2016.
 */
public class Yoda extends AppCompatActivity {

    ImageButton mMainButton;
    EditText mQuestionInput;
    TextView mDefaultMessage;





    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("Yoda:", "onCreateCalled");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_yoda);

        final MediaPlayer hmmSoundMP = MediaPlayer.create(this, R.raw.hmmmm);



        mMainButton = (ImageButton) findViewById(R.id.main_button);
        mQuestionInput = (EditText) findViewById(R.id.main_question);
        mDefaultMessage =(TextView) findViewById(R.id.text_noquestion);




        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Yoda:", "submit button clicked!");

                String userInput= mQuestionInput.getText().toString();

                mDefaultMessage =(TextView) findViewById(R.id.text_noquestion);

                hmmSoundMP.start();

                if (userInput.equals("")) {
                    customToast();




                } else {

                    Intent ClickedButton = new Intent (Yoda.this, YodaAnswer.class);

                    ClickedButton.putExtra("question", userInput);

                    startActivity(ClickedButton);

                }
            }

        });
    }


    private void customToast(){
        LayoutInflater customInflator = getLayoutInflater();
        View customToastLayout = customInflator.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.toast_layout_container));

        TextView customText =(TextView) customToastLayout.findViewById(R.id.custom_toast_text);
        customText.setText("ENTER QUESTION YOU MUST!");


        Toast customToast = new Toast(getApplicationContext());
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.setView(customToastLayout);
        customToast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
        customToast.show();
    }


}
