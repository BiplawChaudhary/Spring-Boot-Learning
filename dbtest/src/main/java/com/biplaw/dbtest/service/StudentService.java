package com.biplaw.dbtest.service;

import com.biplaw.dbtest.dto.request.StudentRequestDto;
import com.biplaw.dbtest.dto.response.StudentResponseDto;

public interface StudentService {
    //uSer --data  -----> RequestDto
    //User<--- data <--- ResposnseDto

    StudentResponseDto saveStudent(StudentRequestDto std);
}
