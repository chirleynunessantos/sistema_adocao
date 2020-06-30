/**
 * 
 */

var intervalo = 2000;

function slide1(){
	document.getElementById("banner").src = "dog.jpg"
	setTimeout("slide2()", intervalo);

}

function slide2(){
	document.getElementById("banner").src = "dog2.jpg"
	setTimeout("slide3()", intervalo);

}

function slide3(){
	document.getElementById("banner").src = "dog3.png"

	setTimeout("slide1()", intervalo);
}