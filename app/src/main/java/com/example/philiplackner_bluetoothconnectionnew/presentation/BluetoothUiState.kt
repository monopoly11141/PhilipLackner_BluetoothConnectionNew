package com.example.philiplackner_bluetoothconnectionnew.presentation

import com.example.philiplackner_bluetoothconnectionnew.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)