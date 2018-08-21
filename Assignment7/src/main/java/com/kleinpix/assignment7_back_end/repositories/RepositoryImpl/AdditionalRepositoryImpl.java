/*
package com.kleinpix.assignment7_back_end.repositories.RepositoryImpl;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
/*
import com.kleinpix.assignment7_back_end.model.Additional;
import com.kleinpix.assignment7_back_end.repositories.AdditionalRepository;

import java.util.HashMap;
import java.util.Map;

public class AdditionalRepositoryImpl implements AdditionalRepository {

    private static AdditionalRepositoryImpl repository = null;

    private Map<String, Additional> additionalTable;

    private AdditionalRepositoryImpl(){
        additionalTable = new HashMap<String, Additional>();
    }

    public static AdditionalRepositoryImpl getInstance(){
        if(repository == null)
            repository = new AdditionalRepositoryImpl();

        return repository;
    }

    public Additional create(Additional additional){
        additionalTable.put(additional.getId(),additional);
        Additional savedAdditional = additionalTable.get(additional.getId());
        return savedAdditional;
    }

    public Additional read(String id){
        Additional additional = additionalTable.get(id);
        return additional;
    }

    public Additional update(Additional additional){
        additionalTable.put(additional.getId(),additional);
        Additional savedAdditional = additionalTable.get(additional.getId());
        return savedAdditional;
    }

    public void delete(String id){
        additionalTable.remove(id);
    }
}
*/