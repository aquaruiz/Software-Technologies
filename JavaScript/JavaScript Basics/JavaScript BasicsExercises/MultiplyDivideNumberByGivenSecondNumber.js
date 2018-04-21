function multiplyDivideNumberByGivenSecondNumber(arr) {
    let nums = arr[0].split('\n');
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);

    let result = 0;

    if(num1 > num2){
        result = num1 / num2;
    }else {
        result = num1 * num2;
    }

    console.log(result);
}

multiplyDivideNumberByGivenSecondNumber(['2\n3']);
multiplyDivideNumberByGivenSecondNumber(['13\n13']);
multiplyDivideNumberByGivenSecondNumber(['3\n2']);
multiplyDivideNumberByGivenSecondNumber(['144\n12']);
