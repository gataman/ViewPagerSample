package com.gurcanataman.viewpagersample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by gurcanataman on 5.06.2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> fragmentTitleList;
    public ViewPagerAdapter(FragmentManager fm, List<Fragment> fragmentList,List<String> fragmentTitleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.fragmentTitleList = fragmentTitleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

}
