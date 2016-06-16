package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.extras;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Util {

    public static final String REMOTE_HOST = "https://apac.universal-api.pp.travelport.com/B2BGateway/connect/uAPI/";
    public static final String USERNAME = "Universal API/uAPI7302447052-5b2dcf79";
    public static final String PASSWORD = "YECFJMesp2cbHkBfxsMXzwrEg";

    public static void logger(String message){
        Log.e("Jony",message);
    }
    public static void toaster(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
