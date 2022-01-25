package ac.id.atmaluhur.mhs.WISATAAPPS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.View;

public class MenuUtama2 extends AppCompatActivity {
View wisata;
View kuliner;
View keluar;
View About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama2);
        wisata =(View) findViewById(R.id.button11);
        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuUtama2.this, WisataAlam.class));
            }
        });
        kuliner =(View) findViewById(R.id.button2);
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuUtama2.this,Kuliner.class));
            }
        });
        keluar =(View) findViewById(R.id.button3);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuUtama2.this, MainActivity.class));
            }
        });
        About =(View) findViewById(R.id.button4);
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuUtama2.this, About.class));
            }
        });

    }
}