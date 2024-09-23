package com.amgreat.mvc.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.amgreat.mvc.vo.AttributeVO;
import com.amgreat.mvc.vo.ListVO;
import com.amgreat.mvc.vo.PageVO;
import com.amgreat.mvc.vo.RecordVO;

@Component
public class CacheServices implements CacheServicesInterface {

	@Value("${int.attribute.uri}")
	private String intAttributeUri;
	
	@Value("${int.list.uri}")
	private String intListUri;
	
	@Value("${int.page.uri}")
	private String intPageUri;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	public AttributeVO cacheIt(AttributeVO vo) {
		AttributeVO r = null;
			try {
				if ( vo != null ) {
					r = restTemplate().postForObject( intAttributeUri, vo, AttributeVO.class );
	            }
			} catch (Exception e) {
				System.out.println("[CacheServices.cacheIt.AttributeVO] : " + e.getMessage() );
			}
			return r;
	}

	public ListVO cacheIt(ListVO vo) {
		ListVO r = null;
		try {
			if ( vo != null ) {
				r = restTemplate().postForObject( intListUri, vo, ListVO.class );
            }
		} catch (Exception e) {
			System.out.println("[CacheServices.cacheIt.ListVO] : " + e.getMessage() );
		}
		return r;
	}

	public PageVO cacheIt(PageVO vo) {
		PageVO r = null;
		try {
			if ( vo != null ) {
				r = restTemplate().postForObject( intPageUri, vo, PageVO.class );
            }
		} catch (Exception e) {
			System.out.println("[CacheServices.cacheIt.PageVO] : " + e.getMessage() );
		}
		return r;
	}
	
}
