package com.pluralsight.dao;

import com.pluralsight.model.Student;

public interface RegistrationDAO {
        public Long persistStudent(com.pluralsight.model.Student student);
        public com.pluralsight.model.Student findById(Long id);
    }

