function solver(arr) {
    let n = Number(arr);
    for(let i = 1; i <= n; i++){
        let current = i.toString().split("").reverse().join("");
        if(i == current){
            console.log(i);
        }
    }
}

solver(100);