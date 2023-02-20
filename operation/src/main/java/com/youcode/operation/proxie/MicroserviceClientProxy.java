package com.youcode.operation.proxie;

import com.youcode.operation.bean.Compte;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "ms-client",url = "localhost:9099")
public interface MicroserviceClientProxy {
    @GetMapping(value = "/compte/{id}")
    Compte getCompteById(@PathVariable("id") String id);
}
