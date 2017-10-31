package it.nhan.clubseuro.adapters;
//packpage để ở số nhiều nhé.

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import it.nhan.clubseuro.activities.DetailActivity;
import it.nhan.clubseuro.R;
import it.nhan.clubseuro.models.Club;
//cái import nào không dùng thì xóa đi

/**
 * Created by nhan on 10/16/2017. Viết tên Dev rõ ràng hơn
 */

public class ClubAdapter extends ArrayAdapter<Club> {
    Activity context;
    @LayoutRes int resource;
    @NonNull List<Club> objects;//đổi tên cho rõ ràng hơn
    //set về private, cái nào cần public thì mới để public
    //Sau phần khai báo biến để trống một dòng cho dễ nhìn

    public ClubAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<Club> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater  = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        ImageView igClub = row.findViewById(R.id.igClub);
        TextView txtNameClub = row.findViewById(R.id.txtNameClub);
        TextView txtNational = row.findViewById(R.id.txtNational);
        TextView txtNumber = row.findViewById(R.id.txtNumber);


        final Club club = this.objects.get(position);
        igClub.setImageResource(club.getImage());
        txtNameClub.setText(club.getName());
        txtNational.setText(club.getNational());
        txtNumber.setText(club.getNumber()+ "");


        igClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyIntent(club);
            }
        });
        txtNameClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyIntent(club);
            }
        });
        txtNational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyIntent(club);
            }
        });
        txtNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyIntent(club);
            }
        });
        return row;

    }

    private void XuLyIntent(Club club) {//nên đặt là viewDetail hoặc là showDetail nhé, phải đặt tên rõ ràng
        Intent intent = new Intent(this.context, DetailActivity.class);
        intent.putExtra("CLUB",club);
        this.context.startActivity(intent);
    }
}
