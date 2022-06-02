package co.develhope.excercisefourthApi.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

@RestController
@RequestMapping("headers")
public class HeaderController {
    @GetMapping("")
    public String getHeader(@RequestHeader HttpHeaders headers){
        InetSocketAddress host = headers.getHost();
        return "Host: " + host.getHostName() + ", Port: " + host.getPort();
    }
}
