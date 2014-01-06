import android.app.Activity;
import android.os.Bundle;
import android.view.View
import android.widget.TextView

class HelloWorld extends Activity{
 public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("hello,world!");
        setContentView(tv);
        Toast.makeText("what is this").show();
		System.out.println("whatever");
 }  

}
