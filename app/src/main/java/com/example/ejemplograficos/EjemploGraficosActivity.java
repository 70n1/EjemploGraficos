package com.example.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class EjemploGraficosActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }

    public class EjemploView extends View {
        private Drawable miImagen;

        public EjemploView(Context context) {
            super(context);
            setBackgroundResource(R.drawable.degradado);

        }

        @Override
        protected void onDraw(Canvas canvas) { //Dibujar aquí } }
            Path trazo = new Path();
            trazo.moveTo(50, 100);
            trazo.cubicTo(60, 70, 150, 65, 200, 110);
            trazo.lineTo(300, 200);
            //canvas.drawColor(Color.WHITE);
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(trazo, pincel);
            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Desarrollo de aplicaciones para móviles con Android", trazo, 10, -40, pincel);
            Resources res = getResources();
            miImagen = res.getDrawable(R.drawable.mi_imagen);
            miImagen.setBounds(30, 30, 200, 200);
            miImagen.draw(canvas);
        }
    }
}
