package com.galinc.maketfastpallet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.galinc.maketfastpallet.R;
import com.galinc.maketfastpallet.itility.Document;

import java.util.ArrayList;

public class DocumentAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater lInflater;
    private ArrayList<Document> objects;

    public DocumentAdapter(Context context, ArrayList<Document> documents) {
        this.context = context;
        objects = documents;
        lInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.base_item, parent, false);
        }

        ((TextView) view.findViewById(R.id.tvInfo)).setText(objects.get(position).name);
        ((TextView) view.findViewById(R.id.tvAdditional)).setText(objects.get(position).status);

        return view;
    }
}
