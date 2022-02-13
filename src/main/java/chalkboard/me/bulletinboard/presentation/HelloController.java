package chalkboard.me.bulletinboard.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello !!");
        return "hello";
    }
}
