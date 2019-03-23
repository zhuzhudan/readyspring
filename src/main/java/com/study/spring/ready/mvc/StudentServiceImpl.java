package com.study.spring.ready.mvc;

public class StudentServiceImpl implements StudenService {
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void saveStuden() {
        this.studentDao.saveStuden();
    }
}
