#!/bin/bash

cd selenuim-HM2/

mvn -f pom.xml test

open ./target/surefire-reports/index.html 