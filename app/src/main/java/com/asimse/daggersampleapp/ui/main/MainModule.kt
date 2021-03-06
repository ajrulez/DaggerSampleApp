package com.asimse.daggersampleapp.ui.main

import com.asimse.daggersampleapp.di.diutilis.BaseViewModel
import com.asimse.daggersampleapp.di.diutilis.ViewModelKey
import com.asimse.daggersampleapp.di.scope.FragmentScoped
import com.asimse.daggersampleapp.ui.about.AboutFragment
import com.asimse.daggersampleapp.ui.about.AboutViewModel
import com.asimse.daggersampleapp.ui.home.HomeFragment
import com.asimse.daggersampleapp.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */
@Module
internal abstract class MainModule {

    //ADD ALL FRAGMENTS
    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFragment(): HomeFragment

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun contributeAboutFragment(): AboutFragment

    //ADD ALL VIEW MODELS
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun bindHomeViewModel(viewModel: HomeViewModel): BaseViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AboutViewModel::class)
    internal abstract fun bindAboutViewModel(viewModel: AboutViewModel): BaseViewModel

}

