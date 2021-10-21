package za.ac.cput.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControl {
    @RequestMapping({"/", "/home"})
    public String home(){
        return "User booking";
    }
}
