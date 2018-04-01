package com.inc.mountzoft.googleplayclone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Home_Fragnment();
            case 1:
                return new Games_Fragnment();
            case 2:
                return new Movies_Fragnment();
            case 3:
                return new Books_Fragnment();
            case 4:
                return new Newsstand_Fragnment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            //
            //Your tab titles
            //
            case 0:return " HOME ";
            case 1:return " GAMES ";
            case 2: return " MOVIES ";
            case 3: return " BOOKS ";
            case 4: return " NEWSSTAND ";
            default:return null;
        }
    }
}
