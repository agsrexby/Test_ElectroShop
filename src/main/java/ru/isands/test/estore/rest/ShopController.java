package ru.isands.test.estore.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.isands.test.estore.dao.entity.Shop;
import ru.isands.test.estore.dao.service.ShopServiceImpl;
import java.util.List;


@RestController
@RequestMapping("/rest/admin-ui/shops")
@RequiredArgsConstructor
public class ShopController {

    private final ShopServiceImpl shopService;

    @GetMapping
    public List<Shop> getAll() {
        return shopService.findAll();
    }
}
