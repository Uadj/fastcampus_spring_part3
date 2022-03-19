package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/logout")
    public String logout(@RequestHeader("referer") String referer, Model model) {
        model.addAttribute("backUrl", referer);

        return "auth/logout";
    }
    @GetMapping("/sign-up")
    public String signUp(){
        return "sign-up";
    }
}
