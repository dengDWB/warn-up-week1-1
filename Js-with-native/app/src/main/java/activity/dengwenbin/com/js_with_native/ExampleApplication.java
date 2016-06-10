package activity.dengwenbin.com.js_with_native;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by 40284 on 2016/6/8.
 */
public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
