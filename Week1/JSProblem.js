function ish(input) {
    input = input.toString();
    let count = 0;

    for (let i = 0; i<input.length; i++) {
        count += parseInt(input.charAt(i));
    }

    if (count%2 == 1) {
        return "Oddish";
    } else {
        return "Evenish"
    }
}

const a = [43,373,4433];

for (const b of a) {
    document.write(ish(b)+"<br>");
}