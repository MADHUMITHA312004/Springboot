package com.example.demo.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Children;
import com.example.demo.repository.ChildrenRepo;

@Service
public class ChildrenService {
    private ChildrenRepo childrenRepo;

    public ChildrenService(ChildrenRepo childrenRepo) {
        this.childrenRepo = childrenRepo;
    }
    // public boolean saveChildren(Children children)
    // {
    //      try {
    //          childrenRepo.save(children);
             
    //      }
    //       catch (Exception e) {
    //         return false;
    //      }
    //      return true;
    // }
    public Children saveChildren(Children children)
    {
        return childrenRepo.save(children);
    }
    public List<Children> getChildren(String field){
        return childrenRepo.findAll(Sort.by(field));
    }
    public Page<Children> paginationChildren(int offset,int pagesize){
        return childrenRepo.findAll(PageRequest.of(offset,pagesize));
    }
    public Page<Children> pageSortChildren(int offset,int pagesize,String field){
        PageRequest pageRequest=PageRequest.of(offset, pagesize , Sort.by(field));
        return childrenRepo.findAll(pageRequest);
    }
}
    

