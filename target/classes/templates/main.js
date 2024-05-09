//selecciono los elementos
const display = document.querySelector(".display");
const buttons = document.querySelectorAll(".btn"); 

buttons.forEach(btn => {
    btn.addEventListener("click",() => { 
        const buttonPressed = btn.textContent; // texto del boton

        //reset del display
        if(btn.id === "c"){
            display.textContent = "0";
            return //uso lo return para que no me lo escriba
        }

        if(btn.id === "borrar"){
            if(display.textContent.length === 1 || display.textContent === "Error"){ //para que no me vacia o sobreescriba el error
                display.textContent = "0"
            }else{
                display.textContent = display.textContent.slice(0,-1) //Metodo de arrays, uso -1 para contar desde atras
            }
            return;
        }

        if (btn.id === "igual"){ //evaluo cuando presionen el igual
            try{
                display.textContent = eval(display.textContent);
            } catch {
                display.textContent = "Error";
            }
            return;
        }

        //escribo en pantalla
        if(display.textContent === "0" || display.textContent === "Error"){
            display.textContent = buttonPressed;
        } else {
            display.textContent += buttonPressed;
        }

        //faltararia evaluar si se presiona nuevamente el igual (-> que vuelva a 0)
    })
})