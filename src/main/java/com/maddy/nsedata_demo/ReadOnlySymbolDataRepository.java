package com.maddy.nsedata_demo;


import java.util.List;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface ReadOnlySymbolDataRepository<T, ID> extends Repository<T, ID> {
  

    List<T> findAll();

    SymbolData findBySymbol(String symbol);
}