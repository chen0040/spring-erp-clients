package com.github.chen0040.erp.api;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * Created by xschen on 23/10/2017.
 */
@FeignClient("spring-erp-scala")
public interface ErpApi {
   @RequestMapping(value="/greetings", method = RequestMethod.GET)
   @ResponseBody Map<String, String> greet(@RequestParam("recipient") String recipient);
}
