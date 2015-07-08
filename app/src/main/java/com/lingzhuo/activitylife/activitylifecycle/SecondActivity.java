package com.lingzhuo.activitylife.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("ACTIVITY_LIFE_CYCLE2", "onStart");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY_LIFE_CYCLE2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY_LIFE_CYCLE2","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY_LIFE_CYCLE2","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY_LIFE_CYCLE2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY_LIFE_CYCLE2","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY_LIFE_CYCLE2","onRestart");
    }


}
