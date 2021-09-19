package com.ozgurerdogan.kotlin_hilt

import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import retrofit2.http.Field
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@ActivityScoped
class Musicians
    @Inject
    constructor(instrument: Instrument,band: Band) {
    fun sing(){
        println("sing active..")
    }
}