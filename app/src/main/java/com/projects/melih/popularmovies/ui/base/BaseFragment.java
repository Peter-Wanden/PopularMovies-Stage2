package com.projects.melih.popularmovies.ui.base;

import android.content.Context;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.widget.Toast;

/**
 * Created by Melih Gültekin on 17.02.2018
 */

public class BaseFragment extends Fragment {

    protected Context context;
    protected NavigationListener navigationListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        this.navigationListener = (NavigationListener) context;
    }

    protected void showToast(@StringRes int message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    protected void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}