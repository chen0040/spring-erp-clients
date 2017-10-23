#!/usr/bin/env bash

mvn -f pom.xml clean package -Plocal -U

cp /target/spring-erp-scala.jar bin/spring-erp-scala.jar
cp /target/spring-erp-buyer.jar bin/spring-erp-buyer.jar
cp /target/spring-erp-vendor.jar bin/spring-erp-vendor.jar
cp /target/spring-erp-admin.jar bin/spring-erp-admin.jar
cp /target/spring-erp-syslog4j-server.jar bin/spring-erp-syslog4j-server.jar
