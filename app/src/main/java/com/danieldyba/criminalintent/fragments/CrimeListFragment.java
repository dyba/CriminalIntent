package com.danieldyba.criminalintent.fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

import com.danieldyba.criminalintent.models.Crime;
import com.danieldyba.criminalintent.managers.CrimeLab;
import com.danieldyba.criminalintent.R;

import java.util.ArrayList;

/**
 * Created by ddyba on 2/8/15.
 */
public class CrimeListFragment extends ListFragment {

    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}
