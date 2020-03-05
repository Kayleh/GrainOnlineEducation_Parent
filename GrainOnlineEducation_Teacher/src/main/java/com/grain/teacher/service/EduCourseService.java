package com.grain.teacher.service;

import com.grain.teacher.entity.EduCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grain.teacher.entity.vo.CourseVo;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Dragon Wen
 * @since 2020-03-03
 */
public interface EduCourseService extends IService<EduCourse> {

    /**
     * 保存课程基本信息
     * @param courseVo
     * @return
     */
    String saveVo(CourseVo courseVo);

    /**
     *根据课程ID查询课程基本信息
     * @param id
     * @return
     */
    CourseVo getCourseVoById(String id);

    /**
     * 修改课程基本信息和描述
     * @param courseVo
     * @return
     */
    boolean updateCourseVo(CourseVo courseVo);
}
