package com.github.chen0040.erp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by xschen on 23/10/2017.
 */
@Controller
public class SimpleController {

   @RequestMapping(value="/greetings", method = RequestMethod.GET)
   public @ResponseBody Map<String, String> greet(@RequestParam("recipient") String recipient){
      Map<String, String> result = new HashMap<>();
      result.put("recipient", recipient);
      result.put("name", "spring-erp-scala");
      result.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
      return result;
   }
}
