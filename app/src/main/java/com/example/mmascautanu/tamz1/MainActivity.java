package com.example.mmascautanu.tamz1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements DatePicker.OnDateChangedListener {

    TextView myText1;
    TextView myText2;
    DatePicker myDate;
    ImageView myImage;

    SharedPreferences mySharedPref;
    SharedPreferences.Editor mySharedEditor;

    static String names[] = {"Kozoroh", "Vodnar", "Ryby", "Beran", "Byk", "Blizenci", "Rak", "Lev", "Panna", "Vahy", "Stir", "Strelec"};

    static int zodiacSymbols[] = {
            R.drawable.kozoroh01,
            R.drawable.vodnar02,
            R.drawable.ryby03,
            R.drawable.beran04,
            R.drawable.byk05,
            R.drawable.blizenci06,
            R.drawable.rak07,
            R.drawable.lev08,
            R.drawable.panna09,
            R.drawable.vahy10,
            R.drawable.stir11,
            R.drawable.strelec12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySharedPref = getSharedPreferences("myPref", MODE_PRIVATE);
        int myMonth = mySharedPref.getInt("month", 0);
        int myDay = mySharedPref.getInt("day", 1);
        int myYear = mySharedPref.getInt("yearrr", 2018);
        String myZodiacName = mySharedPref.getString("zodiacName", "Kozoroh");

        myText1 = findViewById(R.id.birthday);
        myText1.setText("Zadej datum narození:");

        myImage = findViewById(R.id.imageView);
//        myImage.setOnTouchListener(myTouch);

        myText2 = findViewById(R.id.textView);
        myText2.setText(myZodiacName);

        myDate = findViewById(R.id.myDatePicker);
        myDate.init(myYear, myMonth, myDay, this);
    }

//    ImageView.OnTouchListener myTouch = new ImageView.OnTouchListener() {
//        @Override
//        public boolean onTouch(View v, MotionEvent event) {
//
//            switch(event.getAction()) {
//                case MotionEvent.ACTION_DOWN: {
//                    //nastaveni barvy
//                    myImage.getDrawable().setColorFilter(Color.argb(120, 0, 255, 0), PorterDuff.Mode.SRC_ATOP);
//                    myImage.invalidate();
//                    Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_LONG).show();
//                    break;
//                }
//
//                case MotionEvent.ACTION_UP: {
//                    //clear barvy
//                    myImage.getDrawable().clearColorFilter();
//                    //ulozeni
//                    myImage.invalidate();
//                    Toast.makeText(getApplicationContext(), "ACTON_UP", Toast.LENGTH_LONG).show();
//                    Intent intent = new Intent(getApplicationContext(), aboutActivity.class);
//                    String message = "ASFjkj";
//                    intent.putExtra("myMsgggg", message);
//                    startActivity(intent);
//
//                    break;
//                }
//            }
//            return true;
//        }
//    };

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        mySharedEditor = mySharedPref.edit();
        mySharedEditor.putInt("month", monthOfYear);
        mySharedEditor.putInt("day", dayOfMonth);
        mySharedEditor.putInt("yearrr", year);
        mySharedEditor.putString("zodiacName", myText2.getText().toString());

        mySharedEditor.apply();

        if(monthOfYear == 0) {
            if(dayOfMonth <= 20) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 1) {
            if(dayOfMonth <= 20) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 2) {
            if(dayOfMonth <= 20) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 3) {
            if(dayOfMonth <= 20) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 4) {
            if(dayOfMonth <= 21) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 5) {
            if(dayOfMonth <= 21) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 6) {
            if(dayOfMonth <= 22) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 7) {
            if(dayOfMonth <= 22) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 8) {
            if(dayOfMonth <= 22) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 9) {
            if(dayOfMonth <= 23) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 10) {
            if(dayOfMonth <= 22) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear + 1]);
                myImage.setImageResource(zodiacSymbols[monthOfYear + 1]);
            }
        }

        if(monthOfYear == 11) {
            if(dayOfMonth <= 21) {
                myText2.setText(names[monthOfYear]);
                myImage.setImageResource(zodiacSymbols[monthOfYear]);
            }
            else {
                myText2.setText(names[monthOfYear - 11]);
                myImage.setImageResource(zodiacSymbols[monthOfYear - 11]);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId = item.getItemId();

        if(menuId == R.id.menuAbout) {
            Intent intent = new Intent(this, aboutActivity.class);
            startActivity(intent);
        }

        if(menuId == R.id.settings) {
            Intent intent = new Intent(this, settingsActivity.class);
            startActivityForResult(intent, 333);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 333) {
            String message = data.getStringExtra("color");
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

            View myView = findViewById(R.id.mainAct);

            if(message.equals("blue")) {
                myView.setBackgroundColor(Color.BLUE);
            }

            if(message.equals("red")) {
                myView.setBackgroundColor(Color.RED);
//                myView.setBackgroundResource(R.id.);
            }

            if(message.equals("yellow")) {
                myView.setBackgroundColor(Color.YELLOW);
            }


        }
    }

    public void myClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String message = "";

        if(myDate.getMonth() == 0) {
            if(myDate.getDayOfMonth() <= 20) {
                message = names[myDate.getMonth()];
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.horoskopy.com"));
                startActivity(browserIntent);
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 1) {
            if(myDate.getDayOfMonth() <= 20) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 2) {
            if(myDate.getDayOfMonth() <= 20) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 3) {
            if(myDate.getDayOfMonth() <= 20) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 4) {
            if(myDate.getDayOfMonth() <= 21) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 5) {
            if(myDate.getDayOfMonth() <= 21) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 6) {
            if(myDate.getDayOfMonth() <= 22) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 7) {
            if(myDate.getDayOfMonth() <= 22) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 8) {
            if(myDate.getDayOfMonth() <= 22) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 9) {
            if(myDate.getDayOfMonth() <= 23) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 10) {
            if(myDate.getDayOfMonth() <= 22) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() + 1];
            }
        }

        if(myDate.getMonth() == 11) {
            if(myDate.getDayOfMonth() <= 21) {
                message = names[myDate.getMonth()];
            } else {
                message = names[myDate.getMonth() - 11];
            }
        }

        intent.putExtra("mesic", message);
        startActivity(intent);
    }
}
