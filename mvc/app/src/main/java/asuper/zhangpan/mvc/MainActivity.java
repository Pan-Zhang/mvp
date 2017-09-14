package asuper.zhangpan.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import asuper.zhangpan.mvc.present.MainPresent;
import asuper.zhangpan.mvc.view.MainInterface;

public class MainActivity extends AppCompatActivity implements MainInterface{

    MainPresent present;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        present = new MainPresent(null);
        present.test();
    }

    @Override
    public void showLoadding() {

    }
}
