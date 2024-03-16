let btn1 = document.querySelector ("clickbth");
let showclicks = documet.querySelector ("showdata");
let counter = 0;

function printClick() {
    counter++;
    console.log (Hiciste click en el boton)
    showclicks.innerHtml = "Numero de clicks: " + counter;
}

btn1.addEventListener("click", printClick);