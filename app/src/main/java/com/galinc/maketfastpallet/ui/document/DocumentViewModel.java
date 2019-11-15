package com.galinc.maketfastpallet.ui.document;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.galinc.maketfastpallet.itility.Document;

import java.util.ArrayList;

public class DocumentViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Document>> mText;

    public DocumentViewModel() {
        mText = new MutableLiveData<>();
        ArrayList<Document> documentArrayList = new ArrayList<>();
        documentArrayList.add(new Document("Формирование паллет №1","Выгружен\nПроведен") );
        documentArrayList.add(new Document("Формирование паллет №2","Выгружен") );
        documentArrayList.add(new Document("Формирование паллет №3","Выгружен") );
        documentArrayList.add(new Document("Формирование паллет №4","Выгружен") );
        mText.setValue(documentArrayList);
    }

    public LiveData<ArrayList<Document>> getText() {
        return mText;
    }
}