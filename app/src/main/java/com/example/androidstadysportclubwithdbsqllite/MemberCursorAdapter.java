package com.example.androidstadysportclubwithdbsqllite;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.androidstadysportclubwithdbsqllite.data.ClubOlimpusContract;

public class MemberCursorAdapter extends CursorAdapter {
    public MemberCursorAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.item_member, viewGroup, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView firstNameTextView = view.findViewById(R.id.firstNameTextView);
        TextView lastNameTextView= view.findViewById(R.id.lastNameTextView);
        TextView sportTextView= view.findViewById(R.id.sportTextView);

        String firstName = cursor.getString
                (cursor.getColumnIndexOrThrow(ClubOlimpusContract.MemberEntry.COLUMN_FIRST_NAME));
        String lastName = cursor.getString
                (cursor.getColumnIndexOrThrow(ClubOlimpusContract.MemberEntry.COLUMN_LAST_NAME));
        String sport = cursor.getString
                (cursor.getColumnIndexOrThrow(ClubOlimpusContract.MemberEntry.COLUMN_SPORTS));

        firstNameTextView.setText(firstName);
        lastNameTextView.setText(lastName);
        sportTextView.setText(sport);

    }
}
