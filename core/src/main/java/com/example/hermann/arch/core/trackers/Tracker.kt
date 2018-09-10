package com.example.hermann.arch.core.trackers

import com.orhanobut.logger.Logger

class Tracker: TrackerInterface {

    override fun track(tag: Int) {
        Logger.d("hello")
    }
}