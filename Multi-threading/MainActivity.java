packagecom.example.exno6;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity; 
import android.view.View;
import android.widget.Button; 
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{ ImageView img; 
Button bt1,bt2; 
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
bt1 = (Button)findViewById(R.id.button); 
bt2= (Button) findViewById(R.id.button2);
img = (ImageView)findViewById(R.id.imageView);
bt1.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v)
{
new Thread(new Runnable()
{
@Override 
publicvoidrun()
{
img.post(new Runnable()
{
@Override 
public voidrun()
{}
});
} img.setImageResource(R.drawable.india1);
}
});
}).start();
bt2.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v)
{
new Thread(new Runnable()
{
@Override 
publicvoidrun()
{
img.post(new Runnable()
{
@Override 
public voidrun()
{ img.setImageResource(R.drawable.india2);
}
});
}
}).start();
}
});
} }