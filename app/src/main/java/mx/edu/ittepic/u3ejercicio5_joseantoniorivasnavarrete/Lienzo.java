package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {

    Imagen b1,b2,f;
    MainActivity puntero;

    public Lienzo(Context context) {
        super( context );
        puntero= (MainActivity) context;
        b1 = new Imagen( R.drawable.boton1,300,150,220,200,true,this,null,null );
        b2 = new Imagen( R.drawable.boton2,300,150,220,400,true,this,null,null );
        f = new Imagen( R.drawable.carita, 300,300,220,600,true,this,null,null );
    }

    @Override
    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        p.setTextSize( 45 );
        p.setColor( Color.parseColor( "#707070" ) );
        c.drawText( "Bienvenido/Welcome Color Play",30,100,p);
        b1.pintar( c,p );
        b1.texto( c,p,"Star",40,Color.WHITE,"centro");
        b2.pintar( c,p );
        b2.texto( c,p,"Play",40,Color.WHITE,"centro");
        f.pintar( c,p );
    }

    public boolean onTouchEvent(MotionEvent e) {
        float px=e.getX();
        float py=e.getY();
        switch (e.getAction()){
            case MotionEvent.ACTION_DOWN:
                if(b1.enArea(px,py))
                    puntero.ventana2();
                if(b2.enArea(px,py))
                    puntero.ventana3();
                break;
        }
        return true;
    }
}
