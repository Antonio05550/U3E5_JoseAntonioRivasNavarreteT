package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen {
    private Bitmap icono;
    private float x, y;
    private boolean visible;

    public  Imagen(int recurso, int w, int h, float xr,float yr,Lienzo l){
        icono = Bitmap.createScaledBitmap(BitmapFactory.decodeResource( l.getResources(), recurso), w, h, true);
        x=xr;
        y=yr;
        visible=true;
    }
    public void pintar(Canvas c, Paint p){
        if(visible)
            c.drawBitmap( icono,x,y,p);
    }
    public void texto(Canvas c, Paint p, String txt,int tam, int color){
        p.setTextSize( tam );
        p.setColor( color );
        c.drawText( txt,x+(icono.getWidth()/3),y+(icono.getHeight()/2),p);
    }
}
