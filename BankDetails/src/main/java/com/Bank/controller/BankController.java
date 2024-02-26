package com.Bank.controller;

import com.Bank.entity.BankAddress;
import com.Bank.entity.BankServices;
import com.Bank.repository.BankAddressRepository;
import com.Bank.repository.BankServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/bank")
public class BankController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/name")
    public String getBankName() {
        return "Example Bank";
    }

    @GetMapping("/address")
    public String getBankAddress()   {
        return "Rajaji nagar, Bangalore";
    }

    @GetMapping("/beans")
    public String getBeans() {
        StringBuilder beanList = new StringBuilder();
        String[] allBeanNames = context.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            beanList.append(beanName).append("\n");
        }
        return beanList.toString();
    }

    @Autowired
    private BankAddressRepository bankAddressRepo;

    @GetMapping("/alladdress")
    public List<BankAddress> getAllAddresses(Model model) {

        String bankName = "Example Bank";
        model.addAttribute("bankName", bankName);

        List<BankAddress> bankAddresses = bankAddressRepo.findAll();
        return bankAddresses;
    }

    @Autowired
    private BankServiceRepository bankServiceRepo;

    @GetMapping("/allServices")
    public List<BankServices> getAllServices() {
        List<BankServices> bankServices = bankServiceRepo.findAll();
        return bankServices;
    }

}
