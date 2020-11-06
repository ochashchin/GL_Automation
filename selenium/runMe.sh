#!/bin/bash

unzip selenium-java-tasks.zip -d ./selenuim-java-tasks

cd selenuim-java-tasks/

mvn -f pom.xml test

open ./target/surefire-reports/index.html 