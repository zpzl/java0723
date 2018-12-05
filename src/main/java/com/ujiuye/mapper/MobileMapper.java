package com.ujiuye.mapper;

import java.util.List;

import com.ujiuye.bean.Mobile;

public interface MobileMapper {
	public boolean saveMobile(List<Mobile> list);

	public Mobile search(String mobileNumber);

}
