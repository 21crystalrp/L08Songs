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
        al.addAll(db.getAllSongs());
        db.close();

        aa = new ArrayAdapter(SecondActivity.this, android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent gothirdActivity = new Intent(SecondActivity.this, ThirdActivity.class);

                Song data = al.get(position);

                gothirdActivity.putExtra("data" , data);
                startActivity(gothirdActivity);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 9){
            lv = (ListView)findViewById(R.id.lv);
            al = new ArrayList<Song>();
            DBHelper dbh = new DBHelper(SecondActivity.this);
            al.clear();
            al.addAll(dbh.getAllSongs());
            dbh.close();
            aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1,al);

            lv.setAdapter(aa);
        }
    }
}