package com.actividadcontacto.clinica.Controlador;

import com.actividadcontacto.clinica.Entidad.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteControlador {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "Formulario/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPaciente(@ModelAttribute @Valid Paciente paciente, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Formulario/formulario";
        }

        String idiomasUnidos = String.join(", ", paciente.getIdiomas());
        model.addAttribute("idiomasUnidos", idiomasUnidos);

        return "Formulario/registroExitoso";
    }
}


