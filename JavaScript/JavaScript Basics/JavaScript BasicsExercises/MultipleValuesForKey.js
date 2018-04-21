function multipleValuesForKey(arr) {
    let commandKey = arr.pop();
    let output = {};

    for (let obj of arr) {
        let current = obj.split(' ');
        let key = current[0];
        let value = current[1];

        if(!output.hasOwnProperty(key)){
            output[key] = new Array();
            output[key].push(value);
        }else {
            output[key].push(value);
        }
    }

    if(output.hasOwnProperty(commandKey)){
        for (let obj of output[commandKey]) {
            console.log(obj);
        }
    }else {
        console.log('None');
    }
}


multipleValuesForKey([
    'key value',
    'key eulav',
    'test tset',
    'key']);
multipleValuesForKey([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4']);
multipleValuesForKey([
    '3 bla',
    '3 alb',
    '2']);