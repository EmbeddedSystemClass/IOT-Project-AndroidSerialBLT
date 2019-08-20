package me.aflak.bluetoothterminal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_screen);

        Button btn_manual = (Button)findViewById(R.id.btn_manual);
        Button btn_automatic = (Button)findViewById(R.id.btn_automatic);

        btn_manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScreenSelect.this, Chat.class);


                int pos = getIntent().getExtras().getInt("pos");
                i.putExtra("pos", pos);


                startActivity(i);
                finish();
            }
        });

        btn_automatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScreenSelect.this, Wifi.class);

                int pos = getIntent().getExtras().getInt("pos");
                i.putExtra("pos", pos);

                startActivity(i);
                finish();
            }
        });
    }
}
