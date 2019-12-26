package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.QnADto;
import com.spring.service.QnAService;

@RestController
@CrossOrigin
public class QnAController {
	
	@Autowired
	private QnAService qservice;
	
	
	@RequestMapping("/qnaboard/list")
	public List<QnADto> getAllDatas()
	{
		System.out.println("react>>list");
		return qservice.getAllDatas();
	}
	
	@RequestMapping("/qnaboard/write")
	public void insertData(@RequestBody QnADto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		qservice.insertData(dto);
			
	}
	
	@RequestMapping(value="/qnaboard/delete", method=RequestMethod.GET)
	public void deleteData(@RequestParam int num)
	{
		System.out.println("react>>delete"+num);
		
		qservice.deleteData(num);
	}
	
	@RequestMapping(value="/qnaboard/select", method=RequestMethod.GET)
	public QnADto getData(@RequestParam int num)
	{
		System.out.println("react>>select>>" + num);
		
		qservice.updateReadCount(num); // 조회수 증가
		return qservice.getData(num);
	}

}