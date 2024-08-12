package com.kototo.spring.tx.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentsService {
    @Autowired
    private StudentsDao studentsDao;

    public void changeInfo() {
        studentsDao.updateAgeById(124244, 2);
        System.out.println("-----------");
//        int a = 10/0;
        studentsDao.updateNameById("tes2t1", 2);
    }
}
