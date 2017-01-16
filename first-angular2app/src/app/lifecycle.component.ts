import { Component, OnChanges,
 OnInit, DoCheck, AfterContentInit, 
 AfterContentChecked, AfterViewInit, 
 AfterViewChecked, OnDestroy, Input, ViewChild, ContentChild  } from '@angular/core';

 @Component({
  selector: 'app-lifecycle',
  template: `
    <hr>
    <h4>Component Life Cycle testing!</h4>
    <ng-content></ng-content>
    <p #boundParagraph>{{bindable}}</p>
    <p>{{boundParagraph.textContent}}</p>
  `,
  styles: []
})
 export class LifecycleComponent implements OnChanges,OnInit,
 DoCheck, AfterContentInit, 
 AfterContentChecked, AfterViewInit, 
 AfterViewChecked, OnDestroy {

  @ContentChild('boundContent')
  boundContentOutSideTemplate: HTMLElement;

  @ViewChild('boundParagraph')
  boundParagraphOutSideTemplate: HTMLElement;

  @Input() bindable = 1000;
  constructor() { }
  ngOnChanges(){
    this.log('ngOnChanges');
  }
  
  ngOnInit() {
     this.log('ngOnInit');
  }

  ngDoCheck(){
     this.log('ngDoCheck');
  }

  ngAfterContentInit(){
     this.log('ngAfterContentInit');
  }

  ngAfterContentChecked(){
     this.log('ngAfterContentChecked');
     console.log(this.boundContentOutSideTemplate);
  }

  ngAfterViewInit(){
     this.log('ngAfterViewInit');
     console.log(this.boundParagraphOutSideTemplate);
  }

  ngAfterViewChecked(){
     this.log('ngAfterViewChecked');
  }

  ngOnDestroy(){
     this.log('ngOnDestroy');
  }

  private log(hook: string){
    console.log(hook);
  }


}
