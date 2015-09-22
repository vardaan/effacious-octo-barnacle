package appexperiments.base;

import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;
import com.y29.appexperiments.base.BaseApp;

import me.drakeet.library.CrashWoodpecker;

/**
 * Created by krishan on 17/9/15.
 */
public class ExperimentsIntDebugApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashWoodpecker.fly().to(this);
        LeakCanary.install(this);
        Stetho.newInitializerBuilder(this);
    }
}
