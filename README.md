================
Basic Spring MVC
================

Ok, here is the deal: Configure a simple and basic java application, using Spring MVC. The tricky part: I don't want to configure the spring xml. The web.xml and the log4j.xml... well, i'm ok  with them.
I searched for this online but coudn't find anything, so I'm making it available for anyone that wants to learn, or to start an application with SpringMVC.

Again: SpringMVC application without xml files.

I'm using maven for dependency management.

Using it
========

In the pom.xml there's the plugin for jetty. It'll run under the 8080 port, in the url basic.spring.mvc.com . You must map this to your 127.0.0.1 in your hosts file to work, then go to the root of the project and run "mvn jetty:run". Go to your browser and type basic.spring.mvc.com:8080 and you will hit the default controller defined in basic.spring.mvc.controller.BasicController.java

Customization
=============

The way that the project is now, if you want to change the packages and classes, you got to dig inside the pom.xml and, most important, the web.xml. It shouldn't be hard.

Where this is going?
====================

My main goal is to create a maven archetype where you can pass the default packages names and it'll create this core project. This way we will be able to use it as a dependency or as a way to start a new project


