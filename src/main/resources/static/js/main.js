let validationValue;

//FINALLY after trials
let luhnCheck = (function(arr) {
    return function(ccNum) {
        let
            len = ccNum.length,
            bit = 1,
            sum = 0,
            val;

        while (len) {
            val = parseInt(ccNum.charAt(--len), 10);
            sum += (bit ^= 1) ? arr[val] : val;
        }

        return sum && sum % 10 === 0;
    };
}([0, 2, 4, 6, 8, 1, 3, 5, 7, 9]));

function cardNumberValidation(cardNumber) {
    if (luhnCheck(cardNumber) === true) {
        validationValue = true;
    } else {
        validationValue = false;
        alert("Not a valid credit/debit card number!");
    }
}




function submitError() {
    if (validationValue === false){
        alert("Check your credit card number. Make sure its valid then try again");
    }

}
function mySubmitFunction(e) {
    if (validationValue === false){
        e.preventDefault();
        submitError();
        return false;
    }else {
        return true;
    }

}