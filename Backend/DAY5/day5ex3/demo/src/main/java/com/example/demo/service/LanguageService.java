package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepo;

@Service
public class LanguageService {
    private LanguageRepo languageRepo;
    public LanguageService(LanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(Language language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Language> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,Language language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public Language getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
