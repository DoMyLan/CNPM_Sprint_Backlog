const tiltle =document.querySelector('.title h1')

const letter ='Welcome !'
var index =0

setInterval(() => {
    tiltle.textContent+=letter[index]
    index++
    if(index == letter.length+1){
        index=0
        tiltle.textContent=''
    }
}, 500)