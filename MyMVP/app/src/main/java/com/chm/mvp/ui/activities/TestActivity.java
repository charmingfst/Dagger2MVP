package com.chm.mvp.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.chm.mvp.R;
import com.chm.mvp.dagger.DaggerInjector;
import com.chm.mvp.dagger.modules.TestModule;
import com.chm.mvp.presenters.TestPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ason on 2017/3/1.
 */
public class TestActivity extends Activity {

    @Inject
    TestPresenter testPresenter;
    @BindView(R.id.show_info_button)
    Button showInfoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        DaggerInjector.get().addSub(new TestModule()).inject(this);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.show_info_button)
    public void onBtnClickListener()
    {
        String info = testPresenter.supplyData();
        Toast.makeText(this, info, Toast.LENGTH_LONG).show();
    }
}