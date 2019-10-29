package com.rhapsodyman.springrest.controller;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rhapsodyman.springrest.model.Symbol;

import io.swagger.annotations.ApiOperation;
 
@RestController
public class SymbolsResultsController {
 
    private static String response = "[{\"symbol\":\"AAPL\",\"description\":\"AAPL description\",\"price\":6.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"GOOG\",\"description\":\"GOOG description\",\"price\":9.0},{\"symbol\":\"AA\",\"description\":\"AA description\",\"price\":9.0},{\"symbol\":\"BB\",\"description\":\"BB description\",\"price\":9.0},{\"symbol\":\"CC\",\"description\":\"CC description\",\"price\":9.0},{\"symbol\":\"DD\",\"description\":\"DD description\",\"price\":9.0},{\"symbol\":\"EE\",\"description\":\"EE description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0},{\"symbol\":\"MSFT\",\"description\":\"MSFT description\",\"price\":9.0}]";
    
 
    @ApiOperation(value = "Add a product")
    @CrossOrigin(origins = "*")
	@RequestMapping(value = "/results", method = RequestMethod.GET,  produces = "application/json")
	public ResponseEntity<List<Symbol>> listAllUsers() throws JsonParseException, JsonMappingException, IOException {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Symbol[] pojos = mapper.readValue(response, Symbol[].class);
    	
    	List<Symbol> myList = new ArrayList<>(Arrays.asList(pojos));
    	List<Symbol> subList = myList.subList(0, new Random().nextInt(myList.size()));
		return new ResponseEntity<List<Symbol>>(subList, HttpStatus.OK);
	}
}