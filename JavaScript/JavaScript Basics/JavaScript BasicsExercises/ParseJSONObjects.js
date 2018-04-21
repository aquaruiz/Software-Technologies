function parseJSONObjects(arr) {
    let output = new Array();

    for (let obj of arr) {
        let current = JSON.parse(obj);
        output.push(current);
    }

    for (let student of output) {
            console.log(`Name: ${student.name}`);
            console.log(`Age: ${student.age}`);
            console.log(`Date: ${student.date}`);
    }
}

parseJSONObjects([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);