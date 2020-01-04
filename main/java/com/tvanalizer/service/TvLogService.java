package com.tvanalizer.service;

import com.tvanalizer.domain.TvLog;
import com.tvanalizer.repository.TvLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TvLogService {

    private TvLogRepository repository;

    @Autowired
    public TvLogService(TvLogRepository repository) {
        this.repository = repository;
    }

    public TvLog loadDataFromFileToDb(String path) {
        return repository.loadDataFromFileToDb(path);
    }

    public TvLog loadSortedDataFromDbToFile(String path) {
        return repository.loadSortedDataFromDbToFile(path);
    }
}
