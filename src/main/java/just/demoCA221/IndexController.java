package just.demoCA221;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/ask")
    public String ask(Model model){
        model.addAttribute("message","Spring boot project!");
        model.addAttribute("id","C112160");
        return "index";  //view name
    }
}
