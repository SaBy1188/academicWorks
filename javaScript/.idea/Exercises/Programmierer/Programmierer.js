import { Mensch } from './Mensch.js';
export { Programmierer };

class Programmierer extends Mensch {
    constructor(name, programmiersprache) {
        super(name);
        this.programmiersprache = programmiersprache;
    }

    gruss() {
        return super.gruss() + " And I code with: " + this.programmiersprache;
    }

    laune(laune) {
        if (this.programmiersprache.includes("JavaScript")) {
            return "Arrrrrgh like JavaScript";
        } else if (this.programmiersprache.includes("Python")) {
            return "Python is sssssss*&%";
        } else if (this.programmiersprache.includes("COBAL")) {
            return "01110101 01101110 01101000 01100001 01110000 01110000 01111001";
        } else if (this.programmiersprache.includes("Clojure")) {
            return "Yalla. Clojure.";
        }
    }

    auftrag(aufgabentext, programmiersprache, callback) {
        if (this.programmiersprache.includes(programmiersprache)) {
            setTimeout(() => {
                callback(true);
            }, 5000);
        } else {
            setTimeout(() => {
                callback(false);
            }, 1000);
        }
    }
}