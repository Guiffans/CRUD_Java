package com.aaaa.bbbbb.Controler;

import com.aaaa.bbbbb.Model.Pessoa;
import com.aaaa.bbbbb.Interface.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Feito com muito amor <3 🥹👉👈

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Listar pessoas
    @GetMapping
    public String pessoa(Model model) {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        model.addAttribute("pessoas", pessoas);
        return "listar-pessoas";
    }

    // Adicionar pessoa
    @GetMapping("/novo")
    public String novopessoa(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "form-pessoa";
    }

    // Salvar pessoa
    @PostMapping("/salvar")
    public String salvarPessoa(@ModelAttribute Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return "redirect:/pessoas";
    }

    // Editar pessoa
    @GetMapping("/editar/{id}")
    public String editarPessoa(@PathVariable Long id, Model model) {
        Pessoa pessoa = pessoaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pessoa Inválida: " + id));
        model.addAttribute("pessoa", pessoa);
        return "form-pessoa";
    }

    // Deletar pessoa
    @GetMapping("/deletar/{id}")
    public String deletarPessoa(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
        return "redirect:/pessoas";
    }
}
