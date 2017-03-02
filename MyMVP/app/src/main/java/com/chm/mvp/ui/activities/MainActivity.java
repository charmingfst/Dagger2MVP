package com.chm.mvp.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.chm.mvp.R;
import com.chm.mvp.dagger.DaggerInjector;
import com.chm.mvp.presenters.MainPresenter;
import com.chm.mvp.ui.screen_contracts.MainScreen;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainScreen {


    @BindView(R.id.show_posts_button)
    Button showPostsButton;


    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerInjector.get().inject(this);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.show_posts_button)
    public void onListSampleButtonClick() {
        mainPresenter.OnShowPostsButtonClick(this);
    }

    @OnClick(R.id.show_test_button)
    public void onTestButtonClick() {
        mainPresenter.OnShowTestButtonClick(this);
    }

    @Override
    public void launchPostsActivity() {
        Intent intent = new Intent(this, PostsActivity.class);
        startActivity(intent);
        Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
    }

    @Override
    public void launchTestActivity() {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }
}
