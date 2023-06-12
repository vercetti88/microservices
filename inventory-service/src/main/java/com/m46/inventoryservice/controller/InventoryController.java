package com.m46.inventoryservice.controller;


import com.m46.inventoryservice.repository.InventoryRepository;
import com.m46.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam(name = "skuCode") String code) {
        return inventoryService.isInStock(code);
    }



}
