// Step 1
import { Component } from '@angular/core';

// Step 2
import { Person } from "./person";
import { PERSONS } from "../mock-persons";

// Step 4
import { OnInit } from "@angular/core";
import { PersonsService } from "./persons.service";
import { MessageService } from "../message/message.service";
import { Observable } from "rxjs";


// Step 1
// Component: standardmäßig in der component.ts Klasse vorhanden; wird importiert aus Angular Bibliothek; Decorator Funktion
@Component({
  selector: 'app-persons',                   // The component's CSS element selector.
  templateUrl: './persons.component.html',   // The location of the component's template file.
  styleUrls: ['./persons.component.css']     // The location of the component's private CSS styles.
})

export class PersonsComponent implements OnInit {
  // Step 1
  /*person: Person = {
    id: 1,
    name: 'Mike Myers'
  };*/

  // Step 2
  // persons = PERSONS;

  // Step 2 & 4
  // selectedPerson?: Person;
  /*onSelect(person: Person): void {
    this.selectedPerson = person;
    // Step 4
    this.messageService.add(`PersonsComponent: Selected person id=${person.id}`);
  }*/

  // Step 4 & 5
  persons: Person[] = [];

  // Step 5
  constructor(private personService: PersonsService) { } //, private messageService: MessageService) { }
  ngOnInit(): void {
    this.getPerson();
  }
  getPerson(): void {
    this.personService.getPersons()
      .subscribe(persons => this.persons = persons);
    // Step 4
    // let personsObservable: Observable<Person[]> = this.personService.readPersons();
    // personsObservable.subscribe(persons => this.persons = persons);
  }
}
