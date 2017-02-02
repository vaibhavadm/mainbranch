import { Directive , HostBinding, HostListener} from '@angular/core';

@Directive({
	selector: '[rbDropdownDirective]'
})
export class DropdownDirectiveDirective {
	//class.open is a bootstrap default class
	@HostBinding('class.open') get opened(){
		return this.isOpen;
	}

	@HostListener('mouseenter') open(){
		 this.isOpen = true;
	}

	@HostListener('mouseleave') close(){
		 this.isOpen = false;
	}

	private isOpen = false;
}
