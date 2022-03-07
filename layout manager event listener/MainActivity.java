package com.example.exno2;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity {
//Defining the Views 
EditText E1,E2; 
Button bt;
Spinner s;
//Data for populating in Spinner
String [] dept_array={"CSE","ECE","IT","Mech","Civil"}; 
String name,reg,dept;
@Override
protected void onCreate(BundlesavedInstanceState){ 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
//Referring the Views
E1= (EditText) findViewById(R.id.editText);
E2= (EditText) findViewById(R.id.editText2); 
bt= (Button) findViewById(R.id.button);
s= (Spinner) findViewById(R.id.spinner);
//Creating Adapter for Spinner for adapting the data from array to Spinner
ArrayAdapter adapter=new
ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array); 
s.setAdapter(adapter);
//Creating Listener for Button 
bt.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
//Getting the Values from Views(Edittext& Spinner) 
name=E1.getText().toString(); 
reg=e2.getText().toString(); 
dept=s.getSelectedItem().toString();
//Intent For Navigating to Second Activity
Intent i = new Intent(MainActivity.this,SecondActivity.class);
//For Passing theValues to Second Activity 
i.putExtra("name_key", name); 
i.putExtra("reg_key",reg); 
i.putExtra("dept_key", dept);
startActivity(i);
}
});
} }