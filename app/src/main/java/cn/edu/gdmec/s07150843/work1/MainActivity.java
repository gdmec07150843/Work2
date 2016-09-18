package cn.edu.gdmec.s07150843.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work1", "onStart方法被执行");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("work1", "onResume方法被执行");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work1", "onPause方法被执行");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work1", "onStop方法被执行");

    }




    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work1", "onRestart方法被执行");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work1", "onDestroy方法被执行");

    }


}
