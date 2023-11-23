package com.tobeto.aspringbootrentacarproject.services.concrtes;

import com.tobeto.aspringbootrentacarproject.entities.CurrentOffice;
import com.tobeto.aspringbootrentacarproject.repositories.CurrentOfficeRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CurrentOfficeService;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.AddCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.DeleteCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.UpdateCurrentOfficeRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrentOffceMenager implements CurrentOfficeService {



    private CurrentOfficeRepository currentOfficeRepository;
    public CurrentOffceMenager(CurrentOfficeRepository currentOfficeRepository) {
        this.currentOfficeRepository = currentOfficeRepository;
    }




    @Override
    public void add(AddCurrentOfficeRequest request) {
      CurrentOffice currentOffice = new CurrentOffice();
      currentOffice.setOfficeStreet(request.getOfficeStreet());
      currentOffice.setOfficeNumber(request.getOfficeNumber());
      currentOffice.setOfficeCity(request.getOfficeCity());
      currentOffice.setOfficeCountry(request.getOfficeCountry());
      currentOffice.setOfficeState(request.getOfficeState());
      currentOfficeRepository.save(currentOffice);
    }

    @Override
    public void delete(DeleteCurrentOfficeRequest request) {
     CurrentOffice deleteToCurrentOffice=currentOfficeRepository.findById(request.getId()).orElseThrow();
     currentOfficeRepository.delete(deleteToCurrentOffice);
    }

    @Override
    public void update(UpdateCurrentOfficeRequest request) {
        CurrentOffice updateToCurrOffice= currentOfficeRepository.findById(request.getId()).orElseThrow();
        updateToCurrOffice.setOfficeStreet(request.getOfficeStreet());
        updateToCurrOffice.setOfficeNumber(request.getOfficeNumber());
        updateToCurrOffice.setOfficeCity(request.getOfficeCity());
        updateToCurrOffice.setOfficeCountry(request.getOfficeCountry());
        updateToCurrOffice.setOfficeState(request.getOfficeState());
        currentOfficeRepository.save(updateToCurrOffice);
    }

    @Override
    public List<CurrentOffice> getAll() {
        List<CurrentOffice> currentOfficeList=currentOfficeRepository.findAll();
        return currentOfficeList;
    }

    @Override
    public CurrentOffice getById(int id) {
        CurrentOffice currentOffice = currentOfficeRepository.findById(id).orElseThrow();
        return currentOffice;
    }
}
