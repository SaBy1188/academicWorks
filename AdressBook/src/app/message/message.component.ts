// Step 4
import { Component } from '@angular/core';
import { MessageService } from "./message.service";

@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent {
  // Step 4
  constructor(public messageService: MessageService) {}
}
