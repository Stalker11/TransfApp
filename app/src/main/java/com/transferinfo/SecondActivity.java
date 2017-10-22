package com.transferinfo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

  public static void startAct(Context context){
    Intent intent = new Intent(context, SecondActivity.class);
    context.startActivity(intent);
  }
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
    ButterKnife.bind(this);
  }
  @OnClick(R.id.second_activity)
  public void startNextScreen(){
    ThirdActivity.startAct(this);
  }
}
