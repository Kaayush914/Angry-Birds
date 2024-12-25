# Angry-Birds

## Overview
Birds Angry is a 2D physics-based game inspired by the popular Angry Birds franchise. In this game, players launch birds with unique abilities to destroy structures and defeat enemies (pigs). The game features various types of birds, including a special blue bird that can split into three upon activation.

## Features
- **Multiple Bird Types**: Each bird has its own unique abilities.
- **Physics-Based Gameplay**: Utilize realistic physics to solve challenges.
- **Interactive Levels**: Engage in different levels with varying structures and enemies.
- **Special Abilities**: Activate special abilities for strategic gameplay.

## Prerequisites
Before running the game, ensure you have the following installed on your system:

1. **Java Development Kit (JDK)**: Version 8 or higher
   - You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use [OpenJDK](https://openjdk.java.net/).

2. **Gradle**: Version 6.0 or higher
   - You can download it from [Gradle's website](https://gradle.org/install/).

## Cloning the Repository
To download the code, clone the repository using Git:

##bash
git clone https://github.com/yourusername/BirdsAngry.git
cd BirdsAngry

A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

This project was generated with a template including simple application launchers and a main class extending `Game` that sets the first screen.

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3; was called 'desktop' in older docs.
- `headless`: Desktop platform without a graphical interface.
- `lwjgl2`: Legacy desktop platform using LWJGL2.

## Gradle

This project uses [Gradle](https://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `headless:run`: starts the headless application. Note: if headless sources were not modified - and the application still creates `ApplicationListener` from `core` project - this task might fail due to no graphics support.
- `idea`: generates IntelliJ project data.
- `lwjgl2:jar`: builds application's runnable jar, which can be found at `lwjgl2/build/libs`.
- `lwjgl2:run`: starts the application.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.

