package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo2 extends View {
    Main3Activity puntero;
    static Imagen c1,c2,c3,t1,t2,t3,r1,r2,r3;
    public Lienzo2(Context context){
        super(context);
        puntero=(Main3Activity) context;
        c1 = new Imagen( R.drawable.color1,300,300,40,35,true,null,null,this);
        c2 = new Imagen( R.drawable.color2,300,300,40,435,true,null,null,this);
        c3 = new Imagen( R.drawable.color3,300,300,40,835,true,null,null,this);
        t1 = new Imagen( R.drawable.t1,150,50,380,155,true,null,null,this);
        t2 = new Imagen( R.drawable.t2,150,50,380,555,true,null,null,this);
        t3 = new Imagen( R.drawable.t3,150,50,380,955,true,null,null,this);
        r1 = new Imagen( R.drawable.c,60,60,620,160,false,null,null,this);
        r2 = new Imagen( R.drawable.c,60,60,620,560,false,null,null,this);
        r3 = new Imagen( R.drawable.c,60,60,620,960,false,null,null,this);
    }

    @Override
    protected void onDraw(Canvas c) {
        super.onDraw( c );
        Paint p = new Paint();

        c1.pintar( c,p );
        c2.pintar( c,p );
        c3.pintar( c,p );
        t1.pintar( c,p );
        t2.pintar( c,p );
        t3.pintar( c,p );
        r1.pintar( c,p );
        r2.pintar( c,p );
        r3.pintar( c,p );

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        float px=e.getX();
        float py=e.getY();
        switch (e.getAction()){
            case MotionEvent.ACTION_MOVE:
                if(t1.enArea( px,py ))
                    t1.mover( px,py );
                if(t2.enArea( px,py ))
                    t2.mover( px,py );
                if(t3.enArea( px,py ))
                    t3.mover( px,py );
        }
        invalidate();
        return true;
    }
}
