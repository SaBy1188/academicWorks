// Step 4
import { Injectable } from '@angular/core';
import { Observable, of } from "rxjs";

import { Person } from './person';
import { PERSONS } from '../mock-persons';
import { MessageService } from '../message/message.service';

// Step 4
@Injectable({
  providedIn: 'root'
})
export class PersonsService {

  // Step 4
  constructor(private messageService: MessageService) { }
  getPersons(): Observable<Person[]> {
    const persons = of(PERSONS);
    this.messageService.add('PersonsService: fetched persons');
    return persons;
  }

  // Step 5
  readPerson(id: number): Observable<Person> {
    // For now, assume that a hero with the specified `id` always exists.
    // Error handling will be added in the next step of the tutorial.
    const person = PERSONS.find(p => p.id === id)!;
    this.messageService.add(`PersonService: fetched person id=${id}`);
    return of(person);
  }
}
