# ChorSystem Middleware
This repository hosts the source code of the ChorSystem Middleware.
For architectural diagrams and the related academic papers see the [ChorSystem project page](http://www.iaas.uni-stuttgart.de/chorsystem/)

# Installation guide


## Necessary software

The middleware has been tested with the following software. Please use exactly the given versions, otherwise you might run into problems. Especially, the
bundle dependencies inside ServiceMix are quite tricky.

* PostgreSQL 9.4.
* Apache ServiceMix 5.4.0

### Preparing the installation
Execute Maven in the root folder with the following command:


    mvn clean install

This should build all components as OSGi Bundles place them in the local maven repository (in .m2).
For building the internal choreography instance graph Eclipse EMF is necessary. As a quick workaround, we wrapped the necessary plugin jars
as OSGi Bundle. They are located in the wrapped-libs folder and can each be installed in the maven repository via 


    mvn install:install-file -Dfile=<path-to-file> -DpomFile=<path-to-pomfile>


See also  https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html for further information.


### PostgreSQL

Initialize the Database with the *resetChorSystem* script given in the scripts folder.
You can also reset the middleware with the script.
Make sure that the user and password you create correspond to the ones you specifiy in your own script

### ServiceMix

ServiceMix acts as the platform for deploying and executing the OSGi Bundles representing the distinct middleware components.

ServiceMix provides a mechanism to install OSGi Bundles as features. 
The middlware feature.xml is located in the feature folder.
Assuming all bundles have been built using Maven the feature can be added in the following way:


    features:addUrl mvn:de.unistuttgart.iaas.chor.integration/feature/0.1-SNAPSHOT/xml/features


Subsequently, it allows to install the dependencies of the middleware components:

    features:install chor:middleware-dependencies
    features:install chor:emf

Optionally, the complete middleware components as well as the underlying dependencies can be installed directly via 


    features:install chor:middleware

A second option is to manually copy the jars of all bundles from each *target/* folder to the *<servicemix_home>/deploy* folder.

## Hawtio
[Hawtio](http://hawt.io/) provides an excellent way to monitor everything in the JVM.
This is also true for the Apache Camel message routes of the middleware. It allows to inspect the message flow in a graphical manner for debugging purposes.


    features:addurl mvn:io.hawt/hawtio-karaf/1.4.4/xml/features
    features:install hawtio 


Locally, Hawtio can be accessed via http://localhost:8181/hawtio/index.html 
