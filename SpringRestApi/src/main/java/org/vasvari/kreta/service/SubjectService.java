package org.vasvari.kreta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vasvari.kreta.repo.interfaces.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;
}
