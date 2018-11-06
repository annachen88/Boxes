package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view) {
        EditText length =findViewById(R.id.length);
        EditText width=findViewById(R.id.width);
        EditText height =findViewById(R.id.height);
        Float l = Float.parseFloat(length.getText().toString());
        Float w = Float.parseFloat(width.getText().toString());
        Float h = Float.parseFloat(height.getText().toString());
        if(l>23||w>14||h>13){
            Intent intent1 = new Intent(this,Box5.class);
            startActivity(intent1);
        }else{
            Intent intent2 = new Intent(this,Box3.class);
            startActivity(intent2);
        }

    }
}
