import { Directive, TemplateRef, ViewContainerRef, Input } from '@angular/core';

@Directive({
	selector: '[dirMycustomdirectiveUnless]'
})
export class MycustomdirectiveUnlessDirective {

	@Input() set dirMycustomdirectiveUnless(condition: Boolean){
		if(!condition){
			this.vcRef.createEmbeddedView(this.templateRef);
		}else{
			this.vcRef.clear();
		}

	}
	constructor(private templateRef: TemplateRef<any>, private vcRef: ViewContainerRef) { }

}
