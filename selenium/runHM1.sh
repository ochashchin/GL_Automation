#!/bin/bash

cd selenuim-HM1/

mvn -f pom.xml test

open ./target/surefire-reports/index.html 