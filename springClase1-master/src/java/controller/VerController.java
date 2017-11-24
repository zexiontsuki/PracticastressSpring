/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Auto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author heltonsmith
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {

    //siempre los métodos deben retornar String
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model) {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("desicion") String desicion,@RequestParam("desicion2") String desicion2,@RequestParam("desicion3") String desicion3,@RequestParam("desicion4") String desicion4, Model model){
        if (desicion.equals("v2")&& desicion2.equals("v2")&& desicion3.equals("v2")&&desicion4.equals("v2")) {
            
            String a = "campos vacios";
            model.addAttribute("err", a);
            
            return "error";
        }
        else if (desicion.equals("v2")&&desicion2.equals("v1")&&desicion3.equals("v1")&&desicion4.equals("v2")){
      return "medioe";
        }
        else{
            
            Auto a1 = new Auto(1, "Hyundai", "Grafito");
            model.addAttribute("auto", a1);
            
            return "exito";
        }

    }

}
