package com.example.proyfinalandroid.Fragments.Principal.UploadAudio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.proyfinalandroid.Fragments.Principal.UploadAudio.Dialog.FragmentExternalAudio;
import com.example.proyfinalandroid.Fragments.Principal.UploadAudio.Dialog.FragmentInternalAudio;



public class AdapterAudio extends FragmentPagerAdapter {


    public AdapterAudio(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) return new FragmentInternalAudio();
        else if(position==1)return new FragmentExternalAudio();
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0) return "Interno";
        else if(position==1)return "SD Card";
        return null;
    }
}

