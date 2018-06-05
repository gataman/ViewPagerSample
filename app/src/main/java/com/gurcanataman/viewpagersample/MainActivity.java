package com.gurcanataman.viewpagersample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gurcanataman.viewpagersample.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> fragmentTitleList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        setViewPager();
    }

    private void setViewPager() {
        
        fragmentList = getFragmentList();
        fragmentTitleList = getFragmentTitleList();

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList, fragmentTitleList);
        //Eğer Fragment içinde çalıştıracaksan:
        //viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), fragmentList, fragmentTitleList);

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.i("FRAGMENT POSİZYONU",""+position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });




    }



    private List<Fragment> getFragmentList() {
        List<Fragment> fragmentList = new ArrayList<>();
        Fragment1 fragment1 = new Fragment1();

        Fragment2 fragment2 = new Fragment2();

        Fragment3 fragment3 = new Fragment3();

        Fragment4 fragment4 = new Fragment4();

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);
        fragmentList.add(fragment3);
        fragmentList.add(fragment4);

        return fragmentList;

    }

    private List<String> getFragmentTitleList() {
        List<String> titleList = new ArrayList<>();
        titleList.add("title1");
        titleList.add("title2");
        titleList.add("title3");
        titleList.add("title4");

        return titleList;
    }


}
