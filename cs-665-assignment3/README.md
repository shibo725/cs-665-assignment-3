
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Shibo Wang                 |
| Date         | 10/26/2024                 |
| Course       | Fall                       |
| Assignment # |    3                       |

# Assignment Overview
The objective of this assignment is to develop a flexible and scalable Email Generation System that personalizes communication with customers based on their relationship with the business. The system should generate automated email messages for different customer segments, including Business, Returning, Frequent, New, and VIP customers. Each customer type will receive a unique, personalized email message tailored to their specific segment, reflecting the company’s efforts to maintain strong customer relationships.

# GitHub Repository Link:
https://github.com/shibo725/cs-665-assignment-3

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

The implementation is highly flexible, leveraging the Factory Method Pattern to manage the creation of customer objects. This pattern ensures that new customer types can be added easily by simply creating a new subclass of the Customer class and extending the CustomerFactory to support the new type. For example, if a new customer segment, such as a SeasonalCustomer,is needed in the future, developers only need to create a SeasonalCustomer class that extends Customer and update the factory method without altering the rest of the system. Similarly, removing or modifying existing customer types involves only changes in the specific class responsible for that behavior, without impacting the overall structure. This modularity ensures the system can evolve without major refactoring, adhering to the Open/Closed Principle.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

The design prioritizes simplicity and clarity by following object-oriented principles. Each class in the system serves a well-defined purpose, making the code easy to understand and maintain. The Customer abstract class encapsulates common behavior shared across all customer types, while the individual subclasses focus on their specific email content, ensuring that responsibilities are clearly separated. Additionally, the CustomerFactory class centralizes the logic for object creation, making the code easier to manage and reducing complexity. Consistent naming conventions, self-explanatory method names, and a logical class hierarchy further enhance the readability of the code, allowing other developers to quickly understand how the system works and easily contribute to its maintenance.

- Describe how you have avoided duplicated code and why it is important.

The implementation avoids code duplication by using inheritance and encapsulation effectively. The Customer class contains common attributes and methods (like name, email, and getters), which are reused across all subclasses. This ensures that each customer-specific class only contains the unique behavior required for that segment, minimizing redundancy. By centralizing the object creation logic in the CustomerFactory, we also avoid duplicating the logic for instantiating customer objects throughout the codebase. Avoiding duplication is crucial because it reduces the chance of inconsistencies and bugs, simplifies maintenance by centralizing changes, and ensures that the system remains easy to extend without introducing redundant code.

- If applicable, mention any design patterns you have used and explain why they were
chosen.

The Factory Method Pattern was chosen to manage the creation of different customer objects. This pattern is ideal for scenarios where the system needs to handle multiple object types that share a common interface or superclass. It allows the client code to remain agnostic about the specific classes being instantiated, promoting decoupling and flexibility. By encapsulating the object creation logic in the CustomerFactory, the pattern ensures that new customer types can be added or removed with minimal changes to the existing code. Additionally, the system demonstrates inheritance and polymorphism by defining a shared Customer interface and allowing each subclass to implement its own version of the generateEmailContent() method. These design choices promote maintainability, scalability, and adherence to best practices in object-oriented design.


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




