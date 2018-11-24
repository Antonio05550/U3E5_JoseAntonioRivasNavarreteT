package mx.edu.ittepic.u3ejercicio5_joseantoniorivasnavarrete;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

    public class Imagen {
        private Bitmap imagen;
        private float x,y;
        private boolean visible;

        public Imagen(int recurso, int w, int h, float px,float py, boolean v, Lienzo l,Lienzo1 l1,Lienzo2 l2){
            if (l==null&&l1!=null)
                imagen = Bitmap.createScaledBitmap( BitmapFactory.decodeResource( l1.getResources(),recurso),w,h,true );
            if (l1==null&&l!=null)
                imagen = Bitmap.createScaledBitmap( BitmapFactory.decodeResource( l.getResources(),recurso),w,h,true );
            if(l1==null&&l==null)
                imagen = Bitmap.createScaledBitmap( BitmapFactory.decodeResource( l2.getResources(),recurso),w,h,true );
            x=px;
            y=py;
            visible=v;
        }
        public void pintar(Canvas c, Paint p){
            if(visible)
                c.drawBitmap( imagen,x,y,p );
        }
        public void texto(Canvas c, Paint p, String txt, int tam, int color, String pos){
            p.setTextSize( tam );
            p.setColor( color );
            p.setTextAlign(Paint.Align.CENTER);
            if (pos=="debajo")
                c.drawText( txt,x+imagen.getWidth()/2,y+imagen.getHeight()+20, p);
            if (pos=="centro")
                c.drawText( txt,x+imagen.getWidth()/2,y+imagen.getHeight()/2, p);
        }
        public boolean enArea(float px, float py) {
            if(!visible) return false;
            if (py >= y && py<=y+imagen.getHeight() && px>=x && px<= (x + imagen.getWidth()))
                return true;
            return false;
        }
        public void moverX(float px) {
            x = px - (imagen.getWidth() / 2);
        }
        public void moverY(float py){
            y = py - (imagen.getWidth() / 2);
        }
        public void mover(float xp, float yp) {
            x = xp - (imagen.getWidth() / 2);
            y = yp - (imagen.getHeight() / 2);
            coalision();
        }
        public void visible(boolean v){
            visible = v;
        }

        public float getX() {
            return x;
        }

        public float getY() { return y; }
        public void coalision(){
            if (Lienzo2.c3.enArea(Lienzo2.t1.x,Lienzo2.t1.y)){
                Lienzo2.t1.visible=false;
                Lienzo2.r3.visible=true;
            }
            if (Lienzo2.c1.enArea(Lienzo2.t2.x,Lienzo2.t2.y)){
                Lienzo2.t2.visible=false;
                Lienzo2.r1.visible=true;
            }
            if (Lienzo2.c2.enArea(Lienzo2.t3.x,Lienzo2.t3.y)){
                Lienzo2.t3.visible=false;
                Lienzo2.r2.visible=true;
            }

        }
    }