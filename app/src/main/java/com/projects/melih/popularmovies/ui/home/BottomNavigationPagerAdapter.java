package com.projects.melih.popularmovies.ui.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.projects.melih.popularmovies.ui.movielist.favorite.FavoriteMoviesFragment;
import com.projects.melih.popularmovies.ui.movielist.popular.PopularMoviesFragment;
import com.projects.melih.popularmovies.ui.movielist.toprated.TopRatedMoviesFragment;

/**
 * Created by Melih Gültekin on 1.03.2018
 */

class BottomNavigationPagerAdapter extends FragmentStatePagerAdapter {
    static final int BY_POPULAR = 0;
    static final int BY_TOP_RATED = 1;
    static final int BY_FAVORITED = 2;
    static final int TAB_COUNT = 3;

    BottomNavigationPagerAdapter(FragmentManager childFragmentManager) {
        super(childFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case BY_TOP_RATED:
                fragment = TopRatedMoviesFragment.newInstance();
                break;
            case BY_FAVORITED:
                fragment = FavoriteMoviesFragment.newInstance();
                break;
            case BY_POPULAR:
            default:
                fragment = PopularMoviesFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }
}