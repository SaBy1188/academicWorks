import { Programmierer } from './Programmierer.js';

let programmierer1 = new Programmierer("Cody","JavaScript");
console.log(programmierer1.gruss());
console.log(programmierer1.laune());

let programmierer2 = new Programmierer("Claude",["COBAL","Clojure"]);
console.log(programmierer2.gruss());
console.log(programmierer2.laune());


programmierer1.auftrag("Website Optimierung","JavaScript",(erfolgreich) => {
    if (erfolgreich) {
        console.log("Sie haben den Auftrag erfolgreich abgeschlossen.");
    } else {
        console.log("Sie haben den Auftrag nicht abgeschlossen.");
    }
});