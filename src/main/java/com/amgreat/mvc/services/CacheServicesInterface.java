package com.amgreat.mvc.services;

import com.amgreat.mvc.vo.AttributeVO;
import com.amgreat.mvc.vo.ListVO;
import com.amgreat.mvc.vo.PageVO;

public interface CacheServicesInterface {
	public AttributeVO cacheIt(AttributeVO vo);
	public ListVO cacheIt(ListVO vo);
	public PageVO cacheIt(PageVO vo);
}
