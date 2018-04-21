function printNumbersInReversedOrder(arr) {
    let outputArray = [];
    for (let obj of arr) {
        outputArray.push(obj);
    }

    outputArray = outputArray.reverse();
    for (let obj of outputArray) {
        console.log(obj);
    }
}

printNumbersInReversedOrder([
    '10',
    '15',
    '20'
]);printNumbersInReversedOrder([
    '5',
    '5.5',
    '24',
    '-3'
]);
printNumbersInReversedOrder([
    '20',
    '1',
    '20',
    '1',
    '20'
]);