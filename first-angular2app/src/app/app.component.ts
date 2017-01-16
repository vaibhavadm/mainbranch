import { Component } from '@angular/core';

@Component({
	selector: 'app-root',
	template: `
	<h1> Root Component </h1>
	<fa-another></fa-another>
	<app-databinding></app-databinding>
	<app-lifecycle *ngIf="!delete" [bindable] = "boundValue">
		<p #boundContent>{{test}}</p>
	</app-lifecycle>
	<button (click)="delete = true">Click here to Delete</button>
	<button (click)="test = 'Changed Value'">Click here to Change Content</button>
	<button (click)="boundValue = 2000">Click here to Change Binding </button>
	<br><br><br><br>
	`
})
export class AppComponent {
	boundValue = 1000;
	delete=false;
	test = 'Starting Value';
} 
