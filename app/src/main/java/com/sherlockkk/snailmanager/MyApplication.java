package com.sherlockkk.snailmanager;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

/**
 * @author SongJian
 * @created 16/3/22
 * @e-mail 1129574214@qq.com
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Leancloud初始化
        AVObject.registerSubclass(Goods.class);
        AVOSCloud.initialize(this, Constants.LEANCLOUD_ID, Constants.LEANCLOUD_KEY);
    }
}
