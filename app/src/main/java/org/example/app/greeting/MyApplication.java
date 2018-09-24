package org.example.app.greeting;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import static org.example.app.greeting.MyApplication.APP_ROOT;

/**
 * @author arungupta
 */
@ApplicationPath(APP_ROOT)
public class MyApplication extends Application {

    public static final String APP_ROOT = "/resources";
}
