# Java Processing 4 template

This project is a template for using [Processing](https://processing.org/) with Intellij IDEA.

## Requirements

1. Have Java `JDK 17` or later installed

## Simple setup (default renderer)

1. Download and extract latest version of Processing from https://processing.org/download
2. Create a `lib` directory in root of this directory
3. Copy `core.jar` from `core\library` and paste in `lib` directory
4. [Reload Gradle project](https://www.jetbrains.com/help/idea/work-with-gradle-projects.html#gradle_refresh_project)

## Default setup (all renderers)

1. Download and extract latest version of Processing from https://processing.org/download
2. Create a `lib` and `native` directories in root of this directory
3. Copy `core.jar`, `gluegen-rt.jar` and `jogl-all.jar` from `core/library` and paste in `lib` directory
4. Copy all native file folders from `core\library` to `native` directory or the specific one for your OS
5. [Reload Gradle project](https://www.jetbrains.com/help/idea/work-with-gradle-projects.html#gradle_refresh_project)

## Using other libraries

1. Add library `.jar` file to `lib` directory
2. [Reload Gradle project](https://www.jetbrains.com/help/idea/work-with-gradle-projects.html#gradle_refresh_project)