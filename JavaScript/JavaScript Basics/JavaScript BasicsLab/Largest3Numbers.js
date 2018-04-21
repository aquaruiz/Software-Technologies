function solver(arr) {
    let nums = arr.map(Number);
    let numSorted = nums.sort((a, b) => b - a);
    let count = Math.min(3, arr.length);

    for(let i = 0; i < count; i++){
        console.log(numSorted[i]);
    }
}

solver(['10',
    '30',
    '15',
    '20',
    '50',
    '5'
]);