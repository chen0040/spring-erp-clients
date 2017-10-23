package com.github.chen0040.erp.controllers;


import com.github.chen0040.erp.api.ErpApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * Created by xschen on 23/10/2017.
 */
@Controller
public class SimpleController {

   @Autowired
   private ErpApi service;

   @RequestMapping(value="/greetings", method = RequestMethod.GET)
   public @ResponseBody Map<String, String> greet() {
      return service.greet("vendor-application");
   }
}
