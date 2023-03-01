package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mvc")
public class SpringMVCController {
    @RequestMapping("/1")
    public String getCountry() {
        return "view1";
    }
    @RequestMapping("/enterInfo")
    public String enterInfo() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo(HttpServletRequest request, Model model) {
        // Получаем строку и сразу преобразуем ее
        String country = request.getParameter("country");
        // Добавляем новый атрибут в модель
        model.addAttribute("newAttribute1", country);

        // Получаем строку и сразу преобразуем ее
        String capital = request.getParameter("capital");
        // Добавляем новый атрибут в модель
        model.addAttribute("newAttribute2", capital);
        return "showInfo";
        /*
        Меняем параметр HttpServletRequest на String
		И ставим аннотацию для него — RequestParam
    @RequestMapping("/showName")
    public String showName(@RequestParam("name") String email, Model model) {

				// Строку из параметра сразу приводим к нужному виду
        email += "@qwerty.pro";
        model.addAttribute("newAttribute", email);

        return "showName";
    }
}
         */
    }
}
