package com.example.ejemplograficos;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by motoni on 09/10/2016.
 */

public class EjemploView extends View {
    //private Drawable miImagen;
    private ShapeDrawable miImagen;


    public EjemploView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.degradado);
        miImagen = new ShapeDrawable(new OvalShape());
        miImagen.getPaint().setColor(0xff0000ff);
        miImagen.setBounds(10, 10, 310, 60);

    }

    @Override
    protected void onSizeChanged(int ancho, int alto, int ancho_anterior, int alto_anterior) {
        miImagen.setBounds(0, 0, ancho, alto);
    }

    @Override
    protected void onDraw(Canvas canvas) { //Dibujar aquí } }
        /*Path trazo = new Path();
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
        Resources res = getResources();*/
        miImagen.draw(canvas);
        // miImagen = res.getDrawable(R.drawable.mi_imagen);
        //miImagen.setBounds(30, 30, 200, 200);
        //miImagen.draw(canvas);
    }
}
