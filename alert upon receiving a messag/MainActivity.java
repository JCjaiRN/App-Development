packagecom.example.exno9;
import android.app.Notification;
import android.app.NotificationManager; 
import android.app.PendingIntent; 
import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity; 
import android.view.View;
import android.widget.Button; 
import android.widget.EditText;
imp0rt androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{
Button notify; 
EditText e; 
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
notify= (Button) findViewById(R.id.button); 
e= (EditText) findViewById(R.id.editText);
notify.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v)
{
Intent intent = new Intent(MainActivity.this, SecondActivity.class);
PendingIntentpending=PendingIntent.getActivity(MainActivity.this,0,intent,0); 
Notification noti = new Notification.Builder(MainActivity.this).setContentTitle("New
Message").setContentText(e.getText().toString()).setSmallIcon(R.mipmap.ic_launcher).setContentIntent(pe 
nding).build();
NotificationManager manager = (NotificationManager) 
getSystemService(NOTIFICATION_SERVICE);
noti.flags |= Notification.FLAG_AUTO_CANCEL; 
manager.notify(0, noti);
}
});
} }