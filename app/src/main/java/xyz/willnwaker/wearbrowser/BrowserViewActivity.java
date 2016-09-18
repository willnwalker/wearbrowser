package xyz.willnwaker.wearbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;

import org.xwalk.core.XWalkView;

/**
 * Created by William on 2/15/2016.
 */
public class BrowserViewActivity extends WearableActivity{

    private XWalkView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_view);
        setAmbientEnabled();

        webview = (XWalkView) findViewById(R.id.webview);
        Intent i = getIntent();
        Log.i("Loaded URL:", i.getStringExtra("URL"));
        String s=i.getStringExtra("URL");
        /*if (!i.getStringExtra("URL").contains("www")){
            s="www"+s;
        }*/
        if (!i.getStringExtra("URL").contains("http")){
            s="http://"+s;
        }
        webview.load(s,"");

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
}
