import { Component, OnInit, EventEmitter, Output } from '@angular/core';

import { Recipe } from '../recipe';

@Component({
	selector: 'rb-recipe-list',
	templateUrl: './recipe-list.component.html'
})
export class RecipeListComponent implements OnInit {

	recipes: Recipe[] = [new Recipe('Indian Biryani', 'Very tasty and spicy' , 'http://img1.rapidleaks.com/2016/10/Krish_023-Hyderabad-Mutton-Biryani-web.jpg',[]),
							 new Recipe('American Burger', 'Okayish', 'http://cookdiary.net/wp-content/uploads/images/Chicken-Burgers.png',[])];
	
	@Output() recipeSelected = new EventEmitter<Recipe>();
	constructor() { }

	ngOnInit() {
	}

	onSelected(recipe: Recipe){
		this.recipeSelected.emit(recipe);
	}

}
