import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

import {
  ReactiveFormsModule,
  FormBuilder,
  FormGroup,
  Validators,
  AbstractControl,
  ValidationErrors,
  FormArray,
  FormControl
} from '@angular/forms';

@Component({
  selector: 'app-reactive-enrollment-form',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule
  ],
  templateUrl: './reactive-enrollment-form.html',
  styleUrl: './reactive-enrollment-form.css'
})
export class ReactiveEnrollmentForm implements OnInit {

  enrollForm!: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {

    this.enrollForm = this.fb.group({

      studentName: [
        '',
        [
          Validators.required,
          Validators.minLength(3)
        ]
      ],

      studentEmail: this.fb.control(
        '',
        [
          Validators.required,
          Validators.email
        ],
        [
          this.simulateEmailCheck.bind(this)
        ]
      ),

      courseId: [
        '',
        [
          Validators.required,
          this.noCourseCode
        ]
      ],

      preferredSemester: [
        'Odd',
        Validators.required
      ],

      agreeToTerms: [
        false,
        Validators.requiredTrue
      ],

      additionalCourses: this.fb.array<FormControl>([])
    });

  }

  submitForm() {

    console.log("Form Value");
    console.log(this.enrollForm.value);

    console.log("Raw Value");
    console.log(this.enrollForm.getRawValue());

  }

  noCourseCode(control: AbstractControl): ValidationErrors | null {

    const value = control.value;

    if (value && value.startsWith("XX")) {

      return {
        noCourseCode: true
      };

    }

    return null;

  }

  simulateEmailCheck(control: AbstractControl): Promise<ValidationErrors | null> {

    return new Promise(resolve => {

      setTimeout(() => {

        if (control.value && control.value.includes("test@")) {

          resolve({
            emailTaken: true
          });

        } else {

          resolve(null);

        }

      }, 800);

    });

  }

  get additionalCourses(): FormArray<FormControl> {

    return this.enrollForm.get('additionalCourses') as FormArray<FormControl>;

  }

  addCourse() {

    this.additionalCourses.push(

      new FormControl<string>('', {
        nonNullable: true,
        validators: [Validators.required]
      })

    );

  }

  removeCourse(index: number) {

    this.additionalCourses.removeAt(index);

  }

}