function productOf3Numbers(arr) {
    let nums = arr;

    let product = '';
    let counter = 0;

    for (let num of nums) {
        if (num < 0){
            counter++;
        }

        if(num === 0){
            product = 'Positive';
        }
    }

    if(!product){
        if(counter % 2 === 0 && counter > 0){
            product = 'Positive';
        } else if(counter % 2 === 1){
            product = 'Negative';
        } else  if(counter === 0){
            product = 'Positive';
        }
    }

    console.log(product);
}

productOf3Numbers(['2',
    '3',
    '-1'
]);
productOf3Numbers(['5',
    '4',
    '3'
]);
productOf3Numbers(['-3',
    '-4',
    '5'
]);
