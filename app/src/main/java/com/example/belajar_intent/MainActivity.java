package com.example.belajar_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "*888#";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url = "https://smkn4bdg.sch.id";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }

    public void bukayt(View view) {
        String url = "https://m.youtube.com";
        Intent bukayoutube = new Intent(Intent.ACTION_VIEW);
        bukayoutube.setData(Uri.parse(url));
        startActivity(bukayoutube);
    }

    public void tentang(View view) {
        Intent tentang = new Intent(MainActivity.this, ACTIVITY_TENTANG.class);
        startActivity(tentang);
    }

    public void tentangsaya(View view) {
        Intent tentangsaya = new Intent(MainActivity.this, Tentang_Saya.class);
        startActivity(tentangsaya);
    }

}
