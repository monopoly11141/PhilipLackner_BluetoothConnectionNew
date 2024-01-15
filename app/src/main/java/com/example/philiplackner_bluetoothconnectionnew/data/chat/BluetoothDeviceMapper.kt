package com.example.philiplackner_bluetoothconnectionnew.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.philiplackner_bluetoothconnectionnew.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain() : BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}