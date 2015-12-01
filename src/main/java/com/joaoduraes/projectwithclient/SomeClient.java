package com.joaoduraes.projectwithclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("client")
public interface SomeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/client")
    String getClient();
}
