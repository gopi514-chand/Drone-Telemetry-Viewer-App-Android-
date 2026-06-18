# 🚁 Drone Telemetry Viewer App (Android)

An Android application that connects to a **MAVLink telemetry stream** (UDP/TCP) and displays **live drone telemetry data** in real time using modern Android development practices.

---

## 📌 Project Overview

The **Drone Telemetry Viewer App** allows users to connect to a drone or simulator using a MAVLink telemetry stream and monitor essential flight parameters such as GPS location, altitude, battery status, flight mode, and connection state.

This project is designed as a **learning + demonstration project** for:
- Android development
- Real-time data streaming
- MVVM & Clean Architecture
- Jetpack Compose UI

---

## 🎯 Features

### 🔌 Connection Management
- Connect to MAVLink stream via **UDP or TCP**
- Input **IP Address** and **Port**
- Connection status indicators:
  - 🟢 Connected
  - 🔴 Disconnected
  - 🟡 Reconnecting

### 📊 Live Telemetry Dashboard
- Latitude
- Longitude
- Altitude
- Battery Percentage
- Flight Mode
- Armed / Disarmed Status
- Connection Status

> Telemetry updates automatically without screen refresh.

### 🎮 Drone Actions (Simulated)
- Arm
- Disarm
- Takeoff
- Return To Launch (RTL)

> ⚠️ Command execution is simulated locally (can be extended to real MAVSDK commands).

### 🔁 Auto Reconnection
- Detects stream interruption
- Retries connection automatically
- Recovers when telemetry resumes

### 🛡️ Error Handling
- Invalid IP / Port
- Connection timeout
- Null telemetry packets
- Unsupported MAVLink messages
- App never crashes during stream failures

---

## 🛠️ Tech Stack

### Mandatory
- **Kotlin**
- **Android Studio**
- **MVVM Architecture**
- **Coroutines & Flow**
- **Jetpack Compose**

### Preferred / Used
- **Clean Architecture**
- **Hilt (Dependency Injection)**
- **StateFlow**
- **Material 3 UI**
- **MAVLink / MAVSDK (Telemetry parsing)**

---
## 🧱 Architecture
High level architecture
Presentation (UI)
│
├── ViewModel (StateFlow)
│
Domain (Business Logic)
│
├── UseCases
│
Data (Telemetry Source)
│
├── MAVLink Client (UDP / TCP)
├── Repositories

project Structure
com.example.dronetelemetry
│
├── data
│   ├── mavlink
│   │   ├── MavlinkClient.kt
│   │   ├── UdpMavlinkClient.kt
│   │   └── TcpMavlinkClient.kt
│   ├── repository
│   │   └── TelemetryRepositoryImpl.kt
│
├── domain
│   ├── model
│   │   └── TelemetryData.kt
│   ├── repository
│   │   └── TelemetryRepository.kt
│   └── usecase
│       ├── ConnectUseCase.kt
│       ├── ObserveTelemetryUseCase.kt
│       └── DroneActionUseCase.kt
│
├── presentation
│   ├── connection
│   │   ├── ConnectionScreen.kt
│   │   └── ConnectionViewModel.kt
│   ├── dashboard
│   │   ├── DashboardScreen.kt
│   │   └── DashboardViewModel.kt
│
├── di
│   └── AppModule.kt
│
└── MainActivity.kt7
2️⃣ Open in Android Studio
Android Studio Giraffe or newer recommended
Sync Gradle files
3️⃣ Run Telemetry Source

You can use:

Drone hardware
MAVLink simulator (SITL)
Example endpoint:
udp://0.0.0.0:14550

4️⃣ Enter Connection Details
IP Address: 192.168.1.12
Port: 14550
🧪 Testing Scenarios
Valid / Invalid IP & Port
Connection loss & reconnection
Low battery simulation
Null telemetry packets
Unsupported MAVLink messages

🌟 Optional Enhancements (Future Scope)
Google Maps integration
Live drone position on map
Telemetry logging (Room DB)
Offline support
Unit & UI tests
Real MAVSDK command execution
Dark Mode enhancements
🎓 Learning Outcomes

Real-time data streaming in Android
MAVLink telemetry handling
Clean Architecture implementation
Jetpack Compose UI
StateFlow & Coroutines
Network resilience handling
📄 License

This project is open-source and intended for educational purposes.

## 🧱 Architecture
