package trap1.khatoresha.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.graphics.Canvas;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText tbox1, tbox2;
    TextView question1, question2, finalText;
    String firstBit, secondBit;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submitButton);
        tbox1=findViewById(R.id.tb1);
        question1=findViewById(R.id.q1);
        tbox2=findViewById(R.id.tb2);
        question2=findViewById(R.id.q2);
        finalText=findViewById(R.id.fT);
        //Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.arcOfHearts);
        //int mPhotoWidth = mBitmap.getWidth();
        //int mPhotoHeight = mBitmap.getHeight();
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("Hello mom");
                Log.i("testButton","Hi dad... "+tbox1.getText());
                firstBit = tbox1.getText().toString();
                secondBit = tbox2.getText().toString();
                finalText.setText("Together you are:\n"+firstBit.substring(0, firstBit.length()/2)
                        +secondBit.substring(secondBit.length()/2));
            }
        });

    }
}
