<<<<<<< HEAD

| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Haonan Chen                |
| Date         | 11/10/2024                 |
| Course       | Fall                       |
| Assignment # | 6                          |

# # Delivery System Project
This project implements a delivery request notification system that leverages the Observer Design Pattern. When a new delivery request is created, the system automatically notifies all registered drivers (observers) of the update. The design focuses on flexibility, maintainability, and adherence to clean coding practices.
# GitHub Repository Link:
https://github.com/HaonanChen-2024/cs-665-assignment--6-

# Key Improvements and Design Choices

## 1. lear Responsibilities and Single Responsibility Principle (SRP)

Separation of Concerns:
The DeliveryObservable interface now strictly defines methods for adding, removing, and notifying observers. It no longer includes request creation logic.

The Shop class:

Manages observers (drivers) by adding and removing them as needed.
Creates and sends delivery requests via its own method (createAndSendRequest), thereby keeping the DeliveryObservable interface focused solely on observer management.
Driver Class Focus:
The Driver class solely focuses on receiving and managing delivery requests. This improves understandability and maintainability.

## 2. Enhanced Flexibility via the Observer Pattern

Decoupled Components:
The Observer pattern decouples the shop (observable) from the drivers (observers). Adding a new type of driver (e.g., DroneDriver) only requires implementing the Observer interface—no changes to the Shop class are necessary.

Easy Extension:
Need to introduce a new notification mechanism or integrate additional functionalities? Simply add new classes or interfaces implementing Observer, and the system will notify them automatically.

## 3. Improved Code Readability and Consistency
   Consistent Naming and Style:
   Renaming variables (e.g., from receivedMessages to receivedRequests) clarifies their purpose.
   Following the Google Java Style Guide ensures a uniform coding style that is easier for others to understand and maintain.

Reduced Output Dependencies:
Replacing System.out.println statements with Logger not only makes the code cleaner but also simplifies testing and debugging. Log messages can be captured, inspected, or redirected without modifying the core logic.

## 4.Testing and Quality Assurance

JUnit Tests:
Unit tests ensure that the Shop and Driver classes behave as expected. Tests verify adding/removing drivers, sending notifications, and handling delivery requests properly.

Static Analysis Tools:
Integrating tools like SpotBugs and Checkstyle helps maintain code quality by detecting potential issues and enforcing coding standards before runtime.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




=======
# cs-665-assignment--6-
>>>>>>> a8fad0962472d05aefe54ce79babfd5d74c4d702
