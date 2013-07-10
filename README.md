Gradle Bootstrap Java Project
=============================
Here is the example Java project that works with the following tools

- Use of [XML Unit](http://xmlunit.sourceforge.net/) for comparing the output
generated from the program.

- Use of [JUnit 4](http://junit.org/) and [Hamcrest](https://code.google.com/p/hamcrest/)
for unit testing.

- Use of [Gradle](http://www.gradle.org/) for build and testing automation.

- Use of [Cobertura](http://cobertura.sourceforge.net/) for code coverage

## How to build and run the project.

* The project is build using [Gradle](https://github.com/gradle/gradle) which is
very powerful and easy to use as an alternative to [Apache Maven](http://maven.apache.org/).

On Mac system, you can install it using [HomeBrew](http://brew.sh/)

```bash
$brew install gradle
```
Or simply download it from the [official site](http://www.gradle.org/downloads).

Once this is done, then you should be able to run the project by simple type:

```bash
$./gradlew tasks
or
$gradle tasks
```
Or run the default tasks e.g. ```clean, test, cobertura, runMainClass```

```
./gradlew
```
List of other runnable tasks

```
    tasks        - Displays the tasks runnable from root project
    cleanEclipse - Cleans all Eclipse files.
    cleanIdea    - Cleans IDEA project files (IML, IPR)
    eclipse      - Generates all Eclipse files.
    idea         - Generates IDEA project files (IML, IPR, IWS)
    check        - Runs all checks.
    test         - Runs the unit tests.
    cobertura    - Generate Cobertura coverage reports after running tests.
```

## Import project to Eclipse or IntelliJ project

* To generate the properfile for Eclipse just type
```
./gradlew cleanEclipse eclipse
```
Then use Eclipse's import project file.

* For IntelliJ Idea , run the following command
```
./gradlew cleanIdea idea
```

## Coverage Reports
As stated above, the coverage report can be obtained by running the following
command.

```
./gradlew cobertura
```
Which will produces the html report to ```build/reports/cobertura/``` directory.

## Unit Test Reports

The report can be obtained by run the following command
```
./gradlew test
```
will produces the html report to ```build/reports/test/``` directory.
