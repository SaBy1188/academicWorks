import { Injectable } from '@angular/core';
import { Person } from './person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {
  private persons: Person[] = [];

  constructor() {}

  getPersons(): Person[] {
    return this.persons;
  }

  addPerson(person: Person) {
    this.persons.push(person);
  }
}
