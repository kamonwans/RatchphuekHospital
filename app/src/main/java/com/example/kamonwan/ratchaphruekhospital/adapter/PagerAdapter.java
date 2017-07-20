package com.example.kamonwan.ratchaphruekhospital.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kamonwan.ratchaphruekhospital.model.OneFragment;
import com.example.kamonwan.ratchaphruekhospital.model.ThreeFragment;
import com.example.kamonwan.ratchaphruekhospital.model.TwoFragment;

/**
 * Created by kamonwan on 7/19/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OneFragment();
        } else if (position == 1) {
            return new TwoFragment();
        } else if (position == 2) {
            return new ThreeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
