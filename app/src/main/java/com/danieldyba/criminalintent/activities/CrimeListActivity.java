package com.danieldyba.criminalintent.activities;

import android.support.v4.app.Fragment;

import com.danieldyba.criminalintent.activities.common.SingleFragmentActivity;
import com.danieldyba.criminalintent.fragments.CrimeListFragment;

/**
 * Created by ddyba on 2/8/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
