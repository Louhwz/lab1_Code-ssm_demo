package com.louhwz.service;

import com.louhwz.pojo.PageBean;
import com.louhwz.pojo.Student;

/**
 * StudentService继承了BaseService，不需要再添加其他方法
 */
public interface StudentService extends BaseService<Student> {
    /**
     * 分页查询
     *
     * @param student
     * @param pageCode
     * @param pageSize
     * @return
     */
    PageBean findByPage(Student student, int pageCode, int pageSize);
}
