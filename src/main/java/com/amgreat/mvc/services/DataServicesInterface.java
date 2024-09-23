package com.amgreat.mvc.services;

import com.amgreat.mvc.vo.RecordVO;
import com.amgreat.mvc.vo.RequestVO;

public interface DataServicesInterface {
	public RecordVO callCmd(RequestVO req);
	public RecordVO callData(RequestVO req);
}
