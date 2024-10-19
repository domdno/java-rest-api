package com.rest.crud_api.controller;

import com.rest.crud_api.model.Item;
import com.rest.crud_api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    private final ItemService itemService;

    @Autowired
    public ApiController(ItemService itemService){
        this.itemService = itemService;
    }

    // Base URL
    @GetMapping("/")
    public String getPage(){
        return "welcome";
    }

    // POST api/items
    /*
     * Create new item
     * @Param is item to create
     * @Return the response with 200 and body of new item
     */
    @PostMapping("/api/items")
    public ResponseEntity<Item> saveItem(@RequestBody Item item){
        Item newItem = itemService.saveItem(item);
        return new ResponseEntity<Item>(newItem, HttpStatus.OK);
    }
}
