function addRemoveElements(arr) {
    let outputArray = [];

    for (let kvp of arr) {
        let current = kvp.split(' ');
        let command = current[0];

        switch (command){
            case 'add':
                let numToAdd = current[1];
                outputArray.push(numToAdd);
                break;
            case 'remove':
                let indexToRemoveAt = current[1];
                outputArray.splice(indexToRemoveAt, 1);
                break;
        }
    }

    for (let num of outputArray) {
        console.log(num);
    }
}

addRemoveElements([
    'add 3',
    'add 5',
    'add 7'
]);
addRemoveElements([
    'add 3',
    'add 5',
    'remove 1',
    'add 2'
]);
addRemoveElements([
    'add 3',
    'add 5',
    'remove 2',
    'remove 0',
    'add 7'
]);
