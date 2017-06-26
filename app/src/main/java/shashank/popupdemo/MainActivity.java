package shashank.popupdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ia=(CheckBox)findViewById(R.id.ia);
        ia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    AlertDialog.Builder hemanth=new
                            AlertDialog.Builder(MainActivity.this);
                    hemanth.setTitle("Error.....").setIcon(android.R.drawable.ic_menu_call)
                            .setMessage("This is meesadasasfd")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this,
                                    "Yes",
                                    Toast.LENGTH_SHORT).show();
                        }
                    })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).setNeutralButton("May Be", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                            .setCancelable(false)
                            .create()
                            .show();




                }
                else
                {

                }
            }
        });
    }
}




