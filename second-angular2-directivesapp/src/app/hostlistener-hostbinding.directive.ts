import { Directive, HostListener, HostBinding, ElementRef, Renderer } from '@angular/core';

@Directive({
	selector: '[dirHostListenerhostBinding]'
})
export class HostListenerhostBindingDirective {

	//there are two ways we can do the change in UI 
	//1.) using HostBinding(setting the value to the element 
	// /HostListener(Listen to the event change and apply your changes on the element )
	//2.) using constructor/HostListener -setting up the setter method in constructor using renderer
	// and then in the hostlistener apply your changes via renderer.
	constructor(private elementRef: ElementRef, private renderer: Renderer) { 
		this.renderer.setElementStyle(this.elementRef.nativeElement, 
			'border', '3px solid red');
		// this.renderer.setElementStyle(this.elementRef.nativeElement, 
		// 	'backgroundColor', 'white');
	}

	@HostListener('mouseover') mouseover(){
		this.backgroundColor='green';
		// this.renderer.setElementStyle(this.elementRef.nativeElement, 
		// 	'backgroundColor', 'green');
	}
  // Just a test
  // @HostListener('mouseenter') mouseenter(){
  // 	this.backgroundColor='red';
  // }

  @HostBinding('style.backgroundColor') get setColor(){
  	return this.backgroundColor;
  }

  @HostListener('mouseleave') mouseleave(){
  	this.backgroundColor= 'white';
  	//this.renderer.setElementStyle(this.elementRef.nativeElement, 
  	// 	'backgroundColor', 'white');
  }

  @HostListener('click', ['$event'])
  onClick(event) {
    console.log("Event Target" + event.target);
    window.alert('Hi');
  }

  
  private backgroundColor= 'white';
}
