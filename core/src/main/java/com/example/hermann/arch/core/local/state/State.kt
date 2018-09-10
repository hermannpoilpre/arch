package com.example.hermann.arch.core.local.state

class State: StateInterface {

    override val router: RouterInterface = Router()
    override val mainScreenState: MainScreenState = MainScreenState.Loading
}