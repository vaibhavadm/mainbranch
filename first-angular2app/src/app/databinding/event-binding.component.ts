import { Component, EventEmitter,Output } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  template: `
  <button (click)="onClickme()">Click me!</button>
  <button (click)="onClicked()">Click me custom Event!</button>
  `,
  styles: []
})
export class EventBindingComponent {
  @Output() clicked = new EventEmitter<string>();
  onClicked(){
    this.clicked.emit('It Worked!');
  }
  onClickme(){
    alert('It Worked!');
  }
}
