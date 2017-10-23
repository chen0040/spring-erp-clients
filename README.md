# spring-erp-clients

A sample demo project for how to develop spring cloud based solution. This project mainly shows how spring-cloud can be combined
with angular 4 for deployment.

# Usage
Git clone this project to your host computer.

Run ./make.sh (or make.ps1 if you are using Windows OS)to generate the jar files in the bin folder of the project.

Run the following commands to start the spring cloud cluster:

```bash
nohup java -jar third-party/spring-eureka-server.jar 1>/dev/null 2/dev/null &
nohup java -jar bin/spring-erp-scala.jar 1>/dev/null 2/dev/null &
nohup java -jar bin/spring-erp-buyer.jar 1>/dev/null 2/dev/null &
nohup java -jar bin/spring-erp-vendor.jar 1>/dev/null 2/dev/null &
nohup java -jar bin/spring-erp-admin.jar 1>/dev/null 2/dev/null &
```

Run the following command to start the angular server at port 8080 for the spring-erp-buyer web server.

```bash
sudo yum install -y nodejs
sudo npm install -g @angular/cli
cd ng4-erp
npm install
ng serve --proxy-config proxy.conf.json --host 0.0.0.0 --disable-host-check --port 8080
```


