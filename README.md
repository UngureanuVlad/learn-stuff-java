# Multi-Project Java Maven Repository

This repository contains multiple **independent Java projects**, each managed using **Apache Maven**. Every project is located in its own directory with its own `pom.xml` and `main` class.

Each project is **self-contained** and can be opened, built, and run separately using any Java IDE.

---

## Prerequisites

To get started, you need to have the following installed on your machine:

### 🔹 Java Development Kit (JDK)

- Install JDK 11 or newer (LTS versions like JDK 17 are recommended)
- You can download it from:
    - Oracle JDK: https://www.oracle.com/java/technologies/javase-downloads.html
    - OpenJDK: https://jdk.java.net/
- Follow the installation instructions for your operating system
- Make sure you set JAVA_HOME

### 🔹 Apache Maven

- Install the latest stable version of Apache Maven
- Download it from: https://maven.apache.org/download.cgi
- Follow the installation instructions for your operating system
- Make sure you set MAVEN_HOME

---

## How to Build and Run a Project

Each subdirectory in this repository represents a standalone Maven project. To build and run any project:

1. Open the project in your preferred Java IDE, such as:
    - IntelliJ IDEA
    - Eclipse
    - Visual Studio Code (with Java extensions)

2. Build the project using the following Maven command:
   mvn clean install

3. Run the main class:
    - Locate the class containing the `public static void main(String[] args)` method
    - Run it from your IDE
    - Or use the following Maven command:
      mvn exec:java -Dexec.mainClass="io.learnstuff.Main"

   Replace `io.learnstuff.Main` with the fully qualified name of your actual main class

---

## Notes

- These projects are not connected and do not use a shared parent pom.xml
- There is no multi-module setup — each is intended to run individually

---

> More resources at:\
> https://www.tritechdigital.io/
