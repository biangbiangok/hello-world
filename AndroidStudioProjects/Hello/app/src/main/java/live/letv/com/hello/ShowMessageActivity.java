package live.letv.com.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by wf on 16-3-1.
 */
public class ShowMessageActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //get message
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MSG);

        //show message
        TextView textview = new TextView(this);
        textview.setText(msg);
        textview.setTextSize(40);

        setContentView(textview);



    }

}
