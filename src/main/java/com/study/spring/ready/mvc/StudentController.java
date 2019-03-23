package com.study.spring.ready.mvc;

public class StudentController {
    private StudenService studenService;

    public StudenService getStudenService() {
        return studenService;
    }

    public void setStudenService(StudenService studenService) {
        this.studenService = studenService;
    }

    public void saveStudent(){
        this.studenService.saveStuden();
    }
}
