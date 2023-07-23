package sg.edu.rp.c346.id21033293.l08songs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ThirdActivity extends AppCompatActivity {

    EditText songID;
    EditText etSongTitle;
    EditText etSingers;
    EditText etYear;
    Button btnUpdate;
    Button btnDelete;
    Button btnCancel;
    RadioGroup rgStars;
    RadioButton rb;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    RadioButton rb5;
    Song data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        songID = findViewById(R.id.songID);
        etSongTitle = findViewById(R.id.etSongTitle);
        etSingers = findViewById(R.id.etSongSinger);
        etYear = findViewById(R.id.etYear);
        rgStars =findViewById(R.id.rgStars);
        rb1 =  findViewById(R.id.radio1);
        rb2 =  findViewById(R.id.radio2);
        rb3 = findViewById(R.id.radio3);
        rb4 = findViewById(R.id.radio4);
        rb5 = findViewById(R.id.radio5);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnCancel =findViewById(R.id.btnCancel);
        btnDelete = findViewById(R.id.btnDelete);
    }
}