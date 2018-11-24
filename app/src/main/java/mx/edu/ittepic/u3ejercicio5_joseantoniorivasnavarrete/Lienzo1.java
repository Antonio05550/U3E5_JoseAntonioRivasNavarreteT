package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;


public class Lienzo1 extends View {
    Main2Activity puntero;
    Imagen c1,c2,c3,c4,c5,c6;
    public Lienzo1(Context context){
        super(context);
        puntero=(Main2Activity) context;
        c1 = new Imagen( R.drawable.color1,300,300,40,35,true,null,this,null );
        c2 = new Imagen( R.drawable.color2,300,300,40,435,true,null,this,null);
        c3 = new Imagen( R.drawable.color3,300,300,40,835,true,null,this,null);
        c4 = new Imagen( R.drawable.color4,300,300,380,35,true,null,this,null );
        c5 = new Imagen( R.drawable.color5,300,300,380,435,true,null,this,null );
        c6 = new Imagen( R.drawable.color6,300,300,380,835,true,null,this,null);
    }
    @Override
    public void onDraw(Canvas c){
        Paint p = new Paint();
        c1.pintar( c,p );
        c2.pintar( c,p );
        c3.pintar( c,p );
        c4.pintar( c,p );
        c5.pintar( c,p );
        c6.pintar( c,p );
    }
    public boolean onTouchEvent(MotionEvent e){
        float px=e.getX();
        float py=e.getY();
        switch (e.getAction()){
            case MotionEvent.ACTION_DOWN:
                if(c1.enArea( px,py ))
                    puntero.ac1();
                if(c2.enArea( px,py ))
                    puntero.ac2();
                if(c3.enArea( px,py ))
                    puntero.ac3();
                if(c4.enArea( px,py ))
                    puntero.ac4();
                if(c5.enArea( px,py ))
                    puntero.ac5();
                if(c6.enArea( px,py ))
                    puntero.ac6();
                break;
        }
        return true;
    }

}
