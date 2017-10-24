package ca.jfmcode.pass_note.Systeme;

import android.content.Context;
import android.content.Intent;

import ca.jfmcode.pass_note.Activity.CreateLockActivity;
import ca.jfmcode.pass_note.Object.OnConfigFinished;

/**
 * Created by ONi on 23/10/2017.
 */

public class PassNoteConfig {

    private String UID;
    private boolean firstLaunch = true;

    //region PassNoteConfig singleton method
    private static final PassNoteConfig ourInstance = new PassNoteConfig();

    public static PassNoteConfig getInstance() {
        return ourInstance;
    }

    private PassNoteConfig() {
    }
    //endregion

    public void init(Context context, OnConfigFinished onConfigFinished){

        //TODO: Check for config files. If found, firstLaunch = false.

        if(firstLaunch){
            context.startActivity(new Intent(context, CreateLockActivity.class));
        }

        onConfigFinished.finished();
    }
}
