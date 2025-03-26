class CallbackTorsten {

    constructor(lerngruppe) {
        this.lerngruppe = lerngruppe;
    }

    aufTorstenPruefen(lerngruppe, callback) {
        if (Kurs.Trainer === "Torsten" && Kurs.Lerngruppe === "PPI Academy") {
                callback(true);
            } else {
            callback(false);
        }
    }
}

const Kurs = {
    Trainer: "Torsten",
    Lerngruppe: "PPI Academy"
};

