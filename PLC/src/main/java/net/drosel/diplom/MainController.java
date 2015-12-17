package net.drosel.diplom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Andrew
 * Date: 17.12.2015
 * Time: 13:57
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
}
