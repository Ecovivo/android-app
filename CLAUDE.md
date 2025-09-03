# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Ecovivo is an Android application built with Kotlin and Jetpack Compose for solar project management and calculations. The app uses a modern Android architecture with Hilt dependency injection, Room database, and Navigation Compose.

## Build Commands

### Development
- **Build project**: `./gradlew build` or `gradlew.bat build` (Windows)
- **Run debug build**: `./gradlew assembleDebug` or `gradlew.bat assembleDebug`
- **Run release build**: `./gradlew assembleRelease` or `gradlew.bat assembleRelease`
- **Clean build**: `./gradlew clean` or `gradlew.bat clean`

### Testing
- **Run unit tests**: `./gradlew testDebugUnitTest` or `gradlew.bat testDebugUnitTest`
- **Run instrumented tests**: `./gradlew connectedAndroidTest` or `gradlew.bat connectedAndroidTest`

## Architecture

### Navigation Flow
The app uses Navigation Compose with a centralized Routes system:
- **Intro Screen**: Entry point of the app
- **List Screen**: Shows project listings 
- **Projects Screen**: Displays project types with name parameter
- **Area/Demand/Budget/Adapted Screens**: Feature-specific screens with name parameters

### Data Layer
- **Room Database**: `SolarDatabase` with `SolarProjectEntity` and `SolarProjectDao`
- **Repository Pattern**: `SolarProjectRepository` manages data operations
- **Hilt DI**: Dependency injection configured in `data/di/DatabaseModule.kt`

### UI Architecture
- **Jetpack Compose**: Modern declarative UI toolkit
- **Material Design 3**: UI components and theming
- **Custom Theme**: Located in `ui/theme/` with custom colors, typography, and theming
- **Reusable Components**: Common UI components in `ui/components/`

### Project Structure
```
app/src/main/java/com/example/ecovivo/
├── data/                     # Data layer (database, repository, DI)
├── features/                 # Feature modules (screens and ViewModels)
│   ├── intro/               # Introduction flow
│   ├── list/                # Project listings
│   ├── projects/            # Project management
│   ├── area/                # Area calculations
│   ├── budget/              # Budget calculations
│   ├── demand/              # Demand calculations
│   └── adapted/             # Adapted calculations
├── models/                  # Data models
├── navigation/              # Navigation configuration
└── ui/                      # UI components and theming
    ├── components/          # Reusable UI components
    └── theme/               # App theming
```

## Key Technologies
- **Kotlin**: Primary language
- **Jetpack Compose**: UI toolkit
- **Hilt**: Dependency injection
- **Room**: Local database
- **Navigation Compose**: Navigation framework
- **Material Design 3**: UI design system

## Development Notes
- The app entry point is `MainActivity.kt` with `SolarApp` as the Application class
- All screens follow the pattern of receiving a `NavController` and optional parameters
- The database uses Room with entities, DAOs, and repositories
- UI components are organized by feature and shared components