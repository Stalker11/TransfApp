package com.transferinfo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThirdActivity extends AppCompatActivity {
  public static final String TAG = ThirdActivity.class.getSimpleName();
  public static void startAct(Context context) {
    Intent intent = new Intent(context, ThirdActivity.class);
    context.startActivity(intent);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_third);
    ButterKnife.bind(this);
      }
  @OnClick(R.id.third_activity)
  public void startNextScreen(){
    Log.d(TAG, "startNextScreen: ");
    EventBus.getDefault().post(new MessageEvent());
  }
}
