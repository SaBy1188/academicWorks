// Step 1
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";                                     // NgModule

import { AppComponent } from './app.component';
import { PersonsComponent } from './persons/persons.component';

// Step 3
import { PersonDetailComponent } from './person-detail/person-detail.component';

// Step 4
import { MessageComponent } from './message/message.component';

// Step 5
import { DashboardComponent } from './dashboard/dashboard.component';
import { AppRoutingModule } from './app-routing/app-routing.module';


@NgModule({
  declarations: [
    AppComponent,
    PersonsComponent,

    // Step 3
    PersonDetailComponent,

    // Step 4
    MessageComponent,

    // Step 5
    DashboardComponent
  ],
  imports: [
    // Step 3
    BrowserModule,
    FormsModule,

    // Step 5
    AppRoutingModule
  ],
  // providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
