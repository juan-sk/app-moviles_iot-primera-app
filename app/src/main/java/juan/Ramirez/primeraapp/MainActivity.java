package juan.Ramirez.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "juan.Ramirez.primerapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Log.i("mainActivity","se presiono el boton");
        this.createIntent(view);
        Log.i("mainActivity","se termono el intent");
    }

    public void createIntent(View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}