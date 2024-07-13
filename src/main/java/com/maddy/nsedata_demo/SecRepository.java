package com.maddy.nsedata_demo;

import org.springframework.data.repository.CrudRepository;

public interface SecRepository extends CrudRepository<SecData, Integer>{
    SecData findBySymbol(String sec);
}
