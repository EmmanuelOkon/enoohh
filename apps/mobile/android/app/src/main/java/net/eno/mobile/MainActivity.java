package app.enoh.mobile;

import android.os.Bundle;

import java.util.ArrayList;

import com.getcapacitor.Plugin;
import com.getcapacitor.BridgeActivity;

import com.getcapacitor.community.twitter.TwitterPlugin;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the bridge
        this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
            // Additional plugins goes here 
            add(TwitterPlugin.class);
        }});
    }
}
