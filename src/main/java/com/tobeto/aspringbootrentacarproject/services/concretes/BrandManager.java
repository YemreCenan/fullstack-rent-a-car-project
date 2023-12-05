package com.tobeto.aspringbootrentacarproject.services.concretes;

import com.tobeto.aspringbootrentacarproject.entities.Brand;
import com.tobeto.aspringbootrentacarproject.repositories.BrandRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.BrandService;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    private BrandManager (BrandRepository brandRepository){
        this.brandRepository =brandRepository;

    }

    @Override
    public void add(AddBrandRequest request) {
        if (request.getName().length()<3){
            throw new RuntimeException("The brand name cannot be less than 3 characters.");
        }
        Brand brand = new Brand();
        brand.setName(request.getName());
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest request) {
        Brand brandToUpdate=brandRepository.findById(request.getId()).orElseThrow();
        brandToUpdate.setName(request.getName());
        brandRepository.save(brandToUpdate);

    }

    @Override
    public void delete(DeleteBrandRequest request) {
        Brand brandToDelete = brandRepository.findById(request.getId()).orElseThrow();
        brandRepository.delete(brandToDelete);

    }

    @Override
    public List<Brand> getAll() {
        List<Brand> brandList = brandRepository.findAll();
        return brandList;
    }

    @Override
    public Brand getById(int id) {
        Brand brand = brandRepository.findById(id).orElseThrow();
        return brand;
    }

    @Override
    public List<GetListBrandResponse> getByNameDto(String name) {
        return brandRepository.findByName(name)
                .stream().
                filter((brand)->brand.getName().length()<4).toList();

    }


}
