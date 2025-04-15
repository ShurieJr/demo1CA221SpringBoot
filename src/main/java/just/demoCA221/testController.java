package just.demoCA221;

import org.springframework.web.bind.annotation.*;

@RestController
public class testController {
    @GetMapping("/name")
   // @RequestMapping(method = RequestMethod.GET , path = "/name")
    public String getName(){
        return "MOHAMED ABDULLAHI";
    }
}
