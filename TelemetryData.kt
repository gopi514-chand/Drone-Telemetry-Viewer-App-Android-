package com.example.myapplication.domain.model

data class TelemetryData(
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val relativeAltitudeMeters: Float = 0.0f,
    val batteryRemainingPercent: Float = 0.0f,
    val flightMode: String = "Unknown",
    val isArmed: Boolean = false,
    val isConnected: Boolean = false
)
