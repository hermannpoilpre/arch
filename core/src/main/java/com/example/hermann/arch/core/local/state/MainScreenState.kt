package com.example.hermann.arch.core.local.state

sealed class MainScreenState {
    object Loading: MainScreenState()
    object Data: MainScreenState()
    object NoData: MainScreenState()
    object Error: MainScreenState()
}