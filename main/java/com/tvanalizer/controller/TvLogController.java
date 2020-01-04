package com.tvanalizer.controller;

import com.tvanalizer.domain.TvLog;
import com.tvanalizer.service.TvLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tvlog")
public class TvLogController {

    private TvLogService tvLogService;

    @Autowired
    public TvLogController(TvLogService tvLogService) {
        this.tvLogService = tvLogService;
    }

    @PutMapping("/fileupload")
    public TvLog loadDataFromFileToDb(@RequestParam("path") String path) {
        return tvLogService.loadDataFromFileToDb(path);
    }

    @GetMapping("/filedownload")
    public TvLog loadSortedDataFromDbToFile(@RequestParam("path") String path) {
        return tvLogService.loadSortedDataFromDbToFile(path);
    }
}
