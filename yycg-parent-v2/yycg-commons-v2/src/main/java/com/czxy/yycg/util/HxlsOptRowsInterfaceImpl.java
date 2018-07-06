package com.czxy.yycg.util;

import java.util.List;

/**
 * 测试导入数据接口
 * @author lt
 *
 */
public class HxlsOptRowsInterfaceImpl implements HxlsOptRowsInterface {

	@Override
	public String saveOptRows(int sheetIndex, int curRow, List<String> rowlist)
			throws Exception {
		//插入数据库
		//System.out.println("sheetIndex="+sheetIndex+"curRow="+curRow+rowlist);
		
		String rString = rowlist.get(3);
		System.out.println(rString);
		if(rString == null){
			return "xxx药品信息已经存在";
		}
		
		
		return "success";
	}
	
}
