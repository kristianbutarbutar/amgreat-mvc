package com.amgreat.mvc.services;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.stereotype.Component;

import com.amgreat.mvc.vo.RecordVO;
import com.amgreat.mvc.vo.ResponseVO;
import com.amgreat.mvc.vo.StringVO;
import com.amgreat.mvc.vo.Columns;
import com.amgreat.mvc.vo.Record;

@Component
public class UtilityServices {
	
	public StringVO wrapSelectively( RecordVO vo ) {
		StringVO r = new StringVO();
		try {
			if( vo != null && vo.getResponse()!= null ) {
				
				RecordVO rv = vo;
				
				ResponseVO columns = rv.getResponse();
				
				Record record = new Record(); Record rr = record ; int idx = 0 ;
				
				StringVO[] rows = new StringVO[ vo.getRecNo() ];
				
				while( rv != null ) {
										
					rows[idx] = this.setRow( rv.getResponse() ) ; 
					
					rv = rv.getNext(); idx++;
				}
				
				r.setRows(rows);
			}
		} catch (Exception e) {
			System.out.println("[UtilityServices.wrapSelectively] : " + e.getMessage() );
		}
		return r;
	}
	
	private StringVO setRow( ResponseVO vo ) {
		StringVO rvo = new StringVO(); String r = "";
		if( vo != null ) {

			ResponseVO tvo = vo; int i=0;
			
			while( tvo != null ) {
				r +=  ( tvo.getName() != null ? "\""+ tvo.getName().trim() + "\"": "\" \"" ) + ":" + ( tvo.getVal() !=null ?  "\""+ tvo.getVal().trim() + "\"" : "\" \"" ) + ",";
				tvo = tvo.getNext();
			}
			r = "{" + r.substring(0, ( r.length() - 1) ) + "}";
			rvo.setRow( r );
		}
		return rvo;
	}	
}
