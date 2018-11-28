package com.example.omkar.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Belal on 9/14/2017.
 */

//we need to extend the ArrayAdapter class as we are building an adapter
public class MyListAdapter extends ArrayAdapter<Hero> {

    //the list values in the List of type hero
    List<Hero> heroList;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public MyListAdapter(Context context, int resource, List<Hero> heroList) {
        super(context, resource, heroList);
        this.context = context;
        this.resource = resource;
        this.heroList = heroList;
    }

    //this will return the ListView Item as a View
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view

        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewPost = view.findViewById(R.id.textViewPost);
        TextView textViewMail = view.findViewById(R.id.textViewMail);
        TextView textViewNumber = view.findViewById(R.id.textViewNumber);
        TextView textViewIntercom = view.findViewById(R.id.textViewIntercom);

        //getting the hero of the specified position
        Hero hero = heroList.get(position);

        //adding values to the list item
        textViewName.setText(hero.getName());
        textViewPost.setText(hero.getPost());
        textViewMail.setText(hero.getMail());
        textViewNumber.setText(hero.getNumber());
        textViewIntercom.setText(hero.getIntercom());
        //adding a click listener to the button to remove item from the list


        //finally returning the view
        return view;
    }


    }

