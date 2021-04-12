package com.example.tvview;

import android.app.Activity;
import android.content.ActivityNotFoundException;

import android.content.Intent;
import android.database.Cursor;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.tvview.model.TVChannel;


public class MainActivity extends Activity {
    private String applink;
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_haystack_link).setOnClickListener(v -> {
            if (applink != null) {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(applink));
                appIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(appIntent);
            }else {
                Toast.makeText(this, "Channel Url is Empty, Please push app in system privileged folder and try again..!!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_tvView).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TVView.class)));

        /*
         *  Calling for fetching calls
         */
        new Thread(this::getChannel).start();
    }

    private void getChannel() {

        try (Cursor cursor = getContentResolver().query(TvContract.Channels.CONTENT_URI, TVChannel.PROJECTION, null, null)) {
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    applink = cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_APP_LINK_INTENT_URI));
                    if (applink != null) {
                        Log.d(TAG, "App Link = " + applink);
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Exception while fetching channels: " + e);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "OnNewIntent");
        handleIntent(intent);
    }

    /*
     * For playing Deep link
     * */
    private void handleIntent(Intent intent) {
        if (intent != null) {
            Uri uri = intent.getData();
            if (uri != null) {
                String link = uri.getQueryParameter("streamUrl");
                if (link != null) {
                    try {
                        Uri url = Uri.parse(link);
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, url);
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

