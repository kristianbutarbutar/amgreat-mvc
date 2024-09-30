package com.amgreat.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amgreat.mvc.services.DataServicesInterface;
import com.amgreat.mvc.services.UtilityServices;
import com.amgreat.mvc.vo.RecordVO;
import com.amgreat.mvc.vo.RequestVO;
import com.amgreat.mvc.vo.StringVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class FERestController {
	
	@Autowired private DataServicesInterface integratorAPI;
	
	private void printStringVO(StringVO vo) {
		if(vo!=null && vo.getRows()!=null) {
			for(int i=0; i<vo.getRows().length; i++) {
				System.out.println("["+i+"] = " + vo.getRows()[i].getRow());
			}
		} else System.out.println(" vo.getRows is null ");
	}
	
	@RequestMapping(value = "/amgreate/api/int/fe", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StringVO callCmd( @RequestBody RequestVO request ) {
		RecordVO r = null; StringVO respond = new StringVO();
		try {
			if( request != null && request.getPageId() != null && !request.getPageId().trim().equals("") ) {
				
				request.setCmdString("s");  r = integratorAPI.callData( request );
				
				//respond = new UtilityServices().wrapSelectively( r );
				
				respond = r.getRecordsInString();
				respond.setCode("200");
				//this.printStringVO( respond );
				/*
				if ( respond != null ) {
					ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
					String json = ow.writeValueAsString( respond );
	                System.out.println("JSON: " + json );
				}*/
			}
		} catch (Exception e) {
			System.out.println("[FERestController.callCmd]:" + e.getMessage());
			respond.setCode("400"); respond.setDescription( e.getMessage() );
		}
		return respond;
	}
}
