package com.example.demo.controller;

import com.example.demo.http.HttpApiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("w")
public class HttpclientController {
    @Autowired
    private HttpApiService httpAPIService;

@RequestMapping("dd")
    public void test() throws Exception {
        String id ="583294548880";
        String url = "http://pub.alimama.com/common/code/getAuctionCode.json?auctionid="+id+"&adzoneid=73654400&siteid=21940266&scenes=1&t=1489238018764&_tb_token_=qO2Nj1Sk4Rq&pvid=10_122.233.43.77_1118_1489238002348";
        String str = httpAPIService.doGet(url);
        System.out.println(str);
    }
}
