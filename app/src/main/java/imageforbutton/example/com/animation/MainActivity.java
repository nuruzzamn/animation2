package imageforbutton.example.com.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void  fade(View view){

        ImageView start= (ImageView) findViewById(R.id.imageView);
        //start.animate().alpha(0).setDuration(4000);
        //start.animate().translationY(1500f).setDuration(4000);
        //start.animate().translationX(-1500f).setDuration(3000);
        //start.animate().rotation(360).setDuration(3000);
       // start.animate().scaleX(-.4f).scaleY(-.4f).setDuration(3000);
       start.animate().scaleY(.15f).scaleX(.20f).alpha(0)
.setDuration(3000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
