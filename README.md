# Head First Design Patterns

This repository contains Java implementations for the solved examples and problems in the book Head First Design Patterns 2nd edition by Eric Freeman, Elisabeth Robson.

This book is very useful for anyone who understands the basics of OOP, and is looking to uplevel their design skills from there. Folks who are LLD ninjas already may not benefit much.

Code written here is my own - and is intended for my own practice implementing the design patterns described in the book (and for reference later).

## Building and running the code in this repo

Code written in this repo is mainly for expository purposes, but should someone wish to run and see the output of various examples/problems, they could follow the steps mentioned below.

### Prerequisites

You will need the following:
* Java (anything above Java 8 should work)
* Maven

### Cloning the repo

Simple `git clone <remote-url>`

### Building the code

The following command will build executable jars for all the examples/problems for which code exists in this repo:

```
mvn clean package install
```

### Running the code

```
java -jar target/{EXECUTABLE_NAME}.jar
```

For example, to run the ducks example from Chapter 1, you could run: `java -jar target/DuckTester-jar-with-dependencies.jar`. To see a list of all executable JARs generated from them previous step, run `ls -ltra target/*.jar`