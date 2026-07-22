import { Component, OnInit,  ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard, Course } from '../../components/course-card/course-card';
import { HighlightDirective } from '../../directives/highlight';


@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard, HighlightDirective],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {
  isLoading = true;

  courses: Course[] = [
    { id: 1, name: 'Intro to Angular', code: 'CS101', credits: 3, gradeStatus: 'passed' },
    { id: 2, name: 'Data Structures', code: 'CS201', credits: 4, gradeStatus: 'failed' },
    { id: 3, name: 'Database Systems', code: 'CS301', credits: 3, gradeStatus: 'pending' },
    { id: 4, name: 'Operating Systems', code: 'CS302', credits: 4, gradeStatus: 'passed' },
    { id: 5, name: 'Web Development', code: 'CS401', credits: 1, gradeStatus: 'pending' }
  ];

  selectedCourseId: number | null = null;
  constructor(private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    setTimeout(() => {
      this.isLoading = false;
      this.cdr.detectChanges();
    }, 1500);
  }
  trackByCourseId(index: number, course: Course): number {
    return course.id;
  }

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }
}