package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sonucEkrani, cozumEkrani;
    Button buttonSil, buttonParantezAc, buttonParantezKapat;
    Button buttonBolme, buttonCarpma, buttonToplama, buttonCikarma;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonTemizle, buttonNokta, buttonEsittir;
    String mevcut;
    String sonuc;
    boolean kontrolNokta, kontrolIslem;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mevcut = "";
        sonuc = "";
        kontrolNokta = false;
        kontrolIslem = false;

        sonucEkrani = (TextView) findViewById(R.id.sonuc_ekrani);
        cozumEkrani = (TextView) findViewById(R.id.cozum_ekrani);

        button0 = (Button) findViewById(R.id.button_sifir);
        button1 = (Button) findViewById(R.id.button_bir);
        button2 = (Button) findViewById(R.id.button_iki);
        button3 = (Button) findViewById(R.id.button_uc);
        button4 = (Button) findViewById(R.id.button_dort);
        button5 = (Button) findViewById(R.id.button_bes);
        button6 = (Button) findViewById(R.id.button_alti);
        button7 = (Button) findViewById(R.id.button_yedi);
        button8 = (Button) findViewById(R.id.button_sekiz);
        button9 = (Button) findViewById(R.id.button_dokuz);
        buttonSil = (Button) findViewById(R.id.button_sil);
        buttonParantezAc = (Button) findViewById(R.id.button_parantez_ac);
        buttonParantezKapat = (Button) findViewById(R.id.button_parantez_kapat);
        buttonBolme = (Button) findViewById(R.id.button_bolme);
        buttonCarpma = (Button) findViewById(R.id.button_carpma);
        buttonToplama = (Button) findViewById(R.id.button_toplama);
        buttonCikarma = (Button) findViewById(R.id.button_cikarma);
        buttonTemizle = (Button) findViewById(R.id.button_temizle);
        buttonNokta = (Button) findViewById(R.id.button_nokta);
        buttonEsittir = (Button) findViewById(R.id.button_esittir);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "0";
                setCozumEkrani();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "1";
                setCozumEkrani();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "2";
                setCozumEkrani();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "3";
                setCozumEkrani();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "4";
                setCozumEkrani();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "5";
                setCozumEkrani();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "6";
                setCozumEkrani();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "7";
                setCozumEkrani();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "8";
                setCozumEkrani();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mevcut += "9";
                setCozumEkrani();
            }
        });

        buttonNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mevcut.isEmpty()) {
                    mevcut = "0.";
                    kontrolNokta = true;
                }

                if(kontrolNokta == false) {
                    mevcut += ".";
                    kontrolNokta = true;
                }
                setCozumEkrani();
            }
        });

        buttonTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temizle();
                setCozumEkrani();
                setSonucEkrani();
            }
        });

        buttonBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontrolNokta = false;

                if(!mevcut.isEmpty()) {
                    if (mevcut.substring(mevcut.length()-1, mevcut.length()).equals(".")) {
                        sil();
                    }
                }
                if (kontrolIslem == false) {
                    mevcut += " / ";
                    kontrolIslem = true;
                }
                setCozumEkrani();
            }
        });

        buttonCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontrolNokta = false;

                if(!mevcut.isEmpty()) {
                    if (mevcut.substring(mevcut.length()-1, mevcut.length()).equals(".")) {
                        sil();
                    }
                }
                if (kontrolIslem == false) {
                    mevcut += " * ";
                    kontrolIslem = true;
                }
                setCozumEkrani();
            }
        });

        buttonToplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontrolNokta = false;

                if(!mevcut.isEmpty()) {
                    if (mevcut.substring(mevcut.length()-1, mevcut.length()).equals(".")) {
                        sil();
                    }
                }
                if (kontrolIslem == false) {
                    mevcut += " + ";
                    kontrolIslem = true;
                }
                setCozumEkrani();
            }
        });

        buttonCikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kontrolNokta = false;

                if(!mevcut.isEmpty()) {
                    if (mevcut.substring(mevcut.length()-1, mevcut.length()).equals(".")) {
                        sil();
                    }
                }
                if (kontrolIslem == false) {
                    mevcut += " - ";
                    kontrolIslem = true;
                }
                setCozumEkrani();
            }
        });

        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sil();
                setCozumEkrani();
            }
        });

        buttonEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kontrolIslem = true && !mevcut.substring(mevcut.length()-1, mevcut.length()).equals(" ")) {
                    String [] karakterler = mevcut.split(" ");

                    switch (karakterler[1].charAt(0)) {
                        case '/':
                            sonuc = Double.toString(Double.parseDouble(karakterler[0]) / Double.parseDouble(karakterler[2]));
                            break;
                        case '*':
                            sonuc = Double.toString(Double.parseDouble(karakterler[0]) * Double.parseDouble(karakterler[2]));
                            break;
                        case '+':
                            sonuc = Double.toString(Double.parseDouble(karakterler[0]) + Double.parseDouble(karakterler[2]));
                            break;
                        case '-':
                            sonuc = Double.toString(Double.parseDouble(karakterler[0]) - Double.parseDouble(karakterler[2]));
                            break;
                    }
                    setSonucEkrani();
                }
            }
        });

    }

    private void setCozumEkrani() {
        cozumEkrani.setText(mevcut);
    }

    private void setSonucEkrani() {
        sonucEkrani.setText(sonuc);
    }

    private void temizle() {
        sonuc = "";
        mevcut = "";
        kontrolNokta = false;
        kontrolIslem = false;
    }

    private void sil() {
        if(!mevcut.isEmpty()) {
            if (mevcut.substring(mevcut.length()-1, mevcut.length()).equals(".")) {
                kontrolNokta = false;
            }

            if (mevcut.substring(mevcut.length()-1, mevcut.length()).equals(" ")) {
                mevcut = mevcut.substring(0, mevcut.length()-3);
                kontrolIslem = false;
            }
            else {
                mevcut = mevcut.substring(0, mevcut.length()-1);
            }
        }
    }
}