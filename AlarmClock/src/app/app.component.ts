import { Component, OnInit } from '@angular/core';
import {Person} from "./person";

@Component({    // Decorator Pattern
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  title = 'Alarm Clock'
  counter = 0;
  name = 'Master of Unicorns';
  persons: Person[] = [
    { name: 'Mini-Mee', id: '188493J90S'},
    { name: 'Major King', id: '2847H28I83'},
  ];

  public ngOnInit() {
    // ngOn Methoden werden der Reihe nach ausgeführt; lifecycle hooks
    setInterval(() => {
      this.counter++
      },200);
  }

  resetCounter() {
    this.counter = 0;
  }
}
