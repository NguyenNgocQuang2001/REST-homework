import fetch from "node-fetch";
import ReadLine from "readline";
const reader = ReadLine.createInterface({
    input: process.stdin,
    output: process.stdout
});

reader.question("nhap bieu thuc : ", data => {

    data = data.split(" ");
    var a = data[0];
    var b = data[2];
    var operator = encodeURIComponent(data[1]);

    fetch(`http://localhost:8080/calculator?a=${a}&b=${b}&operator=${operator}`, {

        method : 'GET',
        headers: {
            'Content-Type': 'application/json',
        }
    })
    .then(result => {

        return result.json();
    })
    .then(result => {
        console.log(result);
    })
    .catch(err => {
        
        console.log("loi");
    });

    reader.close();
});