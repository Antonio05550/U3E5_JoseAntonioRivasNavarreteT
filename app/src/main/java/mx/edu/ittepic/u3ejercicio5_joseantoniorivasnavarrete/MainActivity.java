package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo(this));
    }
    public void ventana2(){
        Intent v2 =  new Intent( MainActivity.this, Main2Activity.class);
        startActivity( v2);
    }
    public void ventana3(){
        Intent v3 =  new Intent( MainActivity.this, Main3Activity.class);
        startActivity( v3);
    }
}
