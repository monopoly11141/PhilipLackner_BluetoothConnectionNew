package com.example.philiplackner_bluetoothconnectionnew.di

import android.content.Context
import com.example.philiplackner_bluetoothconnectionnew.data.chat.AndroidBluetoothController
import com.example.philiplackner_bluetoothconnectionnew.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context) : BluetoothController {
        return AndroidBluetoothController(context)
    }
}