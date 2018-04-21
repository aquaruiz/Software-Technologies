function setValuesToIndexesInArray (arr) {
    let arrLength = Number(arr.shift());
    let outputArray = new Array(arrLength).fill(0);

    for (let obj of arr) {
        let nums = obj.split(' - ');
        let index = Number(nums[0]);
        let value = Number(nums[1]);

        outputArray[index] = value;
    }

    for (let obj of outputArray) {
        console.log(obj);
    }
    console.log();
}

setValuesToIndexesInArray([
    '3',
    '0 - 5',
    '1 - 6',
    '2 - 7'
]);
setValuesToIndexesInArray([
    '2',
    '0 - 5',
    '0 - 6',
    '0 - 7'
]);
setValuesToIndexesInArray([
    '5',
    '0 - 3',
    '3 - -1',
    '4 - 2'
]);