package com.example.testresultinvoker.service.impl;

import com.example.testresultinvoker.service.UploadTestResultService;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class UploadTestResultServiceImpl implements UploadTestResultService {

    @Override
    public void upload(String path, String login, String password) {
        NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication("", login, password);
        InputStream in;
        try {
            SmbFile smbFile = new SmbFile(path, auth);
            if (smbFile.exists()) {
                in = smbFile.getInputStream();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
