package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST APIのコントローラーであることを示すアノテーション
@RestController
public class HelloController {

    // 「/hello」にアクセスしたときに文字を返す処理
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
