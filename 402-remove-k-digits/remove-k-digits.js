/**
 * @param {string} num
 * @param {number} k
 * @return {string}
 */
var removeKdigits = function(num, k) {
    stack = [];

    for(let digit of num){
        while(stack.length>0 && k>0 && stack[stack.length-1]>digit){
            stack.pop();
            k--;
        }
        stack.push(digit);
    }

    if (k > 0) {
        stack = stack.slice(0, -k);
    }

        let result = stack.join('').replace(/^0+/, '');
    
    // Handle edge case where result might be empty
    return result || '0';
};