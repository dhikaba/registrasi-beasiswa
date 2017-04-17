package id.ac.tazkia.beasiswa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DokumenController {

    @GetMapping("/user/dokumen/list")
    public ModelMap daftarDokumen(){
        return new ModelMap();
    }

    @GetMapping("/user/dokumen/form")
    public ModelMap tampilkanFormUpload(){
        return new ModelMap();
    }

    @PostMapping("/user/dokumen/form")
    public String prosesFormUpload(){
        return "redirect:/user/dokumen/list";
    }
}
