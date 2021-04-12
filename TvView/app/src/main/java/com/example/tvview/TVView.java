package com.example.tvview;

import android.app.Activity;
import android.media.tv.TvView;
import android.net.Uri;
import android.os.Bundle;

public class TVView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tv_view_layout);

        TvView tvView = findViewById(R.id.tv_View);
        tvView.tune("com.haystack.android/.tv.livechannel.LiveChannelInputService", Uri.parse("content://android.media.tv/channel/16"));

    }
}
