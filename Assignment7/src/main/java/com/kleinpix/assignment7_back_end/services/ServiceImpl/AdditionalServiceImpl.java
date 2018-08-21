/*
package com.kleinpix.assignment7_back_end.services.ServiceImpl;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
/*
import com.kleinpix.assignment7_back_end.model.Additional;
import com.kleinpix.assignment7_back_end.repositories.AdditionalRepository;
//import com.kleinpix.assignment7_back_end.repositories.RepositoryImpl.AdditionalRepositoryImpl;
import com.kleinpix.assignment7_back_end.services.AdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AdditionalServiceImpl implements AdditionalService {

    @Autowired
    private AdditionalRepository additionalRepository;

    @Override
    public Additional create(Additional additional){

        return additionalRepository.save(additional);
    }
    @Override
    public Optional<Additional> read(String id){

        return additionalRepository.findById(id);
    }
    @Override
    public Additional update(Additional additional){

        return additionalRepository.save(additional);
    }
    @Override
    public void delete(String id){

        additionalRepository.deleteById(id);
}


    @Override
    public Iterable<Additional> findAll(){

        return additionalRepository.findAll();
    }
    /*@Override
    public Iterable<Additional> findById (String id){

        return additionalRepository.findBy(id);
    }*/
/*
    @Override
    public Iterable<Additional> findByNumberOfPrints (String numberOfPrints){

        return additionalRepository.findByNumberOfPrints(numberOfPrints);
    }
    @Override
    public Iterable<Additional> findByPhotobookSize (String photobookSize){

        return additionalRepository.findByPhotobookSize(photobookSize);
    }
    @Override
    public Iterable<Additional> findByPhotoboothPackage (String photobooothPackage){

        return additionalRepository.findByPhotoboothPackage(photobooothPackage);
    }
    @Override
    public Additional findbyIdAndNumberOfPrintsAndPhotobookSizeAndPhotoboothPackage (String id, String numberOfPrints, String photobookSize, String photoboothPackage){

        return additionalRepository.findbyIdAndNumberOfPrintsAndPhotobookSizeAndPhotoboothPackage (id, numberOfPrints, photobookSize, photoboothPackage);
    }
}
*/
/*
@Component
public class AdditionalServiceImpl implements AdditionalService {

    @Autowired
    private AdditionalRepository additionalRepository;

    @Override
    public Additional create(Additional additional){
        return additionalRepository.save(additional);
    }
    @Override
    public Additional read(String id){
        return additionalRepository.read(id);
    }
    @Override
    public Additional update(Additional additional){
        return additionalRepository.save(additional);
    }
    @Override
    public void delete(String id){
        additionalRepository.delete(id);
    }




}
/*

 private static AdditionalServiceImpl service = null;

    AdditionalRepository repository = (AdditionalRepository) AdditionalRepositoryImpl.getInstance();

    public static AdditionalServiceImpl getInstance(){
        if(service == null)
            service = new AdditionalServiceImpl();

        return service;
    }

    public Additional create(Additional additional){
        return repository.create(additional);
    }

    public Additional read(String id){
    return repository.read(id);
}

    public Additional update(Additional additional){
        return repository.update(additional);
    }

    public void delete(String id){
        repository.delete(id);
    }
 */