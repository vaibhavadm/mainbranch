import { Directive, ElementRef,Renderer } from '@angular/core';

@Directive({
	selector: '[dirHightlightDirective]'
})
export class HightlightDirectiveDirective {

	constructor(private elementRef:ElementRef, private renderer:Renderer) {
		//this.elementRef.nativeElement.style.backgroundColor='green';
		this.renderer.setElementStyle(this.elementRef.nativeElement, 'backgroundColor', 'green');
		this.renderer.setElementStyle(this.elementRef.nativeElement, 'border', '3px solid red');
	 }

}
