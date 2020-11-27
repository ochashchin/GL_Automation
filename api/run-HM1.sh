#!/bin/bash

cd api-HM1/

mvn -f pom.xml test

open ./target/surefire-reports/index.html 