package com.devtau.myappportfolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControls();
    }

    private void initControls() {
        Button btn_popular_movies = (Button) findViewById(R.id.btn_popular_movies);
        Button btn_stock_hawk = (Button) findViewById(R.id.btn_stock_hawk);
        Button btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btn_make_your_app_material = (Button) findViewById(R.id.btn_make_your_app_material);
        Button btn_go_ubiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);

        if(btn_popular_movies != null && btn_stock_hawk != null && btn_build_it_bigger != null
                && btn_make_your_app_material != null && btn_go_ubiquitous != null && btn_capstone != null) {
            btn_popular_movies.setOnClickListener(this);
            btn_stock_hawk.setOnClickListener(this);
            btn_build_it_bigger.setOnClickListener(this);
            btn_make_your_app_material.setOnClickListener(this);
            btn_go_ubiquitous.setOnClickListener(this);
            btn_capstone.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        String msg;
        Resources res = getResources();
        boolean error = false;
        switch (view.getId()) {
            case R.id.btn_popular_movies:
                msg = res.getString(R.string.popular_movies);
                break;
            case R.id.btn_stock_hawk:
                msg = res.getString(R.string.stock_hawk);
                break;
            case R.id.btn_build_it_bigger:
                msg = res.getString(R.string.build_it_bigger);
                break;
            case R.id.btn_make_your_app_material:
                msg = res.getString(R.string.make_your_app_material);
                break;
            case R.id.btn_go_ubiquitous:
                msg = res.getString(R.string.go_ubiquitous);
                break;
            case R.id.btn_capstone:
                msg = res.getString(R.string.capstone);
                break;
            default:
                msg = res.getString(R.string.button_id_error);
                error = true;
        }
        if(!error) {
            Locale locale = res.getConfiguration().locale;
            msg = String.format(locale, res.getString(R.string.msg_formatter), msg);
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
