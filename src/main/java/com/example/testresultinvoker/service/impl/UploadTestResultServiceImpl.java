package com.example.testresultinvoker.service.impl;

import com.example.testresultinvoker.service.UploadTestResultService;
import org.springframework.stereotype.Service;

@Service
public class UploadTestResultServiceImpl implements UploadTestResultService {

    @Override
    public void upload(String path) {
        String pathToDir = path;
    }
}
