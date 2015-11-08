package com.example.yoonhyung.studybuddy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Drive;

import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;
import com.google.android.gms.plus.Plus;

import java.io.OutputStream;

/**
 * Created by Yoonhyung on 11/7/15.
 */
public class MakePostActivity extends Activity {

//public class MakePostActivity extends AppCompatActivity implements
//GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
//
//    GoogleApiClient mGoogleApiClient;
//    MakePostActivity(Context context) {
//        mGoogleApiClient = new GoogleApiClient.Builder(context)
//                .addApi(Drive.API)
//                .addScope(Drive.SCOPE_FILE)
//                .addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks) context)
//                .addOnConnectionFailedListener(this)
//                .build();
//    }
//
//    @Override
//    public void onConnected(Bundle bundle) {
//    }
//
//    @Override
//    public void onConnectionFailed(ConnectionResult connectionResult) {
//    }
//
//    @Override
//    public void onConnectionSuspended(int i) {
//    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_makepost);
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        mGoogleApiClient.connect();
//    }

    public void createStudyRoom(View v) {
        System.out.print("IM PRINTINGGGGGG");
    }

}


