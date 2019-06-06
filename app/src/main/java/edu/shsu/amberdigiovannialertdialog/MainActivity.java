package edu.shsu.amberdigiovannialertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("This class is fun!");
        builder.setTitle("HCI Class...");
        builder.setIcon(R.drawable.androidname );
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener()

        {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked ok",Toast.LENGTH_SHORT).show();
                            }
                        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }



}
