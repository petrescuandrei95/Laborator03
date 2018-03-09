package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class PhoneDialerActivity extends AppCompatActivity {

    EditText phoneNumber;
    ImageButton back;
    Button[] buttons = new Button[10];
    Button buttonstar;
    Button buttondiez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        phoneNumber = (EditText) findViewById(R.id.editText);
        back = (ImageButton)findViewById(R.id.back);
        buttons[1] = (Button)findViewById(R.id.button);
        buttons[2] = (Button)findViewById(R.id.button2);
        buttons[3] = (Button)findViewById(R.id.button3);
        buttons[4] = (Button)findViewById(R.id.button5);
        buttons[5] = (Button)findViewById(R.id.button6);
        buttons[6] = (Button)findViewById(R.id.button7);
        buttons[7] = (Button)findViewById(R.id.button9);
        buttons[8] = (Button)findViewById(R.id.button10);
        buttons[9] = (Button)findViewById(R.id.button11);
        buttons[0] = (Button)findViewById(R.id.button13);
        buttonstar = (Button)findViewById(R.id.button12);
        buttondiez = (Button)findViewById(R.id.button14);

        final String phoneNumber;

        for (Integer i = 0; i < 10; i++) {
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    phoneNumber += i.toString();
                    
                }
            });
        }
    }




}
