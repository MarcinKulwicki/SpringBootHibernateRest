package com.marcinkulwicki.testSpringBoot.service;

import com.marcinkulwicki.testSpringBoot.DTO.ParentDTO;
import com.marcinkulwicki.testSpringBoot.entity.Parent;
import com.marcinkulwicki.testSpringBoot.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParentService {

    @Autowired
    ParentRepository parentRepository;

    public ParentDTO getParentById(Long id){
        Parent parent = parentRepository.getOne(id);
        ParentDTO parentDTO = convertToDTO(parent);
        return parentDTO;
    }


    public ParentDTO convertToDTO(Parent parent){
        ParentDTO parentDTO = new ParentDTO();

        parentDTO.setId(parent.getId());
        parentDTO.setAge(parent.getAge());
        parentDTO.setName(parent.getName());

        return parentDTO;
    }
}
