import { Directive, HostListener, HostBinding, Input , OnInit} from '@angular/core';

@Directive({
  selector: '[dirHighlightDirectivePropertyBinding]'
})
export class HighlightDirectivePropertyBindingDirective {

  constructor() { }

  @HostListener('mouseenter') mouseover(){
  	this.backgroundColor=this.highlightColor;
  }

  @HostBinding('style.backgroundColor') get setColor(){
  	return this.backgroundColor;
  }

  @HostListener('mouseleave') mouseleave(){
  	this.backgroundColor = this.defaultColor;
  }

  @Input() defaultColor : string;
  @Input('dirHighlightDirectivePropertyBinding') highlightColor= 'green';
  private backgroundColor = this.defaultColor;

  ngOnInit(){
  	this.backgroundColor=this.defaultColor;
  }
}
