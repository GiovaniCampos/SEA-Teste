package com.SEA.Cadastramento.controller;

import com.SEA.Cadastramento.entites.User;
import com.SEA.Cadastramento.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        return mv;
    }

    @Autowired
    private UserRepository repository;

    @RequestMapping(value="/saveUser", method = RequestMethod.POST)
    /*public void saveUser(HttpServletRequest request){
        try {
            // Obter os dados do corpo da solicitação aqui
            String requestBodyData = obterDadosDoCorpoDaRequisicao(request);

            // Faça o parse ou processamento dos dados conforme necessário
            User userData = parseUserData(requestBodyData);

            // Salvar a comida no repositório
            repository.save(userData);
        } catch (Exception e) {
            // Lidar com exceções aqui, como log ou retornar um código de status de erro
            // Exemplo: log.error("Ocorreu um erro ao salvar a comida.", e);
            // return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Função para obter dados do corpo da solicitação (implementação dependente do framework usado)
    private String obterDadosDoCorpoDaRequisicao(HttpServletRequest request) throws IOException {
        // Implemente a lógica para ler os dados do corpo da solicitação
        // Por exemplo, usando BufferedReader e request.getInputStream()
    }

    // Função para analisar os dados do corpo da solicitação e criar uma instância de Food
    private User parseUserData(String requestBodyData) {
        // Implemente a lógica para analisar os dados do corpo da solicitação e criar um objeto Food
    }*/
    @GetMapping
    public List<User> getAll(){
        List<User> userList = repository.findAll();
        return userList;
    }
}
/* import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}*/