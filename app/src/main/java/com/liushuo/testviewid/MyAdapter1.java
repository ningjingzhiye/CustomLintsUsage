package com.liushuo.testviewid;

import android.support.annotation.AnyRes;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * user liushuo
 * date 2017/4/24
 */
public abstract class MyAdapter1 extends RecyclerView.Adapter {

    public MyAdapter1() {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
