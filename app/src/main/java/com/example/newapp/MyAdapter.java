package com.example.newapp;

import static android.view.View.inflate;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyAdapter extends BaseAdapter {

    Activity activity;
    ArrayAdapter<Student> data;
    LayoutInflater inflater;


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i).getId();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View v=view;
        if (v==null)
        {
            v= inflate(R.layout.list_item,null);
            TextView txtName= v.findViewById((R.id.txtName));
            txtName.setText(data.get(i).getName());
            TextView txtPhone= v.findViewById((R.id.txtPhone));
            txtName.setText(data.get(i).getPhone());
            TextView txtAdd= v.findViewById((R.id.txtAdd));
            txtName.setText(data.get(i).getAddress());
        }
        return null;
    }
}
