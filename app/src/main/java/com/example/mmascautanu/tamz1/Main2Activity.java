package com.example.mmascautanu.tamz1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mmascautanu.tamz1.MainActivity.names;

public class Main2Activity extends Activity {

    TextView name;
    TextView dateFromTo;
    TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        dateFromTo = findViewById(R.id.dateFromTo);
        desc = findViewById(R.id.desc);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mesic");

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

        if(message.equals("Kozoroh")) {
            name.setText(message);
            dateFromTo.setText("22. prosinec - 20. leden");
            desc.setText("Fakt super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Vodnar")) {
            name.setText(message);
            dateFromTo.setText("21. leden - 20. únor");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Ryby")) {
            name.setText(message);
            dateFromTo.setText("21. únor - 20. březen");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Beran")) {
            name.setText(message);
            dateFromTo.setText("21. březen - 20. duben");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Byk")) {
            name.setText(message);
            dateFromTo.setText("21. duben - 21. květen");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Blizenci")) {
            name.setText(message);
            dateFromTo.setText("22. květen - 20. červen");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Rak")) {
            name.setText(message);
            dateFromTo.setText("22. červen - 22. červenec");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Lev")) {
            name.setText(message);
            dateFromTo.setText("23. červenec - 22. srpen");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Panna")) {
            name.setText(message);
            dateFromTo.setText("23. srpen - 22. září");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Vahy")) {
            name.setText(message);
            dateFromTo.setText("23. září - 23. říjen");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Stir")) {
            name.setText(message);
            dateFromTo.setText("24. říjen - 22. listopad");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }

        if(message.equals("Strelec")) {
            name.setText(message);
            dateFromTo.setText("23. listopad - 21. prosinec");
            desc.setText("Fakt další super týpek:)))");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.horoskopy.cz/" + message));
            startActivity(browserIntent);
        }
    }
}
