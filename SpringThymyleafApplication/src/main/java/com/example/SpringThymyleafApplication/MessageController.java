package com.example.SpringThymyleafApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
    @GetMapping("/message/")
    public String getInfo(@RequestParam(value = "id",defaultValue = "No parameter found") String id,
                          @RequestParam(value = "message",defaultValue = "No parameter found") String message,
                          @RequestParam(value = "signature",defaultValue = "No parameter found") String signature,
                          Model model){
        model.addAttribute("id",id);
        model.addAttribute("message",message);
        model.addAttribute("signature",signature);
        return "messagecontroller";
    }
}
