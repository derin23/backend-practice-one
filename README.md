# backend-practice-one
Practicing REST API with spring boot!

The following guide and more can be found at https://spring.io/projects/spring-boot


Building an Application with Spring Boot

This guide provides a sampling of how Spring Boot helps you accelerate application development. As you read more Spring Getting Started guides, you will see more use cases for Spring Boot. This guide is meant to give you a quick taste of Spring Boot. If you want to create your own Spring Boot-based project, visit Spring Initializr, fill in your project details, pick your options, and download a bundled up project as a zip file.

What You Will build
You will build a simple web application with Spring Boot and add some useful services to it.

What You Need
About 15 minutes

A favorite text editor or IDE

JDK 1.8 or later

Gradle 4+ or Maven 3.2+

You can also import the code straight into your IDE:

Spring Tool Suite (STS)

IntelliJ IDEA

How to complete this guide
Like most Spring Getting Started guides, you can start from scratch and complete each step or you can bypass basic setup steps that are already familiar to you. Either way, you end up with working code.

To start from scratch, move on to Starting with Spring Initializr.

To skip the basics, do the following:

Download and unzip the source repository for this guide, or clone it using Git: git clone https://github.com/spring-guides/gs-spring-boot.git

cd into gs-spring-boot/initial

Jump ahead to Create a Simple Web Application.

When you finish, you can check your results against the code in gs-spring-boot/complete.

Learn What You Can Do with Spring Boot
Spring Boot offers a fast way to build applications. It looks at your classpath and at the beans you have configured, makes reasonable assumptions about what you are missing, and adds those items. With Spring Boot, you can focus more on business features and less on infrastructure.

The following examples show what Spring Boot can do for you:

Is Spring MVC on the classpath? There are several specific beans you almost always need, and Spring Boot adds them automatically. A Spring MVC application also needs a servlet container, so Spring Boot automatically configures embedded Tomcat.

Is Jetty on the classpath? If so, you probably do NOT want Tomcat but instead want embedded Jetty. Spring Boot handles that for you.

Is Thymeleaf on the classpath? If so, there are a few beans that must always be added to your application context. Spring Boot adds them for you.

These are just a few examples of the automatic configuration Spring Boot provides. At the same time, Spring Boot does not get in your way. For example, if Thymeleaf is on your path, Spring Boot automatically adds a SpringTemplateEngine to your application context. But if you define your own SpringTemplateEngine with your own settings, Spring Boot does not add one. This leaves you in control with little effort on your part.

Spring Boot does not generate code or make edits to your files. Instead, when you start your application, Spring Boot dynamically wires up beans and settings and applies them to your application context.
Starting with Spring Initializr
You can use this pre-initialized project and click Generate to download a ZIP file. This project is configured to fit the examples in this tutorial.

To manually initialize the project:

Navigate to https://start.spring.io. This service pulls in all the dependencies you need for an application and does most of the setup for you.

Choose either Gradle or Maven and the language you want to use. This guide assumes that you chose Java.

Click Dependencies and select Spring Web.

Click Generate.

Download the resulting ZIP file, which is an archive of a web application that is configured with your choices.

If your IDE has the Spring Initializr integration, you can complete this process from your IDE.
You can also fork the project from Github and open it in your IDE or other editor.
