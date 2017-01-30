import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { HightlightDirectiveDirective } from './hightlight-directive.directive';
import { HostListenerhostBindingDirective } from './hostlistener-hostbinding.directive';
import { HighlightDirectivePropertyBindingDirective } from './highlight-directive-property-binding.directive';

@NgModule({
  declarations: [
    AppComponent,
    HightlightDirectiveDirective,
    HostListenerhostBindingDirective,
    HighlightDirectivePropertyBindingDirective
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
