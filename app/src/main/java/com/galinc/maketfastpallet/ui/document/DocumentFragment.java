package com.galinc.maketfastpallet.ui.document;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.galinc.maketfastpallet.MainActivity;
import com.galinc.maketfastpallet.R;
import com.galinc.maketfastpallet.adapter.DocumentAdapter;
import com.galinc.maketfastpallet.itility.Document;

import java.util.ArrayList;
import java.util.Objects;

public class DocumentFragment extends Fragment {

    private DocumentViewModel documentViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        documentViewModel =
                ViewModelProviders.of(this).get(DocumentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_document, container, false);
        final ListView listView = root.findViewById(R.id.listView);

        documentViewModel.getText().observe(this, s -> {
//                textView.setText(s);
            DocumentAdapter adapter = new DocumentAdapter(Objects.requireNonNull(getContext()),s);
            listView.setAdapter(adapter);
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
//                Bundle bundle = new Bundle();
//                bundle.putString("Test",listView.getAdapter());
            if (getView() != null)
            Navigation.findNavController(getView()).navigate(R.id.action_nav_home_to_nav_gallery);
        });
        return root;
    }


}