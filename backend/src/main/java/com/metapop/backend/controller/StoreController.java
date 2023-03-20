package com.metapop.backend.controller;

import com.metapop.backend.dto.StoreSaveDTO;
import com.metapop.backend.dto.TokenDTO;
import com.metapop.backend.entity.Store;
import com.metapop.backend.repository.UserRepository;
import com.metapop.backend.service.StoreService;
import com.metapop.backend.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "store", description = "상점 API")
@RestController
@RequestMapping("stores")
@CrossOrigin(origins = "*")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @Operation(summary = "", description = "상점 등록 API")
    @PostMapping("/register")
    public String registration(@RequestBody StoreSaveDTO storeSaveDTO) {
        return storeService.registration(storeSaveDTO);
    }

    @Operation(summary = "", description = "상점 삭제 API")
    @DeleteMapping("/remove/{user_id}")
    public String delete(@PathVariable Long user_id, @RequestBody TokenDTO tokenDTO) {
        return storeService.delete(user_id, tokenDTO);
    }
}
