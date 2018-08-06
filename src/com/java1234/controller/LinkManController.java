package com.java1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java1234.entity.LinkMan;
import com.java1234.service.LinkManService;
import com.java1234.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * ��ϵ��Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/linkMan")
public class LinkManController {
	
	@Resource
	private LinkManService linkManService;
	
	 
	/**
	 * ��ҳ������ѯ��ϵ��
	 * @param page
	 * @param rows
	 * @param s_linkMan
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="cusId",required=false)String cusId,HttpServletResponse response)throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("cusId", cusId);
		List<LinkMan> linkManList=linkManService.find(map);
		JSONObject result=new JSONObject();
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.setExcludes(new String[]{"customer"});
		JSONArray jsonArray=JSONArray.fromObject(linkManList,jsonConfig);
		result.put("rows", jsonArray);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ��ӻ����޸���ϵ��
	 * @param linkMan
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(LinkMan linkMan,HttpServletResponse response)throws Exception{
		int resultTotal=0; // �����ļ�¼����
		if(linkMan.getId()==null){
			resultTotal=linkManService.add(linkMan);
		}else{
			resultTotal=linkManService.update(linkMan);
		}
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ɾ����ϵ��
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id")String id,HttpServletResponse response)throws Exception{
		linkManService.delete(Integer.parseInt(id));
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	
	
}
