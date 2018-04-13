package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewAccount(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String image,
            @RequestParam String nick,
            @RequestParam String type) {
        Account account = new Account();
        account.setEmail(email);
        account.setPassword(password);
        account.setImage(image);
        account.setNick(nick);
        account.setType(type);
        accountRepository.save(account);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

}
