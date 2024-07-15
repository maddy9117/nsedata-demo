package com.maddy.nsedata_demo;

import org.springframework.data.repository.CrudRepository;

public interface SecRepository extends CrudRepository<SecData, Integer> {
    Iterable<SecData> findDataBySymbol(String sec);

   

    Iterable<SecData> findDataByDATE1(String date);
}
