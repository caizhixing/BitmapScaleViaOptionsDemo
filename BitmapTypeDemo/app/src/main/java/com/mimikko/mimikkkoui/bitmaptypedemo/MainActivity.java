package com.mimikko.mimikkkoui.bitmaptypedemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ImageView mImageView1,mImageView2,mImageView3,mImageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView1 = findViewById(R.id.pic1);
        mImageView2 = findViewById(R.id.pic2);
        mImageView3 = findViewById(R.id.pic3);
        mImageView4 = findViewById(R.id.pic4);

        Log.d(TAG,"getDisplayMetrics().densityDpi = "+getResources().getDisplayMetrics().densityDpi);
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inDensity = getResources().getDisplayMetrics().densityDpi;
        o.inTargetDensity = getResources().getDisplayMetrics().densityDpi;
        Log.d(TAG,"inDensity                      = "+o.inDensity);
        Log.d(TAG,"inScreenDensity                = "+o.inScreenDensity);
        Log.d(TAG,"inTargetDensity                = "+o.inTargetDensity);

//        o.inScreenDensity = getResources().getDisplayMetrics().densityDpi;
        Bitmap b1 = BitmapFactory.decodeResource(getResources(),R.drawable.pic_ldpi,o);
//        Bitmap b1 = BitmapFactory.decodeResource(getResources(),R.drawable.pic_ldpi);
        Log.d(TAG,"getByteCount()                 = "+b1.getByteCount());
        Log.d(TAG,"getAllocationByteCount()       = "+b1.getAllocationByteCount());
        Log.d(TAG,"getWidth()                     = "+b1.getWidth());
        Log.d(TAG,"getHeight()                    = "+b1.getHeight());
        Log.d(TAG,"getDensity()                   = "+b1.getDensity());
        mImageView1.setImageBitmap(b1);

        Bitmap b2 = BitmapFactory.decodeResource(getResources(),R.drawable.pic_hdpi);
        Log.d(TAG,"getByteCount()                 = "+b2.getByteCount());
        Log.d(TAG,"getAllocationByteCount()       = "+b2.getAllocationByteCount());
        Log.d(TAG,"getWidth()                     = "+b2.getWidth());
        Log.d(TAG,"getHeight()                    = "+b2.getHeight());
        Log.d(TAG,"getDensity()                   = "+b2.getDensity());
        mImageView2.setImageBitmap(b2);


        Bitmap b3 = BitmapFactory.decodeResource(getResources(),R.drawable.pic_xxhdpi);
        Log.d(TAG,"getByteCount()                 = "+b3.getByteCount());
        Log.d(TAG,"getAllocationByteCount()       = "+b3.getAllocationByteCount());
        Log.d(TAG,"getWidth()                     = "+b3.getWidth());
        Log.d(TAG,"getHeight()                    = "+b3.getHeight());
        Log.d(TAG,"getDensity()                   = "+b3.getDensity());
        mImageView3.setImageBitmap(b3);

        Bitmap b4 = BitmapFactory.decodeResource(getResources(),R.drawable.pic_xxxhdpi);
        Log.d(TAG,"getByteCount()                 = "+b4.getByteCount());
        Log.d(TAG,"getAllocationByteCount()       = "+b4.getAllocationByteCount());
        Log.d(TAG,"getWidth()                     = "+b4.getWidth());
        Log.d(TAG,"getHeight()                    = "+b4.getHeight());
        Log.d(TAG,"getDensity()                   = "+b4.getDensity());
        mImageView4.setImageBitmap(b4);
    }
}
