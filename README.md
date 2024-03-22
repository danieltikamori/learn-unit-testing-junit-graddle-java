# First Java project using Gradle and JUnit

## Description

Learn how to build and test your first Java project with Gradle and JUnit.

## Getting started

To get started with Gradle, follow the [getting started guide](https://docs.gradle.org/current/userguide/userguide.html).

To get started with JUnit, follow the [getting started guide](https://docs.gradle.org/current/userguide/java_testing.html).

Open https://mvnrepository.com/search?q=junit in your browser. [Choose the latest version of JUnit Jupiter Engine](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine).

For non IntelliJ IDEs:

Then go to Gradle tab and copy the code snippet. Open the file build.gradle(.tks) usually at lib directory or at the root. Paste it inside dependencies section.

For IntelliJ IDEs using Gradle Kotlin DSL:
Go to Gradle(Kotlin) tab and copy the code snippet. Open the file build.gradle(.tks) located at root directory and paste it inside dependencies section.

Also, inside build.gradle(.tks) add the following code if not already present:

```gradle
test {
    useJUnitPlatform()
}
```

### Build a project

In this example, we will create a Person class and test it.

Create the class Person with variables, constructors and methods.

### Testing

For IntelliJ IDEs using Gradle Kotlin DSL:

[//]: # (In the Gradle tab, click on the green icon for the test task.)

Right click anywhere in the class Person and select Generate..., then select Test.
Select the methods you want to test. It will generate a test class inside the test directory.

You may also create your own test inside this new class as in this example code.

After creating your test, run the test class. You may also run the test in the Gradle tab.



