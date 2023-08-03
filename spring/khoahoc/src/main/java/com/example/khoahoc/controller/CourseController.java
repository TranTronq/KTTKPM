package com.example.khoahoc.controller;

import com.example.khoahoc.entity.Course;
import com.example.khoahoc.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        try {
            return courseRepository.findById(id)
                    .orElseThrow(() -> new Exception("Course not found with id: " + id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/")
    public List<Course> getCourseAll() {
        try {
            return courseRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/")
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course courseData) {
        Course khoaHoc = null;
        try {
            khoaHoc = courseRepository.findById(id)
                    .orElseThrow(() -> new Exception("Course not found with id: " + id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        khoaHoc.setNameCourse(courseData.getNameCourse());
        khoaHoc.setNameTeacher(courseData.getNameTeacher());
        khoaHoc.setOldprice(courseData.getOldprice());
        khoaHoc.setNewprice(courseData.getNewprice());
        khoaHoc.setTag1(courseData.getTag1());
        khoaHoc.setTag2(courseData.getTag2());
        khoaHoc.setImageCourse(courseData.getImageCourse());
        khoaHoc.setImageTeacher(courseData.getImageTeacher());
        khoaHoc.setDecription(courseData.getDecription());

        return courseRepository.save(khoaHoc);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);
    }
}
