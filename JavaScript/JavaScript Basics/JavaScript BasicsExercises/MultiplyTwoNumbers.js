function multiplyTwoNumbers(arr) {
    let nums = arr[0].split("\n");
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);
    let result = num1 * num2;

    console.log(result);
}

multiplyTwoNumbers(['2\n3\n']);
multiplyTwoNumbers(['13\n13\n']);
multiplyTwoNumbers(['1\n2\n']);
multiplyTwoNumbers(['0\n50\n']);
