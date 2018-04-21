function printLines(arr) {
    let outputArray = [];

    for (let obj of arr) {
        if(obj === 'Stop'){
            break;
        }

        outputArray.push(obj);
    }

    for (let obj of outputArray) {
        console.log(obj);
    }
}

printLines(['Line 1',
    'Line 2',
    'Line 3',
    'Stop'
]);
printLines(['3',
    '6',
    '5',
    '4',
    'Stop',
    '10',
    '12',
]);