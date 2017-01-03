package com.example.liang.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView testview=null;

    private Button KeyBoardButton;
    private KeyBoard KerBoardlib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        KeyBoardButton=(Button)findViewById(R.id.KeyBoard);
        KeyBoardButton.setOnClickListener(this);
        KerBoardlib=new KeyBoard();
        testview=(TextView)findViewById(R.id.TextView1) ;
        testview.setText("MAIN");
    }



    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event){
        switch(keyCode){
            case KeyEvent.KEYCODE_0:
                testview.setText("按下按键0");
                break;
            case KeyEvent.KEYCODE_1:
                testview.setText("按下按键1");
                break;
            case KeyEvent.KEYCODE_2:
                testview.setText("按下按键2");
                break;
            case KeyEvent.KEYCODE_3:
                testview.setText("按下按键3");
                break;
            case KeyEvent.KEYCODE_4:
                testview.setText("按下按键4");
                break;
            case KeyEvent.KEYCODE_5:
                testview.setText("按下按键5");
                break;
            case KeyEvent.KEYCODE_6:
                testview.setText("按下按键6");
                break;
            case KeyEvent.KEYCODE_7:
                testview.setText("按下按键7");
                break;
            case KeyEvent.KEYCODE_8:
                testview.setText("按下按键8");
                break;
            case KeyEvent.KEYCODE_9:
                testview.setText("按下按键9");
                break;
            case KeyEvent.KEYCODE_DEL:
                testview.setText("按下按键*");
                break;
            case KeyEvent.KEYCODE_ENTER:
                testview.setText("按下按键#");
                break;
            default:
                testview.setText("无法识别输入");
                break;

        }

        return super.onKeyDown(keyCode, event);
    }
    /*释放按键事件*/
    @Override
    public boolean onKeyUp(int keyCode,KeyEvent event){
        switch(keyCode){
            case KeyEvent.KEYCODE_0:
                testview.setText("放开按键0");
                break;
            case KeyEvent.KEYCODE_1:
                testview.setText("放开按键1");
                break;
            case KeyEvent.KEYCODE_2:
                testview.setText("放开按键2");
                break;
            case KeyEvent.KEYCODE_3:
                testview.setText("放开按键3");
                break;
            case KeyEvent.KEYCODE_4:
                testview.setText("放开按键4");
                break;
            case KeyEvent.KEYCODE_5:
                testview.setText("放开按键5");
                break;
            case KeyEvent.KEYCODE_6:
                testview.setText("放开按键6");
                break;
            case KeyEvent.KEYCODE_7:
                testview.setText("放开按键7");
                break;
            case KeyEvent.KEYCODE_8:
                testview.setText("放开按键8");
                break;
            case KeyEvent.KEYCODE_9:
                testview.setText("放开按键9");
                break;
            case KeyEvent.KEYCODE_DEL:
                testview.setText("放开按键*");
                break;
            case KeyEvent.KEYCODE_ENTER:

                testview.setText("放开按键#");
                break;
            default:
                testview.setText("无法识别输入");
                break;
        }

        return super.onKeyUp(keyCode, event);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.KeyBoard:
                KerBoardlib.Start_KeyBoard();
                break;
            default:
                break;
        }

    }

}
