package xyz.willnwaker.wearbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends WearableActivity {

    private EditText urlbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAmbientEnabled();

        urlbox = (EditText) findViewById(R.id.editText);

    }

    @Override
    public void onEnterAmbient(Bundle ambientDetails) {
        super.onEnterAmbient(ambientDetails);
    }

    @Override
    public void onUpdateAmbient() {
        super.onUpdateAmbient();
    }

    @Override
    public void onExitAmbient() {
        super.onExitAmbient();
    }

    public void startBrowser(View v){
        String text = urlbox.getText().toString();
        if (!text.equals("")){
            Intent i = new Intent(this, BrowserViewActivity.class);
            i.putExtra("URL", text);
            Log.i("URL from TextEdit:", urlbox.getText().toString());
            startActivity(i);
        }
    }
}
