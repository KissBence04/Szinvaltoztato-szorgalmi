package com.example.szinvaltoztato_szorgalmi;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity{

private TextView textView;
private SeekBar seekBar1,seekBar2,seekBar3;
private RelativeLayout relativelayout;
private String  redColor="00", greenColor="00", blueColor="00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SzinvaltozatasFolyamata(seekBar1,100,true);
        SzinvaltozatasFolyamata(seekBar2,100,true);
        SzinvaltozatasFolyamata(seekBar3,100,true);

    }

    public void init()
        {
        this.relativelayout= (RelativeLayout)findViewById(R.id.relativeLayout);
        this.textView=(TextView) findViewById(R.id.textView);
        this.seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        this.seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        this.seekBar3 = (SeekBar) findViewById(R.id.seekBar3);

        this.seekBar1.setMax(100);
        this.seekBar2.setMax(100);
        this.seekBar3.setMax(100);
        }

    public void SzinvaltozatasFolyamata(SeekBar seekBar, int i, boolean b) {
        if (seekBar1.getId() == R.id.seekBar1) {
        this.redColor = String.format("%02x", (int) ((double) i / 100 * 255));
        } else if (seekBar2.getId() == R.id.seekBar1) {
        this.greenColor = String.format("%02x", (int) ((double) i / 100 * 255));
        } else {
        this.blueColor = String.format("%02x", (int) ((double) i / 100 * 255));
        }

        relativelayout.setBackgroundColor(Color.parseColor("#"+this.redColor+this.greenColor+this.blueColor));

        this.textView.setText("Színkód (RGB): " + "#" + this.redColor + this.greenColor + this.blueColor);
        }

    }

