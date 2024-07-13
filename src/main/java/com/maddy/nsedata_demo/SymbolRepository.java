package com.maddy.nsedata_demo;

import java.util.List;

public interface SymbolRepository extends ReadOnlySymbolDataRepository<SymbolData, Integer> {

    SymbolData findBySymbol(String sec);

    List<SymbolData> findAll();

}
