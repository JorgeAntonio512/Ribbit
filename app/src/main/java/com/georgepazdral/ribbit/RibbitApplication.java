package com.georgepazdral.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by georgepazdral on 8/7/15.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "JvgWRRsbFsuAsKFJVqmSaI2S98DCnQoIDH4tfF6I", "ugfbedjmmAThUNv4Iy1Yi2S2cSszTuR9g7IK2yPB");

    }
}
