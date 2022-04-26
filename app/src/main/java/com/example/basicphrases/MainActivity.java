package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // membuat fungsi on click buttonTapped
    public void buttonTapped(View view){

        int id = view.getId();
        String ourId = "";

        // inisialisasi string ourId untuk mengambil value dari nama id button
        ourId = view.getResources().getResourceEntryName(id);

        //mengambil nama file dari folder raw
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.basicphrases");

        // menjalankan suara
        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();
        // setiao tombl yang ditekan makan akan memiliki id tersendiri yang diambil dar masing masing id button
        Log.i("Button tapped", ourId);


    }
}