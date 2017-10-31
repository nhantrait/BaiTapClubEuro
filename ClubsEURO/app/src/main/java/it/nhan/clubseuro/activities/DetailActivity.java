package it.nhan.clubseuro.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import it.nhan.clubseuro.R;
import it.nhan.clubseuro.models.Club;

public class DetailActivity extends AppCompatActivity {
    TextView txtNameClub1,txtNational1,txtNumber1;
    ImageView igClub1;//imgClub
    Club selectedClub = null;//club
    //set private, xuống một dòng, bỏ mấy cái số 1 đi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        txtNameClub1 = (TextView) findViewById(R.id.txtNameClub1);
        txtNational1 = (TextView) findViewById(R.id.txtNational1);
        igClub1 = (ImageView) findViewById(R.id.igClub1);
        txtNumber1 = (TextView) findViewById(R.id.txtNumber1);

        Intent intent = getIntent();
        selectedClub = (Club) intent.getSerializableExtra("CLUB");
        igClub1.setImageResource(selectedClub.getImage());
        txtNameClub1.setText(selectedClub.getName());
        txtNational1.setText(selectedClub.getNational());
        txtNumber1.setText(selectedClub.getNumber()+"");
    }
}
