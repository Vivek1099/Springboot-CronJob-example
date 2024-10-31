# Spring Boot Cron Job Example

## Overview

This project demonstrates how to set up a Spring Boot application that utilizes a cron job to execute tasks at specified intervals. The application is built using only the Spring Web dependency, showcasing how to leverage Spring's scheduling capabilities.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Creating the Cron Job](#creating-the-cron-job)
- [Running the Application](#running-the-application)
- [Accessing the Application](#accessing-the-application)
- [License](#license)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java Development Kit (JDK)**: Version 11 or higher.
- **Apache Maven**: Version 3.6 or higher.
- **Spring Boot**: This project uses Spring Boot 2.7.x or higher.


## Configuration

### `pom.xml`

Ensure your `pom.xml` is configured to include the Spring Web dependency and enable scheduling:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>spring-boot-cron-example</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <java.version>11</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```


### Example Cron Expression

- `0 * * * * *` - Executes every minute at the 0th second.
- `0 12 * * *` - Executes every day at noon.
- `0 0 * * 1` - Executes every Monday at midnight.



### Cron Expression Breakdown:
     "---------------------------"
     "Field        | Value Range"
     "-------------|-----------------------------"
     "Seconds      | 0 - 59"
     "Minutes      | 0 - 59"
     "Hours        | 0 - 23"
     "Day of Month | 1 - 31"
     "Month        | 1 - 12"
     "Day of Week  | 0 - 7 (Sunday is both 0 and 7)"
     "---------------------------"
     ""
     
### Cron Expression Visual Representation:
```sh
* * * * * *
| | | | | |
| | | | | +---- Day of the week (0 - 7) (Sunday is both 0 and 7)
| | | | +------ Month (1 - 12)
| | | +-------- Day of the month (1 - 31)
| | +---------- Hour (0 - 23)
| +------------ Minute (0 - 59)
+-------------- Second (0 - 59)
