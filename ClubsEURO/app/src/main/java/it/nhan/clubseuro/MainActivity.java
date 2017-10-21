package it.nhan.clubseuro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.ClubAdapter;
import model.Club;

public class MainActivity extends AppCompatActivity {
    ListView lvClub;
    ArrayList<Club>dsClub;
    ClubAdapter clubAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvClub = (ListView) findViewById(R.id.lvClub);
        dsClub = new ArrayList<>();
        clubAdapter = new ClubAdapter(MainActivity.this,R.layout.item,dsClub);
        lvClub.setAdapter(clubAdapter);
        dsClub.add(new Club(R.drawable.realmadrid,"Real Madrid","Spain",12));
        dsClub.add(new Club(R.drawable.acmilan,"AC Milan","Italia",4));
        dsClub.add(new Club(R.drawable.barcelona,"Barcelona","Spain",4));
        dsClub.add(new Club(R.drawable.bayernmunchen,"Bayernmunchen","Germany",3));
        dsClub.add(new Club(R.drawable.boro,"Middlesbrough","England",3));
        dsClub.add(new Club(R.drawable.celtic,"Celtic","Scotland",2));
        dsClub.add(new Club(R.drawable.chelsea,"Chelsea","England",2));
        dsClub.add(new Club(R.drawable.intermilan,"Intermilan","Italia",2));
        dsClub.add(new Club(R.drawable.liverpool,"Liverpool","England",1));
        dsClub.add(new Club(R.drawable.manunited,"Manchester United","England",1));
        dsClub.add(new Club(R.drawable.psg,"Paris Saint-Germain","France",0));
        clubAdapter.notifyDataSetChanged();
    }
}
