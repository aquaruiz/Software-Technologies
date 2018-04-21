function turnObjectIntoJSONString(arr) {
    let json = {};

    for (let obj of arr) {
        let current = obj.split(' -> ');
        let key = current[0];
        let value = current[1];
        if(!isNaN(value)){
            value = Number(value);
        }
        json[key]=value;
    }

    let output = JSON.stringify(json);
    console.log(output);
}

turnObjectIntoJSONString([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);