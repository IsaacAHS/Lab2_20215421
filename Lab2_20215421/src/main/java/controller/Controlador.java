package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class Controlador{
    @GetMapping("/configuracion")
    public String configuracion(Model model){
        Configuracion configuracion1= new Configuracion();
        model.addAttribute("configuracion", configuracion1);
        return "configuracion";
    }
    @PostMapping("/configuracion/guardar")
    public String guardarConfiguracion(@RequestParam("longitud") Integer longitud,
                                       @RequestParam("intentos") Integer intentos,
                                       @RequestParam("tema") String tema){
        System.out.println("longitud: " + longitud + "\n"+
                "intentos: " + intentos +"\n"+
                "tema: " + tema
        );
        return "configuracion";
    }


}