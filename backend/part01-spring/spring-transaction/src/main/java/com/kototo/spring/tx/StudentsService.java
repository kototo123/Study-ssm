package com.kototo.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
@Transactional
public class StudentsService {
    @Autowired
    private StudentsDao studentsDao;

    public void changeInfo() {
        studentsDao.updateAgeById(124244,1);
        System.out.println("-----------");

//        try {
//            Thread.sleep(3100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        new FileInputStream("F:\\a.txt");

//        int i = 10/0;
        studentsDao.updateNameById("tes2t1",1);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeName() {
        studentsDao.updateNameById("13214",1);
        int a = 10/0;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeAge() {
        studentsDao.updateAgeById(25,1);
    }
    @Transactional(readOnly = true)
    public void selectInfo() {}
    public void deleteInfo() {}
}
