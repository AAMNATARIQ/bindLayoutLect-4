package amnatariq.org.lecture_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding event
        tv = findViewById(R.id.MyTextView);
        btn = findViewById(R.id.ButtonClick);

        //onclick listner function
//        btn.setOnClickListener(new View.OnClickListner(){
//            @Override
//
//        })
    }

    public void ChangeText(View view)
    {
        tv.setText("New Text");
    }
}