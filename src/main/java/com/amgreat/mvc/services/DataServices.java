package com.amgreat.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter;

import com.amgreat.mvc.vo.RecordVO;
import com.amgreat.mvc.vo.RequestVO;
import com.amgreat.mvc.vo.StatusVO;
import com.amgreat.mvc.vo.AttributeVO;


@Component
public class DataServices implements DataServicesInterface {
	
	@Value("${integrator.uri}")
	private String integratorUri;
	
	public RecordVO callCmd(RequestVO req) {
		RecordVO r = new RecordVO();
		return r;
	}
	
	@Bean
	public RestTemplate restTemplateAPI() {
	    return new RestTemplate();
	}
	
	public RecordVO callData( RequestVO request ) {		
		RecordVO r = new RecordVO();
		StatusVO st = new StatusVO();
		AttributeVO req = recordVO2AttributeVO( request );
		try {
			
			if ( request != null ) {
				
				r = restTemplateAPI().postForObject( integratorUri, request, RecordVO.class );
				
				if ( r == null || r.getResponse() == null ) {
					st.setCode("200"); st.setDescription("No record found!"); r.setStatus( st );
				}
            }
		} catch (Exception e) {
			st.setCode("404"); st.setDescription("Error!"); r.setStatus( st );
		}
		return r;
	}
	
	public AttributeVO recordVO2AttributeVO( RequestVO request ) {
		
		AttributeVO rq = new AttributeVO();
		
		if( request != null && request.getPageId() != null && !request.getPageId().trim().equals("") ) {
			rq.setId( request.getPageId() ); return rq;
		}
		return null;
	}
}