package just.demoCA221;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
public class HelloController {

    //@GetMapping("/")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String show(){
        return "Welcome to CA221 CLASS";
    }

    //ResponseEntity
    @GetMapping("/ok")
    public ResponseEntity<String> getOk(){
        String details = "response entity custom message";
        //return ResponseEntity.ok().body(details);
        return ResponseEntity.ok(details);
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).
//                body(details);
    }
    @GetMapping("/serverError")
    public ResponseEntity<Map<String,String>> getServer(){
        HttpHeaders myHeader = new HttpHeaders();
        myHeader.add("custom header", "server error header");
        //error
        Map<String , String > errorInfo = new HashMap<>();
        errorInfo.put("server error" , "internal server error!");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                headers(myHeader).body(errorInfo);
    }

}
