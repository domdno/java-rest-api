package com.rest.crud_api.service;

import com.rest.crud_api.model.Item;
import com.rest.crud_api.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for managing items
 */

@Service
public class ItemService {

    private final ItemRepo itemRepo;

    @Autowired
    public ItemService(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    // POST method save instance of item
    /*
     * @Param is the item to be saved
     * @Return the persisted item
     */
    public Item saveItem(Item item){
        return itemRepo.save(item);
    }
}
