package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/enterInfo")
public class SpringMVCController {
    @RequestMapping("/showInfo")
    public String getCountry() {
        return "view1";
    }
}
