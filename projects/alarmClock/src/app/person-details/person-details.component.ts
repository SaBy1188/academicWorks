import { Component, Input, OnInit } from '@angular/core';
import { Person } from "../person";

@Component({
  selector: 'app-person-details',
  templateUrl: './person-details.component.html',
  styleUrls: ['./person-details.component.css']
})
export class PersonDetailsComponent implements OnInit {

  @Input()
  persona!: Person;

  ngOnInit() {
  }
}
