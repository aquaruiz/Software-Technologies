function storingObjects(arr) {
    let output = new Array();

    for (let student of arr) {
        let current = student.split(' -> ');
        let name = current[0];
        let age = Number(current[1]);
        let grade = Number(current[2]);

        output.push({
            Name: name,
            Age: age,
            Grade: grade
        });
    }

    for (let student of output) {
        console.log(`Name: ${student.Name}`);
        console.log(`Age: ${student.Age}`);
        console.log(`Grade: ${student.Grade.toFixed(2)}`);
    }
}

storingObjects(['Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);