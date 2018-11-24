package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    MediaPlayer a1,a2,a3,a4,a5,a6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( new Lienzo1( this ));
    }
    public void ac1(){
        a1=MediaPlayer.create(this, R.raw.color1);
        a1.start();
    }
    public void ac2(){
        a2=MediaPlayer.create(this, R.raw.color2);
        a2.start();
    }
    public void ac3(){
        a3=MediaPlayer.create(this, R.raw.color3);
        a3.start();
    }
    public void ac4(){
        a4=MediaPlayer.create(this, R.raw.color4);
        a4.start();
    }
    public void ac5(){
        a5=MediaPlayer.create(this, R.raw.color5);
        a5.start();
    }
    public void ac6(){
        a6=MediaPlayer.create(this, R.raw.color6);
        a6.start();
    }

}
