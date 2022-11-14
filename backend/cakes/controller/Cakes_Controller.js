const { getCakes, getSpecifisCake } = require("../service/Cakes_Service");

const getCakesMenu = async (req, res, next) => {
    await getCakes()
        .then((response) => {
            console.log(`Cake controller getCakes: ${response}`);
            res.status(200).send({ response });
        }).catch((err) => {
            console.log(`Cake controller getCakes: ${err}`);
            res.status(500).send("Error occured during getting cakes menu!");
        });
};

const getCake = async (req, res, next) => {
    /**TODO:
     * implement this method
     */
    console.log("Cake controller getCake...");
    res.status(200).send({ msg: "getCake controller response" });

};

module.exports = {
    getCakesMenu,
    getCake
}