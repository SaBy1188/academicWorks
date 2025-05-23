// Step 4
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class MessageService {
  // Step 4
  messages: string[] = [];
  add(message: string) {
    this.messages.push(message);
  }
  clear() {
    this.messages = [];
  }
}
