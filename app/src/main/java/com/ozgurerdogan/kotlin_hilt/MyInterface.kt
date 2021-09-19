package com.ozgurerdogan.kotlin_hilt


import com.google.gson.Gson

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction():String
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor):MyInterface
}

 */

@InstallIn(SingletonComponent::class)
@Module
class MyModule{

    @FirstImplementer
    @Singleton
    @Provides
    fun providersFunction():MyInterface{
        return InterfaceImplementor()
    }

    @SecondImplementer
    @Singleton
    @Provides
    fun secondProviders():MyInterface{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProviders():Gson{
        return Gson()
    }
}

@Qualifier
@Retention (AnnotationRetention.BINARY)
annotation class FirstImplementer

@Qualifier
@Retention (AnnotationRetention.BINARY)
annotation class SecondImplementer