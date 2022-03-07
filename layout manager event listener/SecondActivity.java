package com.example.exno2;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity { 
TextView t1,t2,t3;
String name,reg,dept; 
@Override
protected void onCreate(BundlesavedInstanceState){ 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_second);
t1= (TextView) findViewById(R.id.textView1); 
t2= (TextView) findViewById(R.id.textView2); 
t3= (TextView) findViewById(R.id.textView3);
//Getting the Intent 
Intenti=getIntent();
//GettingtheValuesfromFirstActivityusingtheIntentreceived 
name=i.getStringExtra("name_key"); 
reg=i.getStringExtra("reg_key"); 
dept=i.getStringExtra("dept_key");
//Setting the Values to Intent 
t1.setText(name); 
t2.setText(reg); 
t3.setText(dept);
} }