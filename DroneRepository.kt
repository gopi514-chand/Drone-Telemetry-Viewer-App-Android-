package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.TelemetryData
import kotlinx.coroutines.flow.Flow

interface DroneRepository {
    val telemetry: Flow<TelemetryData>
    val connectionStatus: Flow<Boolean>
    
    suspend fun connect(connectionUrl: String)
    suspend fun disconnect()
    
    suspend fun arm()
    suspend fun disarm()
    suspend fun takeoff()
    suspend fun returnToLaunch()
}
