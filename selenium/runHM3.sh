#!/bin/bash

cd selenium-HM3/

mvn -f pom.xml test

open ./target/surefire-reports/index.html 