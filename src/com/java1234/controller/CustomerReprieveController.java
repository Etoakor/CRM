package com.java1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java1234.entity.CustomerReprieve;
import com.java1234.service.CustomerReprieveService;
import com.java1234.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * �ͻ���ʧ�ݻ���ʩController��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/customerReprieve")
public class CustomerReprieveController {
	
	@Resource
	private CustomerReprieveService customerReprieveService;
	
	 
	/**
	 * ��ҳ������ѯ�ͻ���ʧ�ݻ���ʩ
	 * @param page
	 * @param rows
	 * @param s_customerReprieve
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="lossId",required=false)String lossId,HttpServletResponse response)throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("lossId", lossId);
		List<CustomerReprieve> customerReprieveList=customerReprieveService.find(map);
		JSONObject result=new JSONObject();
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.setExcludes(new String[]{"customerLoss"});
		JSONArray jsonArray=JSONArray.fromObject(customerReprieveList,jsonConfig);
		result.put("rows", jsonArray);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ��ӻ����޸Ŀͻ���ʧ�ݻ���ʩ
	 * @param customerReprieve
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(CustomerReprieve customerReprieve,HttpServletResponse response)throws Exception{
		int resultTotal=0; // �����ļ�¼����
		if(customerReprieve.getId()==null){
			resultTotal=customerReprieveService.add(customerReprieve);
		}else{
			resultTotal=customerReprieveService.update(customerReprieve);
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
	 * ɾ���ͻ���ʧ�ݻ���ʩ
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id")String id,HttpServletResponse response)throws Exception{
		customerReprieveService.delete(Integer.parseInt(id));
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	
	
}
