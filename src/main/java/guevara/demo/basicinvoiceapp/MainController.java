package guevara.demo.basicinvoiceapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {



    @GetMapping("/index")

    public String saywelcome(Model model){

        model.addAttribute("myWelcome", "WELCOME-HOW ARE YOU TODAY!");

        return "welcome";


    }
  @GetMapping("/login")

    public String saylogin(Model model) {

      model.addAttribute("myWelcome", "This is the login page!");

      return "welcome";
  }


    @GetMapping("/addproduct")

    public String sayaddp(Model model) {

        model.addAttribute("myWelcome", "Add product here:");

        return "welcome";
    }



    @GetMapping("/list  product")

    public String saylistp(Model model) {

        model.addAttribute("myWelcome", "This is the list of your products:");

        return "welcome";

    }

}
