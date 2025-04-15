package just.demoCA221;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
public class HelloController {

    //@GetMapping("/")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String show(){
        return "Welcome to CA221 CLASS";
    }

}
