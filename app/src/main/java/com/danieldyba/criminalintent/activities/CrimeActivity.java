package com.danieldyba.criminalintent.activities;

import android.support.v4.app.Fragment;

import com.danieldyba.criminalintent.activities.common.SingleFragmentActivity;
import com.danieldyba.criminalintent.fragments.CrimeFragment;


public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
