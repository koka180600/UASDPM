package ac.id.atmaluhur.mhs.WISATAAPPS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WisataAlam extends AppCompatActivity {
TextView wisata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);
        wisata =(TextView) findViewById(R.id.btnwisata);
        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WisataAlam.this, PantaiPenyusuk.class));
            }
        });
    }
}