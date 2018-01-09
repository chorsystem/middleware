How to install the wrapped jars in the local maven repository:

Install all six jars in your local maven repository with the following command:

mvn install:install-file -Dfile=<path-to-file> -DpomFile=<path-to-pomfile>


see also https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html



