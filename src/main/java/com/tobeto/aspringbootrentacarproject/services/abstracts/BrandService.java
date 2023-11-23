package com.tobeto.aspringbootrentacarproject.services.abstracts;

import com.tobeto.aspringbootrentacarproject.entities.Brand;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.UpdateBrandRequest;

import java.util.List;

public interface BrandService {

    void add(AddBrandRequest request);
    void update(UpdateBrandRequest request);

    void delete(DeleteBrandRequest request);

   List<Brand> getAll();
   Brand getById(int id);


}
