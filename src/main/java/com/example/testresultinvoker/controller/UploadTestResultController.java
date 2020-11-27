package com.example.testresultinvoker.controller;

import com.example.testresultinvoker.service.UploadTestResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class UploadTestResultController {

    private final UploadTestResultService uploadTestResultService;

    @GetMapping(value = "/tests/path")
    public ModelAndView uploadForm() {
        return new ModelAndView("upload-form");
    }

    @PostMapping(value = "/tests/path")
    public ModelAndView upload(@RequestParam("path") String path) {
        ModelAndView view = new ModelAndView();
        uploadTestResultService.upload(path);
        view.setViewName("redirect:/index");
        return view;
    }
}
