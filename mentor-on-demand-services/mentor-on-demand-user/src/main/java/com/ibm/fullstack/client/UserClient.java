package com.ibm.fullstack.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "eureka-client-common")
public interface UserClient {

    @PostMapping(value = "/common/mail/thymeleaf/veri/code")
    JSONObject sendThymeleafEmailVefiCode(@RequestBody JSONObject userJson);

    @PostMapping(value = "/common/mail/thymeleaf/reset/pwd")
    JSONObject sendThymeleafEmailTmpPwd(@RequestBody JSONObject userJson);
}
