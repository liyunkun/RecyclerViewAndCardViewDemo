package com.liyunkun.week7_7recyclerviewandcardview;

/**
 * Created by liyunkun on 2016/10/9 0009.
 */
public class UserBean {
    private String mUserName;
    private int mUserFace;

    public UserBean() {
    }

    public UserBean(String mUserName, int mUserFace) {
        this.mUserName = mUserName;
        this.mUserFace = mUserFace;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public int getmUserFace() {
        return mUserFace;
    }

    public void setmUserFace(int mUserFace) {
        this.mUserFace = mUserFace;
    }
}
