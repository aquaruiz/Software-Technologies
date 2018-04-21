const Calculator = require('../models/Calculator');

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },

    indexPost: (req, res) => {
        let calculatorBody = req.body;
        let calculatorParams = calculatorBody['calculator'];
        let lamp = false;
        let calculator = new Calculator();

        if(!isNaN(calculatorParams.leftOperand) && !isNaN(calculatorParams.rightOperand)){
            calculator.leftOperand = Number(calculatorParams.leftOperand);
            calculator.rightOperand = Number(calculatorParams.rightOperand);
            calculator.operator = calculatorParams.operator;
            lamp = true;
        }

        let result ='';
        if(lamp === true){
            result = calculator.calculateResult();
        } else {
            result = "Don't mess with the system!";
        }

        res.render('home/index', {'calculator': calculator, 'result': result});
    }
};