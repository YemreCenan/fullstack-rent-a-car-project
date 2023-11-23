package com.tobeto.aspringbootrentacarproject.controllers;


import com.tobeto.aspringbootrentacarproject.entities.Brand;
import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.repositories.BrandRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.BrandService;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.UpdateBrandRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
   private BrandService brandServices;

   public BrandsController(BrandService brandService){
      this.brandServices=brandService;
   }



   @GetMapping("getAll")
   public List<Brand> getAll() {
      return brandServices.getAll();
   }

   @GetMapping("/{id}")
   public Brand getById(@PathVariable int id) {
      return brandServices.getById(id);
   }
   @PostMapping("/add/")
   public void add(@RequestBody AddBrandRequest request){
      brandServices.add(request);

   }
   @DeleteMapping("/delete/")
   public void delete(@RequestBody DeleteBrandRequest request){
      brandServices.delete(request);

   }
   @PutMapping("/update/")
   public void update(@RequestBody UpdateBrandRequest request){
      brandServices.update(request);

   }


}
