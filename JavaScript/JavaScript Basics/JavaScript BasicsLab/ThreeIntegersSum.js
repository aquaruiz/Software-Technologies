function solver(arr) {
    let input = [];
    input = arr[0].split(" ");
    let num1 = Number(input[0]);
    let num2 = Number(input[1]);
    let num3 = Number(input[2]);

    if(num1 + num2 === num3){
        if(num1 < num2){
            console.log(num1 + " + " + num2 + " = " + num3);
        } else {
            console.log(num2 + " + " + num1 + " = " + num3);
        }
    } else if(num1 + num3 === num2){
        if(num1 < num3){
            console.log(num1 + " + " + num3 + " = " + num2);
        } else {
            console.log(num3 + " + " + num1 + " = " + num2);
        }
    } else if(num2 + num3 === num1){
        if(num2 < num3){
            console.log(num2 + " + " + num3 + " = " + num1);
        } else {
            console.log(num3 + " + " + num2 + " = " + num1);
        }
    }else {
        console.log('No');
    }
}

solver(['3 8 12']);