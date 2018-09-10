package com.example.hermann.arch.core

import android.app.Application
import com.example.hermann.arch.core.api.Api
import com.example.hermann.arch.core.api.ApiInterface
import com.example.hermann.arch.core.local.data.Data
import com.example.hermann.arch.core.local.data.DataInterface
import com.example.hermann.arch.core.local.state.State
import com.example.hermann.arch.core.local.state.StateInterface
import com.example.hermann.arch.core.trackers.Tracker
import com.example.hermann.arch.core.trackers.TrackerInterface
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton


class App: Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        bind<DataInterface>() with singleton { Data() }
        bind<StateInterface>() with singleton { State() }
        bind<ApiInterface>() with singleton { Api().instance }
        bind<TrackerInterface>() with singleton { Tracker() }
    }

    override fun onCreate() {
        super.onCreate()

        Logger.addLogAdapter(AndroidLogAdapter())


    }
}