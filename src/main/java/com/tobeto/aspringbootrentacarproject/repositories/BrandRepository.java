package com.tobeto.aspringbootrentacarproject.repositories;

import com.tobeto.aspringbootrentacarproject.entities.Brand;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer>
{

    @Query("Select new com.tobeto.aspringbootrentacarproject.services.dtos.brand.responses.GetListBrandResponse(b.id, b.name) " +
            "FROM Brand b WHERE b.name= :name")

    List<GetListBrandResponse> findByName(String name);
}
