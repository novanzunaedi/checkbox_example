package id.noz.checkbox.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb_android,cb_java, cb_opencv;
    private Button b_clickhere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_android = (CheckBox) findViewById(R.id.cb_android);
        cb_java    = (CheckBox) findViewById(R.id.cb_java);
        cb_opencv  = (CheckBox) findViewById(R.id.cb_opencv);
        b_clickhere = (Button) findViewById(R.id.b_clickhere);



        b_clickhere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Create string buffer to
                StringBuffer OUTPUT = new StringBuffer();
                OUTPUT.append("Android : ").append(
                        cb_android.isChecked());
                OUTPUT.append("\nJava : ").append(
                        cb_java.isChecked());
                OUTPUT.append("\nOpenCV :").append(
                        cb_opencv.isChecked());

                Toast.makeText(MainActivity.this, OUTPUT.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}
