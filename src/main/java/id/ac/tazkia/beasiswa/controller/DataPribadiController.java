package id.ac.tazkia.beasiswa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataPribadiController {
    @GetMapping("/user/data/view")
    public ModelMap lihatData(){
        return new ModelMap();
    }

    @GetMapping("/user/data/form")
    public ModelMap tampilkanFormEdit(){
        return new ModelMap();
    }

    @PostMapping("/user/data/form")
    public String prosesFormEdit(){
        return "redirect:/user/data/view";
    }
}
