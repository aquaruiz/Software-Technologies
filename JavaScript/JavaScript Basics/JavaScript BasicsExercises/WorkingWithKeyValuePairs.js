function workingWithKeyValuePairs(arr) {
    let commandKey = arr.pop();
    let output = {};

    for (let obj of arr) {
        let current = obj.split(' ');
        let key = current[0];
        let value = current[1];
        output[key] = value;
    }

    if(output.hasOwnProperty(commandKey)){
        console.log(output[commandKey]);
    }else {
        console.log('None');
    }
}

workingWithKeyValuePairs([
    'key value',
    'key eulav',
    'test tset',
    'key']);
workingWithKeyValuePairs([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4']);
workingWithKeyValuePairs([
    '3 bla',
    '3 alb',
    '2']);