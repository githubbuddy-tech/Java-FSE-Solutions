import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  courses = [

    { id: 1, name: 'Angular', code: 'ANG101', credits: 4 },

    { id: 2, name: 'Java', code: 'JAVA201', credits: 3 },

    { id: 3, name: 'Python', code: 'PY301', credits: 4 },

    { id: 4, name: 'Spring Boot', code: 'SB401', credits: 5 },

    { id: 5, name: 'SQL', code: 'SQL501', credits: 2 }

  ];

  selectedCourseId = 0;

  onEnroll(courseId: number) {

    console.log("Enrolling in course: " + courseId);

    this.selectedCourseId = courseId;

  }

}