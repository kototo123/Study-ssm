package com.kototo.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopService {

    @Autowired
    private StudentsService studentsService;
    @Transactional
    public void change() {
        studentsService.changeAge();
        studentsService.changeName();
    }
}
