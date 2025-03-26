import { Component, OnInit } from '@angular/core';
import { Person } from '../persons/person';
import { PersonsService } from '../persons/persons.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: [ './dashboard.component.css' ]
})
export class DashboardComponent implements OnInit {
  persons: Person[] = [];

  constructor(private personService: PersonsService) { }

  ngOnInit(): void {
    this.getPersons();
  }

  getPersons(): void {
    this.personService.getPersons()
      .subscribe(persons => this.persons = persons.slice(1, 5));
  }
}
