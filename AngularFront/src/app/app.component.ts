import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  title = 'AngularFront';
  constructor(private employeeService : EmployeeService,
){ }
  deleteAll(){
    this.employeeService.deleteAll().subscribe();

  }
}
