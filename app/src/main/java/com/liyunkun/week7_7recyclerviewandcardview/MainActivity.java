package com.liyunkun.week7_7recyclerviewandcardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRv;
    private List<UserBean> mList;
    private int[] img=new int[]{R.drawable.a,R.drawable.aa,R.drawable.b,R.drawable.bb,R.drawable.c,
    R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRv = ((RecyclerView) findViewById(R.id.rv));
        initData();
        MyAdapter adapter=new MyAdapter(mList,this);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(adapter);
    }

    private void initData() {
        mList=new ArrayList<>();
        for (int i = 0; i < img.length; i++) {
            mList.add(new UserBean("美图"+img[i],img[i]));
        }
    }
}
