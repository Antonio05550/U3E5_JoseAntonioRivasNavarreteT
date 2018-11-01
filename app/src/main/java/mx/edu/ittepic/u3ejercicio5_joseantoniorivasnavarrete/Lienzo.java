package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {

    Imagen b1,b2,f;

    public Lienzo(Context context) {
        super( context );
        b1 = new Imagen( R.drawable.boton1,300,150,220,200,this );
        b2 = new Imagen( R.drawable.boton2,300,150,220,400,this );
        f = new Imagen( R.drawable.carita, 300,300,220,600,this );
    }

    @Override
    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        p.setTextSize( 45 );
        c.drawText( "Bienvenido/Welcome Color Play",30,100,p);
        b1.pintar( c,p );
        b1.texto( c,p,"Star",40,Color.WHITE);
        b2.pintar( c,p );
        b2.texto( c,p,"Juego",40,Color.WHITE);
        f.pintar( c,p );

    }

    public boolean onTouchEvent(MotionEvent e) {
        return true;
    }
}
