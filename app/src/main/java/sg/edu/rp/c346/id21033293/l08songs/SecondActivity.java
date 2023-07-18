package sg.edu.rp.c346.id21033293.l08songs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ArrayList<Song> al;
    ListView lv;
    Button btnShowFiveStar;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnShowFiveStar = (Button) findViewById(R.id.btnFive);
        lv = (ListView) findViewById(R.id.lv);
        al = new ArrayList<Song>();

        DBHelper db = new DBHelper(SecondActivity.this);
        al.clear();
        al.addAll(db.getAllSongs);
        db.close();

        aa = new ArrayAdapter<>(SecondActivity.this, android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);

        
    }
}