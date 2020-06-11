package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mba extends AppCompatActivity {

    private PDFView mba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba);


        mba=(PDFView)findViewById(R.id.mba);
        mba.fromAsset("MBA.pdf").load();
    }
}
