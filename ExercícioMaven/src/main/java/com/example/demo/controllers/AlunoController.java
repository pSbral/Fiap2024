package com.example.demo.controllers;

import com.example.demo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastro")
public class AlunoController {
    @GetMapping("/register")
    public String cadastrarAluno(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "alunos/novo-aluno";
    }

    @PostMapping("/save")
    public String inserirAluno(Aluno aluno) {
        System.out.println(aluno.toString());
        return "redirect:/cadastro/register";
    }
}
