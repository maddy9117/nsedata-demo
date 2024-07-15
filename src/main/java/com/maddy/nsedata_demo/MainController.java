package com.maddy.nsedata_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@CrossOrigin
@RequestMapping("/api/")
public class MainController {
    @Autowired
    private SecRepository secRepository;

    @Autowired
    private SymbolRepository symbolRepository;

    @GetMapping("/securities/symbol/{symbol}")
    public @ResponseBody SymbolData findBySymbol(@PathVariable("symbol") String sym) {
        return symbolRepository.findBySymbol(sym);
    }

    @GetMapping("/securities/all")
    public @ResponseBody List<SymbolData> findAll() {
        return symbolRepository.findAll();
    }

    @GetMapping(path = "/bhavdata/all")
    public @ResponseBody Iterable<SecData> getData() {
        return secRepository.findAll();
    }

    @GetMapping("/bhavdata/symbol/{symbol}")
    public @ResponseBody Iterable<SecData> findDataBySec(@PathVariable("symbol") String sym) {
        return secRepository.findDataBySymbol(sym);
    }

    @GetMapping("/bhavdata/date/{date}")
    public @ResponseBody Iterable<SecData> findDataByDate(@PathVariable("date") String date) {
        return secRepository.findDataByDATE1(date);
    }

    @GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
