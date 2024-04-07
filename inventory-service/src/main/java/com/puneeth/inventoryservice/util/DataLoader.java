package com.puneeth.inventoryservice.util;

import com.puneeth.inventoryservice.model.Inventory;
import com.puneeth.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final InventoryRepository inventoryRepository;
    @Override
    public void run(String... args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.setSkuCode("iphone_13");
        inventory.setQuantity(100);

        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("iphone_13_yellow");
        inventory1.setQuantity(1);

        inventoryRepository.save(inventory);
        inventoryRepository.save(inventory1);
    }
}
