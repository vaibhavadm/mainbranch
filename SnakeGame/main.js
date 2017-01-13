$(document).ready(function(){
	//Canvas stuff
	var canvas = $("#canvas")[0];// same as document.getElementById('canvas') in vanilla JS.
	// returns the DOM node, which has access to DOM methods, but not jQuery methods.

	var ctx = canvas.getContext("2d");// The getContext() method is default methd in HTMLObject 
	//that provide properties and methods for drawing.
	
	var w = $("#canvas").width(); // gets the width of the canvas object defined in HTML File i.e. 200
	var h = $("#canvas").height(); // gets the height of the canvas object defined in HTML File i.e. 100
	
	//Lets paint the canvas now
	ctx.fillStyle= "white"; // fill the canvas gadiant with white color

	//giving the rectangle a Gradient stroke and setting the same dimentions for alignment 
	var gradient = ctx.createLinearGradient(0, 0, w, h);
	//adding colors to gradient
	gradient.addColorStop("0", "magenta");
	gradient.addColorStop("0.5", "blue");
	gradient.addColorStop("1.0", "red");

	//removing this because of adding Gradient
	//ctx.fillRect(0, 0, w, h);
	 // referes to context.fillRect(x,y,width,height);
	// x being the X co-ordinate of the rectangle's upper-left corner here 0
	// y being the y co-ordinate of the rectangle's upper-left corner here 0
	// Width of the rectangle in pixels
	// Height of the rectangle in pixels

	//Assign Gradient to the context stroke adding color
	ctx.strokeStyle = gradient; 

	ctx.strokeRect(0, 0, w, h);
	
	//Lets create the snake now
	var snake_array; //an array of cells to make up the snake
	
	function create_snake()
	{
		var length = 5; //Length of the snake
		snake_array = []; //Empty array to start with
		for(var i = length-1; 
	}
})