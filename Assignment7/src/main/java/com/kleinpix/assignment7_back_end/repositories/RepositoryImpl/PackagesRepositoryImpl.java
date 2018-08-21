/*
package com.kleinpix.assignment7_back_end.repositories.RepositoryImpl;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
/*
import com.kleinpix.assignment7_back_end.model.Packages;

import java.util.HashMap;
import java.util.Map;

public class PackagesRepositoryImpl {

    private static PackagesRepositoryImpl repository = null;

    private Map<String, Packages> packagesTable;

    private PackagesRepositoryImpl(){
        packagesTable = new HashMap<String, Packages>();
    }

    public static PackagesRepositoryImpl getInstance(){
        if(repository == null)
            repository = new PackagesRepositoryImpl();

        return repository;
    }

    public Packages create(Packages packages){
        packagesTable.put(packages.getId(),packages);
        Packages savedPackages = packagesTable.get(packages.getId());
        return savedPackages;
    }

    public Packages read(String id){
        Packages packages = packagesTable.get(id);
        return packages;
    }

    public Packages update(Packages packages){
        packagesTable.put(packages.getId(),packages);
        Packages savedPackages = packagesTable.get(packages.getId());
        return savedPackages;
    }

    public void delete(String id){

        packagesTable.remove(id);
    }
}
*/