package com.github.chen0040.erp;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static spark.Spark.get;
import static spark.Spark.port;


/**
 * Created by xschen on 23/10/2017.
 */
public class Syslog4jApplication {

   public static void main(String[] args) {
      port(6088);

      get("/", (req, res) -> {
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         return "<html><head><title>spring-erp-syslog4j-server</title></head><body><h1>Syslog4j @" + dateFormat.format(new Date()) + "</body></html>";
      });
   }
}
