package com.amgreat.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amgreat.mvc.services.CacheServicesInterface;
import com.amgreat.mvc.vo.AttributeVO;
import com.amgreat.mvc.vo.ListVO;
import com.amgreat.mvc.vo.PageVO;
import com.amgreat.mvc.vo.RecordVO;
import com.amgreat.mvc.vo.RequestVO;

@RestController
public class FECacheController {
	@Autowired private CacheServicesInterface cacheAPI;

	@RequestMapping(value = "/amgreate/api/attribute", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AttributeVO callCmdAttribute( @RequestBody RequestVO request ) {
		AttributeVO r = null;
		try {
			if( request != null && request.getPageId() != null && !request.getPageId().trim().equals("")) {
				
				request.setCmdString("s"); AttributeVO req = new AttributeVO(); req.setCmdName("s"); req.setId( request.getPageId());
				
				r = cacheAPI.cacheIt( req );
			}
		} catch (Exception e) {
			System.out.println("[FECacheController.callCmdAttribute]:" + e.getMessage());
		}
		return r; 
	}
	
	@RequestMapping(value = "/amgreate/api/page", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PageVO callCmdPage( @RequestBody RequestVO request ) {
		PageVO r = null;
		try {
			if( request != null && request.getPageId() != null && !request.getPageId().trim().equals("")) {
				
				request.setCmdString("s"); PageVO req = new PageVO(); req.setCmdName("s"); req.setId( request.getPageId());
				
				r = cacheAPI.cacheIt( req );
			}
		} catch (Exception e) {
			System.out.println("[FECacheController.callCmdPage]:" + e.getMessage());
		}
		return r; 
	}
	
	@RequestMapping(value = "/amgreate/api/list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ListVO callCmd( @RequestBody RequestVO request ) {
		ListVO r = null;
		try {
			if( request != null && request.getPageId() != null && !request.getPageId().trim().equals("")) {
				
				request.setCmdString("s"); ListVO req = new ListVO(); req.setCmdName("s"); req.setId( request.getPageId());
				
				r = cacheAPI.cacheIt( req );
			}
		} catch (Exception e) {
			System.out.println("[FECacheController.callCmd]:" + e.getMessage());
		}
		return r; 
	}
	
}
