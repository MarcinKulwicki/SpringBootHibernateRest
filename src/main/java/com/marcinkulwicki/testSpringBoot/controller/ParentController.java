package com.marcinkulwicki.testSpringBoot.controller;


import com.marcinkulwicki.testSpringBoot.DTO.ParentDTO;
import com.marcinkulwicki.testSpringBoot.repository.ParentRepository;
import com.marcinkulwicki.testSpringBoot.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/parent")
@RestController
public class ParentController {

    @Autowired
    ParentService parentService;

    @GetMapping("/")
    public ParentDTO showParent(){
        ParentDTO parentDTO = parentService.getParentById(1L);
        return parentDTO;
    }
}
