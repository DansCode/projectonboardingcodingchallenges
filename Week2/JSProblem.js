function shift(number, power) {
    return Math.floor(number/Math.pow(2,power));
}

document.write(shift(80,3)+"<br>");
document.write(shift(-24,2)+"<br>");
document.write(shift(-5,1)+"<br>");
document.write(shift(4666,6)+"<br>");
document.write(shift(3777,6)+"<br>");
document.write(shift(-512,10)+"<br>");