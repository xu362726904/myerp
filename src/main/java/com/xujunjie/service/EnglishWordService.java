package com.xujunjie.service;

import com.xujunjie.dao.EnglishWordDao;
import com.xujunjie.entity.EnglishWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnglishWordService {
    @Autowired
    private EnglishWordDao englishWordDao;

    public List<EnglishWord> findList(EnglishWord englishWord) {
        return englishWordDao.findList(englishWord);
    }
}
