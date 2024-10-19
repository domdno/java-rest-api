package com.rest.crud_api.repo;

import com.rest.crud_api.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {

}
