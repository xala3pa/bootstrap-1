# Bootstrap

Simple showcase project to allow quickly start with development process of modern web based application.

* [Technology stack](#technology-stack)
    * [Why Scala?](#why-scala)
    * [Why AngularJS?](#why-angularjs)
    * [Why Scalatra?](#why-scalatra)
    * [Why sbt?](#why-sbt)
* [How to run](#how-to-run)
* [How to develop](#how-to-develop)
    * [Useful sbt commands](#useful-sbt-commands)
* [License](#license)

Project is divided in few separated modules but basically we have UI which is base on [AngularJS](http://angularjs.org/)
and REST backend based on [Scalatra](http://www.scalatra.org/).
Backend can be interchanged as there is no dependency between frontend and backend - [spray.io](http://spray.io/) was also an option.

## Technology stack

### Why Scala?

Why not :-)

### Why AngularJS?

Basically it's the hottest JavaScirpt framework right now, developed and supported by Google.
It offers complete solution to build dynamic and modern HTML5 based web applications.
And at last from version 1.x is quite stable :-)

It's also worth to notice that there are plans to natively support DOM templating with the next generation of web browsers
- thus it can be huge advantage of the AngularJS over other frameworks.

### Why Scalatra?

It's quite simple and easy to jump into Scalatra for an ordinary Java developer whom used Servlets previously.
The syntax of the flow directives is straightforward and it was easy to integrate support for JSON into it.
And it's written in Scala from scratch which seamlessly integrates with other Scala based libraries.

### Why sbt?

The answer can be hard. It is easy to start using [sbt](http://www.scala-sbt.org/), but when things get hard, it's very difficult to find good examples
or supporting documents. But at the end it's a dedicated tool for Scala platform, so why not to try it :-)

## How to run

To run application, simply clone the source code, enter the directory and type _./run.sh_ or _run.bat_ depends on your OS,
navigate your web browser to http://localhost:8080/ and start using the application.

## How to develop

If you want to start develop new features, you must have sbt version 0.12.1 installed. Enter the same directory as above and type _sbt_
to start the sbt console. Few plugins are already integrated with the project:

* IDE configuration: we are using the best IDE right now - IntelliJ IDEA - to be able open project with it you must generate project files, you can do that with: _gen-idea_
* web server: right now Jetty is integrated with the project, you can start it from the sbt console with: _container:start_

There are two implementations of storage - in-memory and mongo - you must install MongoDB and start it before starting the application (when started with run.sh/run.bat the in-memory storage is used)

### Useful sbt commands

* _compile_ - compile the whole project
* _test_ - run all the tests
* _project &lt;sub-project-name&gt;_ - switch context to given sub-project, then all the commands will be execute only for that sub-project, thus can be also achieved with: _&lt;sub-project-name&gt;/test_
* _container:start_ - starts the embedded Jetty container
* _container:reload /_ - reloads application at context /
* _~;container:start; container:reload /_ - runs container and waits for source code changes to automatically compile changed file and to reload it

## License

Project is licensed under [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0.html) which means you can freely use any part of the project.
