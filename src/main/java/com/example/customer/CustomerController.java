package com.example.customer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository repo;
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    CustomerController(CustomerRepository repo){
        this.repo = repo;
    }

    @RequestMapping("customers")
    public List<Customer> getAllCustomers(){
        log.info("All customers returned");
        log.error("All customers returned in ERROR mess");
        log.warn("All customers returned in WARNING mess");
        log.debug("All customers returned in DEBUG mess");
        return repo.findAll();
    }
    @RequestMapping("customers/{id}")
    public Customer findById(@PathVariable long id){
        log.info("Costumer found with id "+id);
        return repo.findById(id).get();
    }


    @RequestMapping("customers/add")
    public List<Customer> addCustomers(@RequestParam String name, @RequestParam String PersonNr){
        repo.save(new Customer(name, PersonNr));
        log.info("Customer added");
        return repo.findAll();

    }


}