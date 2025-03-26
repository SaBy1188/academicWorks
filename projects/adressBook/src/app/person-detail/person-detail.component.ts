// Step 3
import { Component, Input, OnInit } from "@angular/core";
import { Person } from '../persons/person';

// Step 5
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { PersonsService } from '../persons/persons.service';


// Step 3
@Component({
  selector: 'app-person-detail',
  templateUrl: './person-detail.component.html',
  styleUrls: ['./person-detail.component.css']
})
export class PersonDetailComponent implements OnInit {
  // Step 3
  //@Input() person?: Person;

  // Step 5
  person: Person | undefined;
  constructor(
    private route: ActivatedRoute,
    private personService: PersonsService,
    private location: Location
  ) {}

  ngOnInit(): void {
    this.getPerson();
  }
  getPerson(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.personService.readPerson(id)
      .subscribe(person => this.person = person);
  }
  goBack(): void {
    this.location.back();
  }
}
