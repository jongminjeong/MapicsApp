package com.example.jong_min.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by jong-min on 2015-08-19.
 */
public class MyAlbum extends Activity {

    final int REQ_CODE_SELECT_IMAGE=100;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
        intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, REQ_CODE_SELECT_IMAGE);



    }


}
